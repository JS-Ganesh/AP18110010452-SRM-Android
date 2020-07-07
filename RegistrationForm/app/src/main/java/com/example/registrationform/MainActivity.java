package com.example.registrationform;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.AdapterView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.jar.Attributes;

public class MainActivity extends AppCompatActivity {


    EditText Et_roll, Et_name, Et_phone, Et_email, Et_password;
    RadioButton r_male, r_female;




    Spinner sp_branch;
    String gender;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Et_roll = findViewById(R.id.roll);
        Et_name = findViewById(R.id.name);
        Et_phone = findViewById(R.id.phone);
        Et_email = findViewById(R.id.email);
        Et_password = findViewById(R.id.password);
        r_male = findViewById(R.id.male);
        r_female = findViewById(R.id.female);
        sp_branch = findViewById(R.id.branches);




        ArrayAdapter<CharSequence> branch_Adapter = ArrayAdapter.createFromResource(MainActivity.this, R.array.branches, android.R.layout.simple_spinner_item);
        sp_branch.setAdapter(branch_Adapter);

        sp_branch.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i) {
                    case 0:
                        Toast.makeText(MainActivity.this, "Please Select a branch", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                Toast.makeText(MainActivity.this, "Please Select a branch", Toast.LENGTH_SHORT).show();

            }
        });


    }

    public void submit(View view) {

        String roll = Et_roll.getText().toString();
        String name = Et_name.getText().toString();
        String phone = Et_phone.getText().toString();
        String email = Et_email.getText().toString();
        String password = Et_password.getText().toString();



        if (r_male.isChecked()) {
            gender = r_male.getText().toString();
        } else if (r_female.isChecked()) {
            gender = r_female.getText().toString();
        }

        String branch = sp_branch.getSelectedItem().toString();

        if (roll.isEmpty() || name.isEmpty() || phone.isEmpty() || email.isEmpty() || password.isEmpty() || gender.isEmpty() || branch.isEmpty()) {
            Toast.makeText(MainActivity.this, "Fill the required credentials", Toast.LENGTH_SHORT).show();
        } else {
            Intent i = new Intent(MainActivity.this, DetailsActivity.class);


            i.putExtra("r", roll);
            i.putExtra("n", name);
            i.putExtra("ph", phone);
            i.putExtra("e", email);
            i.putExtra("p", password);
            i.putExtra("g", gender);
            i.putExtra("b", branch);


            startActivity(i);
        }
    }
}





















