package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class winnerScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = new Intent(this,gamePage.class);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                finish();
            }
        },3000);
        setContentView(R.layout.activity_winner_screen);
    }
}