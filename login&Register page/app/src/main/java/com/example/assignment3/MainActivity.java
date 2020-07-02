package com.example.assignment3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {


    EditText user, pass;
    TextView loginpage;
    String login, password;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        user = findViewById(R.id.user);
        pass = findViewById(R.id.password);
        loginpage = findViewById(R.id.loginpage);
    }


    public void login(View view) {
        login=user.getText().toString();
        password=pass.getText().toString();
        if(login.isEmpty() || password.isEmpty())
        {
            Toast.makeText(MainActivity.this, "Username and Password should not be empty",Toast.LENGTH_SHORT).show();
        }

        else{
            Intent i=new Intent(MainActivity.this,MainActivity2.class);
            i.putExtra("name",login);
            startActivity(i);
        }

    }

    public void register(View view) {
        Intent i =new Intent(MainActivity.this,MainActivity3.class);
        startActivity(i);
    }
}