package com.example.toastanddialogs;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.support.v4.app.NotificationCompat;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void createNotificationChannel() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            NotificationChannel channel = new NotificationChannel("channelid", "App Notification", NotificationManager.IMPORTANCE_DEFAULT);
            NotificationManager notificationManager = getSystemService(NotificationManager.class);
            notificationManager.createNotificationChannel(channel);
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        createNotificationChannel();
    }

    public void displayToast(View view)
    {
        EditText text = findViewById(R.id.msg);
        String input = text.getText().toString();
        Toast.makeText(getApplicationContext(), input, Toast.LENGTH_LONG).show();
    }

    public void displayAlert(View view)
    {
        EditText text = findViewById(R.id.msg);
        String input = text.getText().toString();
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Alert Dialog");
        builder.setMessage(input);

        builder.setPositiveButton("Accept", new DialogInterface.OnClickListener(){
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(getApplicationContext(), "You clicked on Accept", Toast.LENGTH_SHORT).show();
            }
        });

        builder.setNegativeButton("Reject", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(getApplicationContext(), "You clicked on Reject", Toast.LENGTH_SHORT).show();
            }
        });

        AlertDialog dialog = builder.create();
        dialog.show();
    }

    public void displayNote(View view){
        EditText text = findViewById(R.id.msg);
        String input = text.getText().toString();
        final int note_id= 1111;
        NotificationManager noteManager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
        PendingIntent intent = PendingIntent.getActivity(this, 0, new Intent(this, Greet.class), 0);
        NotificationCompat.Builder note = new NotificationCompat.Builder(this, "chanel_id");
        note.setSmallIcon(R.mipmap.ic_launcher);
        note.setContentTitle("Greeting Message");
        note.setContentText("You typed, " + input +" , Click me to see a surprise.");
        note.setContentIntent(intent);
        note.setAutoCancel(true);
        Notification n = note.build();
        noteManager.notify(note_id, n);
    }

}
