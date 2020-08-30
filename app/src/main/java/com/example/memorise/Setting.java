package com.example.memorise;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.ThemeUtils;
import androidx.core.content.res.ResourcesCompat;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Setting extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);
       // getSupportActionBar().hide();
       // TextView LIGHT = (TextView) findViewById(R.id.light_th);
        //TextView DARK = (TextView) findViewById(R.id.dark_th);

      /*  LIGHT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ThemeUtils THEME = R.style.AppThemeLight;
            }
        });*/


    }
    /*private void restart()
    {
        finish();
        overridePendingTransition(0,0);
        Intent intent = new Intent(this,Setting.class);
        startActivity(intent);
        overridePendingTransition(0,0);
    }*/


}