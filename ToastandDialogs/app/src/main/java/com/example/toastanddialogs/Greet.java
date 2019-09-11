package com.example.toastanddialogs;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Greet extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_greet);
    }

    public void returnMain(View view)
    {
        finish();
    }
}
