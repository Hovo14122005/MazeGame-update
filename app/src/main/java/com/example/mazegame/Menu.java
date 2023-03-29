package com.example.mazegame;

import static com.example.mazegame.LevelsActivity.level;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

public class Menu extends Activity implements Levels.OnTextViewUpdateListener{
    public static boolean restartEndlessMode;
    public String layoutNum = "Menu";
    Activity thisActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        ConstraintLayout constraintLayout = findViewById(R.id.menu);
        AnimationDrawable animationDrawable = (AnimationDrawable) constraintLayout.getBackground();
        animationDrawable.setEnterFadeDuration(2500);
        animationDrawable.setExitFadeDuration(5000);
        animationDrawable.start();

        Button playButton = findViewById(R.id.playButton);
        Button endlessModeButton = findViewById(R.id.endlessModeButton);
        Button customModeSettingsButton = findViewById(R.id.customModeSettingsButton);
        Button levelsButton = findViewById(R.id.levelsButton);





        playButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                layoutNum = "anyLevel";
                setContentView(R.layout.levels);

                TextView levelTextView = (TextView) findViewById(R.id.levelTextView);
                levelTextView.setText("Level " + level);

                Levels hintView = (Levels) findViewById(R.id.gameView);
                hintView.setOnTextViewUpdateListener(Menu.this);


                Button hintButton = (Button) findViewById(R.id.hintButton);
                hintButton.setOnClickListener(new View.OnClickListener() {
                    Levels hintView = (Levels) findViewById(R.id.gameView);
                    @Override
                    public void onClick(View view) {
                        hintView.showLevelsHint();
                    }
                });
            }
        });
        levelsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                layoutNum = "LevelsActivity";
                openLevelsActivity();
            }
        });

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
    public void openLevelsActivity(){
        Intent intent = new Intent(this, LevelsActivity.class);
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
        else if(layoutNum == "anyLevel"){
            layoutNum = "LevelsActivity";
            openLevelsActivity();
        }
        else if(layoutNum == "LevelsActivity"){
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


    @Override
    public void onTextViewUpdate(String text) {
        TextView levelTextView = (TextView) findViewById(R.id.levelTextView);
        levelTextView.setText(text);
    }
}