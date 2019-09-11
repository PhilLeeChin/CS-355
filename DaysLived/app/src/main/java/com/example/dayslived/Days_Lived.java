package com.example.dayslived;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Calendar;

public class Days_Lived extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_days_lived);
        Toast.makeText(getApplicationContext(), "SECOND ACTIVITY", Toast.LENGTH_LONG).show();


        Intent intent = getIntent();
        String text = intent.getStringExtra("Name");
        TextView tv2 = findViewById(R.id.todayDate);
        tv2.setText("Welcome " + text + "!");
    }

    public void checkDaysLived(View view)
    {
        DatePicker p = findViewById(R.id.datePicker);
        int day = p.getDayOfMonth();
        int month = p.getMonth();
        int year = p.getYear();

        Calendar c = Calendar.getInstance();
        int currentYear = c.get(Calendar.YEAR);
        int currentMonth = c.get(Calendar.MONTH) + 1;
        int currentDay = c.get(Calendar.DAY_OF_MONTH);

        int dayslive;
        dayslive = (currentYear - year) * 365 + (currentMonth - month) * 30 + (currentDay - day);
        TextView tv = findViewById(R.id.daysAlive);
        tv.setText("You have lived " + dayslive + " days!!!");

        TextView tv2 = findViewById(R.id.todayDate);
        tv2.setText("Today is " + currentMonth + "/" + currentDay + "/" + currentYear);
    }
}
