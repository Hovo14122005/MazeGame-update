package com.example.mazegame;

/*import static com.example.mazegame.EndlessMode.showEndlessModeHint;*/

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

import org.jetbrains.annotations.Nullable;

public class EndlessModeActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_endless_mode);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        Button hintButton = (Button) findViewById(R.id.hintButton);

        hintButton.setOnClickListener(new View.OnClickListener() {
            EndlessMode hintView = new EndlessMode(getApplicationContext(), null);
            @Override
            public void onClick(View view) {
                hintView.showEndlessModeHint();
            }
        });
    }


}