package com.example.memorise;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.TextView;

import java.util.Random;


public class Medium_level extends AppCompatActivity {
    TextView tv_level, tv_number, progress;

    EditText et_number;

    Button b_confirm;

    Random r;
    SeekBar seekbar;
    int pr = 5;

    int currentLevel = 1;

    String generatedNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medium_level);

        tv_level =  findViewById(R.id.tv_level);
        tv_number = findViewById(R.id.tv_number);
        et_number = findViewById(R.id.et_number);
        b_confirm = findViewById(R.id.b_cofirm);
        seekbar = findViewById(R.id.seekBar2);
        progress =  findViewById(R.id.progress);
        r = new Random();

        //hide the input and the number and show the number
        et_number.setVisibility(View.GONE);
        b_confirm.setVisibility(View.GONE);
        tv_number.setVisibility(View.VISIBLE);

        // display the current level
        tv_level.setText("Level: " + currentLevel);

        //display random number according to the level
        generatedNumber = generateNumber(currentLevel);
        tv_number.setText(generatedNumber);

        //display the elements after 2 second and hide the number
        new Handler().postDelayed(new Runnable(){
            @Override
            public void run(){
                tv_number.setVisibility(View.GONE);

                et_number.setVisibility(View.VISIBLE);
                b_confirm.setVisibility(View.VISIBLE);
                et_number.requestFocus();
            }
        }, 2000);

        b_confirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //check if the numbers are the same
                if (generatedNumber.equals(et_number.getText().toString())){
                    //hide the input and the number and show the number
                    et_number.setVisibility(View.GONE);
                    b_confirm.setVisibility(View.GONE);
                    tv_number.setVisibility(View.VISIBLE);

                    //remove text from input
                    et_number.setText("");

                    //increase the current level
                    currentLevel++;

                    pr = pr +7;

                    seekbar.setVisibility(View.VISIBLE);
                    seekbar.setProgress(pr);
                    //display the current level
                    tv_level.setText("Level: " + currentLevel);
                    //display random number according to the level
                    generatedNumber = generateNumber(currentLevel);
                    tv_number.setText(generatedNumber);
                    //display the elements after the second and hide the number
                    new android.os.Handler().postDelayed(new Runnable(){
                        @Override
                        public void run(){
                            tv_number.setVisibility(View.GONE);
                            et_number.setVisibility(View.VISIBLE);
                            b_confirm.setVisibility(View.VISIBLE);
                            et_number.requestFocus();
                        }
                    }, 4000);

                }else {
                    et_number.setVisibility(View.GONE);
                    b_confirm.setVisibility(View.GONE);
                    tv_level.setText("Game over! the number was : " + generatedNumber);
                    seekbar.setVisibility(View.VISIBLE);
                    seekbar.setProgress(pr);
                    progress.setVisibility(View.VISIBLE);
                    progress.setText("Your progress: "+pr+" %" );

                    AlertDialog.Builder builder = new AlertDialog.Builder(Medium_level.this);
                    builder.setTitle("Exit");
                    builder.setMessage("Do You Want Exit?");
                    builder.setPositiveButton("Yes, Quit Game", new DialogInterface.OnClickListener(){
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            finish();
                        }
                    });
                    AlertDialog dialog =builder.create();
                    dialog.show();

                    //startActivity(intent);
                    //b_confirm.setEnabled(false);

                }
            }
        });

    }
    private String generateNumber(int digits){
        String output = "";
        for (int i = 0; i<=digits; i++){
            int randomDigit =  r.nextInt(10);
            output = output + "" + randomDigit;
        }
        return output;
    }



}