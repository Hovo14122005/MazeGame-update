package com.example.mazegame;


import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.SeekBar;
import android.widget.TextView;

public class CustomModeActivity extends Activity {
    public String layoutNum = "CustomModeSettingsActivity";
    private TextView colTextView;
    private ProgressBar colProgressBar;
    public static int finalColProgress = 2;
    private SeekBar colSeekBar;

    private TextView rowTextView;
    private ProgressBar rowProgressBar;
    public static int finalRowProgress = 2;
    private SeekBar rowSeekBar;

    private TextView hintTextView;
    private ProgressBar hintProgressBar;
    public static int finalHintProgress = 1;
    private SeekBar hintSeekBar;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_mode);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);


        colTextView = (TextView) findViewById(R.id.colTextView);
        colProgressBar = (ProgressBar) findViewById(R.id.colProgressBar);
        colSeekBar = (SeekBar) findViewById(R.id.colSeekBar);

        colSeekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                colProgressBar.setProgress(progress);
                colTextView.setText("" + progress + " Columns");
                finalColProgress = progress;
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        rowTextView = (TextView) findViewById(R.id.rowTextView);
        rowProgressBar = (ProgressBar) findViewById(R.id.rowProgressBar);
        rowSeekBar = (SeekBar) findViewById(R.id.rowSeekBar);

        rowSeekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                rowProgressBar.setProgress(progress);
                rowTextView.setText("" + progress + " Rows");
                finalRowProgress = progress;
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        hintTextView = (TextView) findViewById(R.id.hintTextView);
        hintProgressBar = (ProgressBar) findViewById(R.id.hintProgressBar);
        hintSeekBar = (SeekBar) findViewById(R.id.hintSeekBar);

        hintSeekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                hintProgressBar.setProgress(progress);
                hintTextView.setText("Skip " + progress + " cells per hint");
                finalHintProgress = progress;
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        Button submitButton = (Button) findViewById(R.id.submitButton);

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                layoutNum = "CustomModeActivity";
                setContentView(R.layout.custom_mode);

                Button hintButton = (Button) findViewById(R.id.hintButton);
                hintButton.setOnClickListener(new View.OnClickListener() {
                    CustomMode hintView = (CustomMode) findViewById(R.id.gameView);
                    @Override
                    public void onClick(View view) {
                        hintView.showCustomModeHint();
                    }
                });
            }
        });


    }

    public void openCustomModeSettingsActivity(){
        Intent intent = new Intent(this, CustomModeActivity.class);
        startActivity(intent);
    }
    public void openMenu(){
        Intent intent = new Intent(this, Menu.class);
        startActivity(intent);
    }
    @Override
    public void onBackPressed() {
        if(layoutNum == "CustomModeActivity"){
            layoutNum = "CustomModeSettingsActivity";
            finalColProgress = 2; finalRowProgress = 2; finalHintProgress = 1;
            openCustomModeSettingsActivity();
        }
        else if (layoutNum == "CustomModeSettingsActivity") {
            openMenu();
        } else{
            super.onBackPressed();
        }
    }
}