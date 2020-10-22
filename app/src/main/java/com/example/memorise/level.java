package com.example.memorise;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class level extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level);

        Button Easy = (Button) findViewById(R.id.Easy);
        Button Medium = (Button) findViewById(R.id.Medium);
        Button Hard = (Button) findViewById(R.id.Hard);
        //TextView Highscore =findViewById(R.id.highscore);
        //String score = "HIGH SCORE" +getIntent().getStringExtra("HIGH-SCORE");
       // Highscore.setText(score);


        Easy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openEasy();
            }


        });

        Medium.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    openMedium();
            }


        });

        Hard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    openHard();
            }


        });


    }
    public void openEasy(){
        Intent intent = new Intent(this,Newgame.class);
        startActivity(intent);
    }
    public void openMedium(){
        Intent intent = new Intent(this,Medium_level.class);
        startActivity(intent);
    }
    public void openHard(){
        Intent intent = new Intent(this,Hard_level.class);
        startActivity(intent);
    }
}