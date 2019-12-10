package com.example.pianoapp;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private int blackKeyColor;

    private int whiteKeyColor;

    private int shadingColor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE); // horizontal orientation
        setContentView(R.layout.activity_main);
        Button play = findViewById(R.id.piano);
        Button theory = findViewById(R.id.theory);
        Button settings = findViewById(R.id.setting);
        Button close = findViewById(R.id.quit);
        Intent i = getIntent();
        whiteKeyColor = i.getIntExtra("wColor", Color.WHITE);
        blackKeyColor = i.getIntExtra("bColor", Color.BLACK);
        shadingColor = i.getIntExtra("sColor", Color.BLUE);
        System.out.println(whiteKeyColor);
        System.out.println(blackKeyColor);
        System.out.println(shadingColor);

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
                finish();
            }
        });
    }

    private void playPiano() {
        Intent intent = new Intent(MainActivity.this, Keyboard.class);
        intent.putExtra("wColor", whiteKeyColor);
        intent.putExtra("bColor", blackKeyColor);
        intent.putExtra("sColor", shadingColor);
        startActivity(intent);
        finish();

    }
    private void learnTheory() {
        Intent intent = new Intent(this, Learn.class);
        intent.putExtra("wColor", whiteKeyColor);
        intent.putExtra("bColor", blackKeyColor);
        intent.putExtra("sColor", shadingColor);
        startActivity(intent);
        finish();

    }
    private void changeSettings() {
        Intent intent = new Intent(this, Settings.class);
        startActivity(intent);
        finish();
    }
}
