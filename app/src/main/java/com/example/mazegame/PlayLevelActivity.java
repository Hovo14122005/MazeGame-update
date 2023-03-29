package com.example.mazegame;

import static com.example.mazegame.LevelsActivity.level;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

public class PlayLevelActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.levels);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        TextView levelTextView = (TextView) findViewById(R.id.levelTextView);
        levelTextView.setText("Level " + level);

        Button hintButton = (Button) findViewById(R.id.hintButton);
        hintButton.setOnClickListener(new View.OnClickListener() {
            Levels hintView = (Levels) findViewById(R.id.gameView);
            @Override
            public void onClick(View view) {
                hintView.showLevelsHint();
            }
        });
    }


}