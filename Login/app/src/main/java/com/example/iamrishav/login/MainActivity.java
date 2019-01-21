package com.example.iamrishav.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button register;
    RelativeLayout layoutlogin, layoutgoogle, layoutgithub;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        register = findViewById(R.id.register);
        layoutlogin = findViewById(R.id.rellogin);
        layoutgoogle = findViewById(R.id.relgoogle);
        layoutgithub = findViewById(R.id.relgithub);

        layoutlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                layoutlogin.setEnabled(false);
                Toast.makeText(MainActivity.this,"Login Successfully", Toast.LENGTH_SHORT).show();
            }
        });

        layoutgoogle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                layoutgoogle.setEnabled(false);
            }
        });

        layoutgithub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                layoutgithub.setEnabled(false);
            }
        });

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, sign_up.class);
                startActivity(intent);
            }
        });
    }
}
