package com.example.memorise;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        final Button newgame = (Button) findViewById(R.id.newgame);
        final Button help = (Button) findViewById(R.id.btn2);
        Button setting = (Button) findViewById(R.id.setting);
        Button quitgame = (Button) findViewById(R.id.quitgame);

        newgame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openNewgame();
            }


        });

        help.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openHelp();
            }


        });
        setting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSetting();
            }


        });
        quitgame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moveTaskToBack(true);
                android.os.Process.killProcess(android.os.Process.myPid());
                System.exit(1);
            }


        });


    }
    public void openNewgame(){
        Intent intent = new Intent(this,Newgame.class);
        startActivity(intent);
    }

    public void openHelp(){
            Intent intent = new Intent(this,Help.class);
            startActivity(intent);
        }

    public void openSetting(){
        Intent intent = new Intent(this,Setting.class);
        startActivity(intent);
    }
}



