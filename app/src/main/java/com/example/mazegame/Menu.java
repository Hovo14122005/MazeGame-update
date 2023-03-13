package com.example.mazegame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Menu extends AppCompatActivity {
    public static boolean restartEndlessMode;
    public String layoutNum = "Menu";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu);

        Button endlessModeButton = findViewById(R.id.endlessModeButton);
        Button customModeSettingsButton = findViewById(R.id.customModeSettingsButton);

        endlessModeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                layoutNum = "EndlessModeActivity";
                openEndlessModeActivity();
            }
        });

        customModeSettingsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                layoutNum = "CustomModeSettingsActivity";
                openCustomModeSettingsActivity();
            }
        });
    }

    public void openMenu(){
        Intent intent = new Intent(this, Menu.class);
        startActivity(intent);
    }
    public void openEndlessModeActivity(){
        Intent intent = new Intent(this, EndlessModeActivity.class);
        restartEndlessMode = true;
        startActivity(intent);
    }
    public void openCustomModeSettingsActivity(){
        Intent intent = new Intent(this, CustomModeActivity.class);
        startActivity(intent);
    }

    @Override
    public void onBackPressed() {
        if(layoutNum == "EndlessModeActivity"){
            layoutNum = "Menu";
            openMenu();
        }
        else if(layoutNum == "CustomModeSettingsActivity"){
            layoutNum = "Menu";
            openMenu();
        }
        else{
            super.onBackPressed();
        }
    }


}