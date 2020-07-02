package com.example.assignment1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button b1;
    Button b2;
    Button b3;
    Button b4;
    TextView tv;
    int a = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = findViewById(R.id.Add);
        b2 = findViewById(R.id.Subtract);
        tv = findViewById(R.id.testCount);
        b3 = findViewById(R.id.zero);
        b4 = findViewById(R.id.toast);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Action

                a++;
                tv.setText("" + a);
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Action

                a--;
                tv.setText("" + a);
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Action

                a = 0;
                tv.setText("" + a);
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Your Count is :  " + a, Toast.LENGTH_SHORT).show();
            }
        });

    }
}
















