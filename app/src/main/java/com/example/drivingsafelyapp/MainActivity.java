package com.example.drivingsafelyapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity{

    private accelerometer accelerometer;
    private gyroscope gyroscope;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        accelerometer = new accelerometer(this);
        gyroscope = new gyroscope(this);

        accelerometer.setListener(new accelerometer.Listener() {
            @Override
            public void onTranslation(float tx, float ty, float tz) {

            }
        });

        gyroscope.setListener(new gyroscope.Listener() {
            @Override
            public void onRotation(float rx, float ry, float rz) {

            }
        });

        Button buttonB = (Button)findViewById(R.id.startButton);

        buttonB.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v) {

                buttonB.setText("Stop");
            }

        });


    }
}
