package com.example.mazegame;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class LevelsActivity extends Activity {
    public String layoutNum = "Levels";
    public static int level = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_levels);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        RelativeLayout relativeLayout = findViewById(R.id.levels);
        AnimationDrawable animationDrawable = (AnimationDrawable) relativeLayout.getBackground();
        animationDrawable.setEnterFadeDuration(2500);
        animationDrawable.setExitFadeDuration(5000);
        animationDrawable.start();

        TextView level1 = (TextView) findViewById(R.id.level1);
        TextView level2 = (TextView) findViewById(R.id.level2);
        TextView level3 = (TextView) findViewById(R.id.level3);
        TextView level4 = (TextView) findViewById(R.id.level4);
        TextView level5 = (TextView) findViewById(R.id.level5);
        TextView level6 = (TextView) findViewById(R.id.level6);
        TextView level7 = (TextView) findViewById(R.id.level7);
        TextView level8 = (TextView) findViewById(R.id.level8);
        TextView level9 = (TextView) findViewById(R.id.level9);
        TextView level10 = (TextView) findViewById(R.id.level10);
        TextView level11 = (TextView) findViewById(R.id.level11);
        TextView level12 = (TextView) findViewById(R.id.level12);
        TextView level13 = (TextView) findViewById(R.id.level13);
        TextView level14 = (TextView) findViewById(R.id.level14);
        TextView level15 = (TextView) findViewById(R.id.level15);
        TextView level16 = (TextView) findViewById(R.id.level16);
        TextView level17 = (TextView) findViewById(R.id.level17);
        TextView level18 = (TextView) findViewById(R.id.level18);
        TextView level19 = (TextView) findViewById(R.id.level19);
        TextView level20 = (TextView) findViewById(R.id.level20);
        TextView level21 = (TextView) findViewById(R.id.level21);
        TextView level22 = (TextView) findViewById(R.id.level22);
        TextView level23 = (TextView) findViewById(R.id.level23);
        TextView level24 = (TextView) findViewById(R.id.level24);
        TextView level25 = (TextView) findViewById(R.id.level25);
        TextView level26 = (TextView) findViewById(R.id.level26);
        TextView level27 = (TextView) findViewById(R.id.level27);
        TextView level28 = (TextView) findViewById(R.id.level28);
        TextView level29 = (TextView) findViewById(R.id.level29);
        TextView level30 = (TextView) findViewById(R.id.level30);


        level1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                layoutNum = "anyLevel";
                level = 1;
                openPlayLevelActivity();
            }
        });
        level2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                layoutNum = "anyLevel";
                level = 2;
                openPlayLevelActivity();
            }
        });
        level3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                layoutNum = "anyLevel";
                level = 3;
                openPlayLevelActivity();
            }
        });
        level4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                layoutNum = "anyLevel";
                level = 4;
                openPlayLevelActivity();
            }
        });
        level5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                layoutNum = "anyLevel";
                level = 5;
                openPlayLevelActivity();
            }
        });
        level6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                layoutNum = "anyLevel";
                level = 6;
                openPlayLevelActivity();
            }
        });
        level7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                layoutNum = "anyLevel";
                level = 7;
                openPlayLevelActivity();
            }
        });
        level8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                layoutNum = "anyLevel";
                level = 8;
                openPlayLevelActivity();
            }
        });
        level9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                layoutNum = "anyLevel";
                level = 9;
                openPlayLevelActivity();
            }
        });
        level10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                layoutNum = "anyLevel";
                level = 10;
                openPlayLevelActivity();
            }
        });
        level11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                layoutNum = "anyLevel";
                level = 11;
                openPlayLevelActivity();
            }
        });
        level12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                layoutNum = "anyLevel";
                level = 12;
                openPlayLevelActivity();
            }
        });
        level13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                layoutNum = "anyLevel";
                level = 13;
                openPlayLevelActivity();
            }
        });
        level14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                layoutNum = "anyLevel";
                level = 14;
                openPlayLevelActivity();
            }
        });
        level15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                layoutNum = "anyLevel";
                level = 15;
                openPlayLevelActivity();
            }
        });
        level16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                layoutNum = "anyLevel";
                level = 16;
                openPlayLevelActivity();
            }
        });
        level17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                layoutNum = "anyLevel";
                level = 17;
                openPlayLevelActivity();
            }
        });
        level18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                layoutNum = "anyLevel";
                level = 18;
                openPlayLevelActivity();
            }
        });
        level19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                layoutNum = "anyLevel";
                level = 19;
                openPlayLevelActivity();
            }
        });
        level20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                layoutNum = "anyLevel";
                level = 20;
                openPlayLevelActivity();
            }
        });
        level21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                layoutNum = "anyLevel";
                level = 21;
                openPlayLevelActivity();
            }
        });
        level22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                layoutNum = "anyLevel";
                level = 22;
                openPlayLevelActivity();
            }
        });
        level23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                layoutNum = "anyLevel";
                level = 23;
                openPlayLevelActivity();
            }
        });
        level24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                layoutNum = "anyLevel";
                level = 24;
                openPlayLevelActivity();
            }
        });
        level25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                layoutNum = "anyLevel";
                level = 25;
                openPlayLevelActivity();
            }
        });
        level26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                layoutNum = "anyLevel";
                level = 26;
                openPlayLevelActivity();
            }
        });
        level27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                layoutNum = "anyLevel";
                level = 27;
                openPlayLevelActivity();
            }
        });
        level28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                layoutNum = "anyLevel";
                level = 28;
                openPlayLevelActivity();
            }
        });
        level29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                layoutNum = "anyLevel";
                level = 29;
                openPlayLevelActivity();
            }
        });
        level30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                layoutNum = "anyLevel";
                level = 30;
                openPlayLevelActivity();
            }
        });
    }

    public void onBackPressed() {
        if(layoutNum == "anyLevel"){
            layoutNum = "Levels";
            Intent intent = new Intent(this, LevelsActivity.class);
            startActivity(intent);
        }
        else if(layoutNum == "Levels"){
            layoutNum = "Menu";
            Intent intent = new Intent(this, Menu.class);
            startActivity(intent);
        }
        else{
            super.onBackPressed();
        }
    }

    public void openPlayLevelActivity(){
        Intent intent = new Intent(this, PlayLevelActivity.class);
        /*intent.putExtra("level", level);*/
        startActivity(intent);
    }
}