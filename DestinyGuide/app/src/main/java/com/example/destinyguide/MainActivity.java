package com.example.destinyguide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void displayMessage(View view) {
        EditText fate = findViewById(R.id.editText);
        String message = fate.getText().toString();
        Toast.makeText(getApplicationContext(),  Games.fortuneTeller(message), Toast.LENGTH_LONG).show();

    }
}