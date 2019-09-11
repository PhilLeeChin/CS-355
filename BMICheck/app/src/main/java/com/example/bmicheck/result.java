package com.example.bmicheck;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class result extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        Intent intent= getIntent();
        String H = intent.getStringExtra("BMI_height");
        String W = intent.getStringExtra("BMI_weight");
        String N = intent.getStringExtra("BMI_Name");
        float weight = Float.parseFloat(W);
        float height = Float.parseFloat(H);
        float BMI = ((weight/ (height * height)) * 703);
        String reading;
        if (BMI < 18.5)
        {
            reading = "You are Underweight";
            TextView tv = findViewById(R.id.display_BMI);
            tv.setText(N + " - BMI Report\n" + "Your BMI is " + String.format("%.2f", BMI) + "\n" + reading + ".\nTalk to your nutritionist.");
        }

        else if (BMI >= 18.5 && BMI < 24.9) {
            reading ="You are Healthy";
            TextView tv2 = findViewById(R.id.good_health);
            tv2.setText(N + " BMI Report\n" + "Your BMI is " + String.format("%.2f", BMI) + "\n" + reading + ".\nGood job keep it up.");
        }

        else if (BMI >= 25 && BMI < 29.9) {
            reading = "You are Overweight";
            TextView tv3 = findViewById(R.id.over_weight);
            tv3.setText(N + " BMI Report\n" + "Your BMI is " + String.format("%.2f", BMI) + "\n" + reading + ".\nStart exercising!");
        }

        else if (BMI >= 30) {
            reading = "You are Obese";
            TextView tv4 = findViewById(R.id.obesse);
            tv4.setText(N + " BMI Report\n" + "Your BMI is " + String.format("%.2f", BMI) + "\n" + reading + ".\nChange diet and exercising!!");
        }


    }
}
