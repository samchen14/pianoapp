package com.example.pianoapp;

//<<<<<<< HEAD
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
//=======
//>>>>>>> 1f16a705cb4423b42b765be099942296b96aa5cc
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE); // horizontal orientation
        setContentView(R.layout.activity_main);
        Button play = findViewById(R.id.piano);
        Button theory = findViewById(R.id.theory);
        Button settings = findViewById(R.id.setting);
        Button close = findViewById(R.id.quit);
        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playPiano();
            }
        });
        theory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                learnTheory();

            }
        });
        settings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                changeSettings();

            }
        });

        close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }

//<<<<<<< HEAD
    private void playPiano() {
        Intent intent = new Intent(this, Keyboard.class);
        startActivity(intent);

    }
    private void learnTheory() {
        Intent intent = new Intent(this, Learn.class);
        startActivity(intent);

    }
    private void changeSettings() {
        Intent intent = new Intent(this, Settings.class);
        startActivity(intent);
    }
//=======
    /*private void playPiano() {
>>>>>>> 1f16a705cb4423b42b765be099942296b96aa5cc

    }*/
}
