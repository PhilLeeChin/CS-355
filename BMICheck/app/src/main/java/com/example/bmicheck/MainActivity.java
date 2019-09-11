package com.example.bmicheck;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void displayMessage (View view) {
        Intent intent = new Intent(this, result.class);
        EditText name = findViewById(R.id.username);
        EditText height = findViewById(R.id.height);
        EditText weight = findViewById(R.id.weight);
        String H = height.getText().toString();
        String W = weight.getText().toString();
        String N = name.getText().toString();
        intent.putExtra("BMI_height", H);
        intent.putExtra("BMI_weight", W);
        intent.putExtra("BMI_Name", N);
        startActivity(intent);
    }
}
