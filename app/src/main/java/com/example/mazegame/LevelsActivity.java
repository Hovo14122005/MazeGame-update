package com.example.mazegame;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

public class LevelsActivity extends Activity {
    public String layoutNum = "Levels";
    public static int level;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_levels);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

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
                setContentView(R.layout.levels);
            }
        });
        level2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                layoutNum = "anyLevel";
                level = 2;
                setContentView(R.layout.levels);
            }
        });
        level3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                layoutNum = "anyLevel";
                level = 3;
                setContentView(R.layout.levels);
            }
        });
        level4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                layoutNum = "anyLevel";
                level = 4;
                setContentView(R.layout.levels);
            }
        });
        level5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                layoutNum = "anyLevel";
                level = 5;
                setContentView(R.layout.levels);
            }
        });
        level6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                layoutNum = "anyLevel";
                level = 6;
                setContentView(R.layout.levels);
            }
        });
        level7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                layoutNum = "anyLevel";
                level = 7;
                setContentView(R.layout.levels);
            }
        });
        level8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                layoutNum = "anyLevel";
                level = 8;
                setContentView(R.layout.levels);
            }
        });
        level9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                layoutNum = "anyLevel";
                level = 9;
                setContentView(R.layout.levels);
            }
        });
        level10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                layoutNum = "anyLevel";
                level = 10;
                setContentView(R.layout.levels);
            }
        });
        level11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                layoutNum = "anyLevel";
                level = 11;
                setContentView(R.layout.levels);
            }
        });
        level12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                layoutNum = "anyLevel";
                level = 12;
                setContentView(R.layout.levels);
            }
        });
        level13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                layoutNum = "anyLevel";
                level = 13;
                setContentView(R.layout.levels);
            }
        });
        level14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                layoutNum = "anyLevel";
                level = 14;
                setContentView(R.layout.levels);
            }
        });
        level15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                layoutNum = "anyLevel";
                level = 15;
                setContentView(R.layout.levels);
            }
        });
        level16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                layoutNum = "anyLevel";
                level = 16;
                setContentView(R.layout.levels);
            }
        });
        level17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                layoutNum = "anyLevel";
                level = 17;
                setContentView(R.layout.levels);
            }
        });
        level18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                layoutNum = "anyLevel";
                level = 18;
                setContentView(R.layout.levels);
            }
        });
        level19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                layoutNum = "anyLevel";
                level = 19;
                setContentView(R.layout.levels);
            }
        });
        level20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                layoutNum = "anyLevel";
                level = 20;
                setContentView(R.layout.levels);
            }
        });
        level21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                layoutNum = "anyLevel";
                level = 21;
                setContentView(R.layout.levels);
            }
        });
        level22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                layoutNum = "anyLevel";
                level = 22;
                setContentView(R.layout.levels);
            }
        });
        level23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                layoutNum = "anyLevel";
                level = 23;
                setContentView(R.layout.levels);
            }
        });
        level24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                layoutNum = "anyLevel";
                level = 24;
                setContentView(R.layout.levels);
            }
        });
        level25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                layoutNum = "anyLevel";
                level = 25;
                setContentView(R.layout.levels);
            }
        });
        level26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                layoutNum = "anyLevel";
                level = 26;
                setContentView(R.layout.levels);
            }
        });
        level27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                layoutNum = "anyLevel";
                level = 27;
                setContentView(R.layout.levels);
            }
        });
        level28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                layoutNum = "anyLevel";
                level = 28;
                setContentView(R.layout.levels);
            }
        });
        level29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                layoutNum = "anyLevel";
                level = 29;
                setContentView(R.layout.levels);
            }
        });
        level30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                layoutNum = "anyLevel";
                level = 30;
                setContentView(R.layout.levels);
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
}