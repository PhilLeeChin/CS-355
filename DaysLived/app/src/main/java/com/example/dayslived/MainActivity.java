package com.example.dayslived;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public EditText name, passwd;
    public String name_str, passwd_str;

    public void datePick(View view) {
        Intent intent = new Intent(this, Days_Lived.class);
        name = findViewById(R.id.useName);
        passwd = findViewById(R.id.passWd);
        name_str = name.getText().toString();
        passwd_str = passwd.getText().toString();

        if (loginManager.knownUser(name_str, passwd_str)) {
            intent.putExtra("Name", name_str);
            startActivity(intent);
        } else {
            Toast.makeText(getApplicationContext(), "Wrong	Credentials.	Try	again.", Toast.LENGTH_LONG).show();
        }
    }
}
