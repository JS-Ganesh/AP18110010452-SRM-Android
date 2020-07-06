package com.example.inputcontroltest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText et_name,et_mobile,et_email,et_password;
    TextView tv;
    CheckBox c_java,c_android,c_webdesign;
    RadioButton r_male,r_female;
    String gender;
    Spinner sp_district,sp_mandal;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et_name = findViewById(R.id.name);
        et_mobile = findViewById(R.id.mobile);
        et_email = findViewById(R.id.email);
        et_password = findViewById(R.id.password);
        r_male = findViewById(R.id.male);
        r_female = findViewById(R.id.female);
        c_java = findViewById(R.id.java);
        c_webdesign = findViewById(R.id.webdesign);
        c_android = findViewById(R.id.android);
        sp_district = findViewById(R.id.district);
        sp_mandal = findViewById(R.id.mandal);
        tv = findViewById(R.id.result);

        ArrayAdapter<CharSequence> district_Adapter = ArrayAdapter.createFromResource(MainActivity.this, R.array.districts, android.R.layout.simple_spinner_item);
        sp_district.setAdapter(district_Adapter);

        sp_district.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i) {
                    case 0:
                        Toast.makeText(MainActivity.this, "Please select District", Toast.LENGTH_SHORT).show();

                    case 1:
                        ArrayAdapter<CharSequence> atp_Mandals = ArrayAdapter.createFromResource(MainActivity.this, R.array.Anantapur_Mandals, android.R.layout.simple_spinner_item);
                        sp_mandal.setAdapter(atp_Mandals);
                        break;

                    case 2:
                        ArrayAdapter<CharSequence> knl_Mandals = ArrayAdapter.createFromResource(MainActivity.this, R.array.Kurnool_Mandal, android.R.layout.simple_spinner_item);
                        sp_mandal.setAdapter(knl_Mandals);
                        break;

                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

    }

    public void submit(View view) {
        String name = et_name.getText().toString();
        String mobile = et_mobile.getText().toString();
        String email = et_email.getText().toString();
        String password = et_password.getText().toString();
        if (r_male.isChecked()) {
            gender = r_male.getText().toString();
        }

        if (r_female.isChecked()) {
            gender = r_female.getText().toString();

        }

        StringBuilder builder = new StringBuilder();

        if (c_java.isChecked()) {
            builder.append(c_java.getText().toString() + ",");
        }
        if (c_android.isChecked()) {
            builder.append(c_android.getText().toString() + ",");
        }
        if (c_webdesign.isChecked()) {
            builder.append(c_webdesign.getText().toString() + ",");
        }
        String selectedDistrict = sp_district.getSelectedItem().toString();
        String selectedMandal = sp_mandal.getSelectedItem().toString();
        tv.setText(name + "\n" + mobile + "\n" + email + "\n" + password + "\n" + gender + "\n" + builder + "\n"+ selectedDistrict+"\n"+selectedMandal);


    }
    }