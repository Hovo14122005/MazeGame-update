package com.example.mazegame;


import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.SeekBar;
import android.widget.TextView;

public class CustomModeActivity extends AppCompatActivity {
    public String layoutNum = "CustomModeSettingsActivity";
    private TextView colTextView;
    private ProgressBar colProgressBar;
    public static int finalColProgress = 2;
    private SeekBar colSeekBar;

    private TextView rowTextView;
    private ProgressBar rowProgressBar;
    public static int finalRowProgress = 2;
    private SeekBar rowSeekBar;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_mode);

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

        Button submitButton = (Button) findViewById(R.id.submitButton);

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                layoutNum = "CustomModeActivity";
                setContentView(R.layout.custom_mode);
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
            finalColProgress = 2; finalRowProgress = 2;
            openCustomModeSettingsActivity();
        }
        else if (layoutNum == "CustomModeSettingsActivity") {
            openMenu();
        } else{
            super.onBackPressed();
        }
    }
}