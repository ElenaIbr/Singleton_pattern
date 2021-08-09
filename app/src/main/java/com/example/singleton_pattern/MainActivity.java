package com.example.singleton_pattern;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button joinChat = findViewById(R.id.join_chat);
        Button startChat = findViewById(R.id.start_chat);
        Button newScreen = findViewById(R.id.restart);

        newScreen.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                ChatState.getInstance();
                ChatState.printState();
            }
        });

        startChat.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                ChatState.printState();
            }
        });

        joinChat.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                ChatState.addMember();
                ChatState.printState();
            }
        });





    }
}