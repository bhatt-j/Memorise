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

        //final Button newgame = (Button) findViewById(R.id.newgame);
        final Button start =(Button) findViewById(R.id.start);
        final Button help = (Button) findViewById(R.id.help);
        Button quitgame = (Button) findViewById(R.id.quitgame);

       /* newgame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
           //     openNewgame();
                openlevel();
            }


        });*/

        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //     openNewgame();
                openstart();
            }


        });


        help.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openHelp();
            }


        });
        quitgame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    AlertDialog.Builder builder = new AlertDialog.Builder(HomeActivity.this);
                    builder.setTitle("Exit");
                    builder.setMessage("Do You Want Exit?");
                    builder.setPositiveButton("Yes", new DialogInterface.OnClickListener(){
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
    /*public void openNewgame(){
        Intent intent = new Intent(this,Newgame.class);
        startActivity(intent);
    }*/

    public void openstart(){
        Intent intent = new Intent(this,level.class);
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



