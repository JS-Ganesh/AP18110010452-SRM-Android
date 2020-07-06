package com.example.assignment23;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int ca = 0, cb = 0;
    TextView soa, sob;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        soa = findViewById(R.id.score_a);
        sob = findViewById(R.id.score_b);


        if (savedInstanceState != null) {
            String a = savedInstanceState.getString("a");
            String b = savedInstanceState.getString("b");
            soa.setText("" + a);
            sob.setText("" + b);
            ca = Integer.parseInt(a);
            cb = Integer.parseInt(b);

        }

    }


    @Override
    public void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString("a", soa.getText().toString());
        outState.putString("b", sob.getText().toString());
    }

    public void threea(View view) {

        ca = ca + 3;
        soa.setText("" + ca);
    }

    public void reset(View view) {

        ca = 0;
        ca = 0;
        soa.setText("" + ca);
        sob.setText("" + cb);
    }

    public void oneb(View view) {

        cb++;
        soa.setText("" + cb
        );

    }

    public void twob(View view) {

        cb = cb + 2;
        sob.setText("" + cb);
    }

    public void threeb(View view) {

        cb = cb+ 3;
        sob.setText("" + cb);
    }

    public void onea(View view) {

        ca = ca + 1;
        soa.setText("" + ca);
    }

    public void twoa(View view) {

        ca = ca + 2;
        soa.setText("" + ca);
    }

}



