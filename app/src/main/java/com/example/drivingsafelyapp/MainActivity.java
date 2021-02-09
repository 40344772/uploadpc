package com.example.drivingsafelyapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonB = (Button)findViewById(R.id.startButton);

        buttonB.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v) {
                if (buttonB.getText() == "Start") {
                    buttonB.setText("Stop");
                }

            }

        });


    }
}
