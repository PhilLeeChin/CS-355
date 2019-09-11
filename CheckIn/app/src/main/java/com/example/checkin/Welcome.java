package com.example.checkin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.jar.Attributes;

public class Welcome extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        Intent intent = getIntent();
        String text = intent.getStringExtra("Name");
        TextView tv = findViewById(R.id.show);
        tv.setText("Welcome " + text + " !");

    }
}
