package com.example.madlibs;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import java.util.jar.Attributes;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displayMessage();
            }
        });
    }

    @Override
    public View onCreateView(View parent, String name, Context context, AttributeSet attrs)
    {
        return super.onCreateView(parent, name, context, attrs);
    }

    public EditText name, adjective, adjective1 , noun, noun1, noun2, noun3, celebrity, adverb, number, bodyPart, pluralNoun;
    public  String name_str, adjective_str, adjective1_str, noun_str, noun1_str, noun2_str, noun3_str, celebrity_str, adverb_str, bodyPart_str, number_str, pluralNoun_str;

    public void displayMessage()
    {
        Intent intent = new Intent(this, Main2Activity.class);
        name = findViewById(R.id.editText);
        adjective = findViewById(R.id.editText0);
        noun = findViewById(R.id.editText1);
        noun1 = findViewById(R.id.editText2);
        celebrity = findViewById(R.id.editText3);
        adverb = findViewById(R.id.editText4);
        number = findViewById(R.id.editText5);
        adjective1 = findViewById(R.id.editText6);
        noun2 = findViewById(R.id.editText7);
        noun3 = findViewById(R.id.editText8);
        bodyPart = findViewById(R.id.editText9);
        pluralNoun = findViewById(R.id.editText10);
        name_str = name.getText().toString();
        adjective_str = adjective.getText().toString();
        noun_str = noun.getText().toString();
        noun1_str = noun1.getText().toString();
        celebrity_str = celebrity.getText().toString();
        adverb_str = adverb.getText().toString();
        number_str = number.getText().toString();
        adjective1_str = adjective1.getText().toString();
        noun2_str = noun2.getText().toString();
        noun3_str = noun3.getText().toString();
        bodyPart_str = bodyPart.getText().toString();
        pluralNoun_str = pluralNoun.getText().toString();

        String name = name_str;
        String [] lib = new String[11];
        lib[0] = adjective_str;
        lib[1] = noun_str;
        lib[2] = noun1_str;
        lib[3] = celebrity_str;
        lib[4] = adverb_str;
        lib[5] = number_str;
        lib[6] = adjective1_str;
        lib[7] = noun2_str;
        lib[8] = noun3_str;
        lib[9] = bodyPart_str;
        lib[10] = pluralNoun_str;

        intent.putExtra("madLibs", Games.madLibs(lib, name));
        startActivity(intent);

    }

}
