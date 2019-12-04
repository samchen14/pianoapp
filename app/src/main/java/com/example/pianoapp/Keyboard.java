package com.example.pianoapp;

import android.content.pm.ActivityInfo;
import android.media.SoundPool;
import android.os.Build;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Keyboard extends AppCompatActivity {
    private SoundPool soundPool;
    private int keyMidC, keyMidB, keyMidE, keyMidF, keyMidG, keyA;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE); // horizontal orientation
        setContentView(R.layout.keyboard);
        Button midC = findViewById(R.id.button5);
        Button midD = findViewById(R.id.button6);
        Button midE = findViewById(R.id.button7);
        Button midF = findViewById(R.id.button8);
        Button midG = findViewById(R.id.button9);
        Button A = findViewById(R.id.button10);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            soundPool = new SoundPool.Builder().setMaxStreams(5).build();
        }

        keyMidC = soundPool.load(this, R.raw.midc, 1);
        midC.setOnClickListener(unused -> soundPool.play(keyMidC, 1, 1,
                0, 0, 1));

    }

}



