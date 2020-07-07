package com.example.registrationform;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        tv=findViewById(R.id.userdetails);







        String roll = getIntent().getStringExtra("r");
        String name = getIntent().getStringExtra("n");
        String phone = getIntent().getStringExtra("ph");
        String email = getIntent().getStringExtra("e");
        String password=getIntent().getStringExtra("p");
        String  gender = getIntent().getStringExtra("g");
        String branch = getIntent().getStringExtra("b");

        tv.setText("UserDetails: \n \n Name : "+name+"\n \n" + "Roll No :"+roll+"\n \n" + "Phone number: "+phone+"\n \n" + "Email : "+email+"\n\n"+ "Password:"+password+" \n \n" +"Gender:"+gender+"\n \n" + "Branch: "+branch+"");

    }
}