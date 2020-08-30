package com.example.memorise;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
      //  getSupportActionBar().hide();
        final Button new_game = (Button) findViewById(R.id.new_game);
        final Button help = (Button) findViewById(R.id.help);
       // Button setting = (Button) findViewById(R.id.setting);
        Button quit_game = (Button) findViewById(R.id.quit_game);

        new_game.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                open_New_game();
            }


        });

        help.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openHelp();
            }


        });
       /* setting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSetting();
            }


        });*/
        quit_game.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    AlertDialog.Builder builder = new AlertDialog.Builder(HomeActivity.this);
                    builder.setTitle("Exit");
                    builder.setMessage("Do You Want Exit?");
                    builder.setPositiveButton("Yes, Quit Game", new DialogInterface.OnClickListener(){
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            finish();
                        }
                    });
                    builder.setNegativeButton("No,Not Now", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            dialogInterface.dismiss();
                        }
                    });
                    AlertDialog dialog =builder.create();
                    dialog.show();
                }



        });


    }
    public void open_New_game(){
        Intent intent = new Intent(this,Newgame.class);
        startActivity(intent);
    }

    public void openHelp(){
            Intent intent = new Intent(this,Help.class);
            startActivity(intent);
        }

    /*public void openSetting(){
        Intent intent = new Intent(this,Setting.class);
        startActivity(intent);
    }*/
}



