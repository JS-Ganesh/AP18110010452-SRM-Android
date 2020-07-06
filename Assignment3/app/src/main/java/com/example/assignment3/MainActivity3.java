package com.example.assignment3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity3 extends AppCompatActivity {

    EditText u, p, n, e;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        u = findViewById(R.id.user);
        p = findViewById(R.id.pass);
        n = findViewById(R.id.phone);
        e = findViewById(R.id.mail);
        textView = findViewById(R.id.registrationpage);
    }


    public void register(View view) {
        String user, pass, phone, mail;
        user =u.getText().toString();
        pass =p.getText().toString();
        phone = n.getText().toString();
        mail = e.getText().toString();

        if (user.isEmpty() || pass.isEmpty() || phone.isEmpty() || mail.isEmpty()) {
            Toast.makeText(MainActivity3.this, "SOME TEXT IS EMPTY", Toast.LENGTH_SHORT).show();
        } else {
            Intent i = new Intent(MainActivity3.this, MainActivity.class);
            Toast.makeText(MainActivity3.this, "Registered Successful", Toast.LENGTH_SHORT).show();
            startActivity(i);
        }
    }
}