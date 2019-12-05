package com.example.pianoapp;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.graphics.Color;
import android.media.SoundPool;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
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
        Intent intent = getIntent();

        Button firstc = findViewById(R.id.button5);
        Button firstd = findViewById(R.id.button6);
        Button firste = findViewById(R.id.button7);
        Button firstf = findViewById(R.id.button9);
        Button firstg = findViewById(R.id.button8);
        Button firsta = findViewById(R.id.button11);
        Button firstb = findViewById(R.id.button12);
        Button secondc = findViewById(R.id.button13);
        Button secondd = findViewById(R.id.button14);
        Button seconde = findViewById(R.id.button15);
        Button secondf = findViewById(R.id.button16);

        firstc.setBackgroundColor(intent.getIntExtra("wColor", Color.WHITE));
        firstd.setBackgroundColor(intent.getIntExtra("wColor", Color.WHITE));
        firste.setBackgroundColor(intent.getIntExtra("wColor", Color.WHITE));
        firstf.setBackgroundColor(intent.getIntExtra("wColor", Color.WHITE));
        firstg.setBackgroundColor(intent.getIntExtra("wColor", Color.WHITE));
        firsta.setBackgroundColor(intent.getIntExtra("wColor", Color.WHITE));
        firstb.setBackgroundColor(intent.getIntExtra("wColor", Color.WHITE));
        secondc.setBackgroundColor(intent.getIntExtra("wColor", Color.WHITE));
        secondd.setBackgroundColor(intent.getIntExtra("wColor", Color.WHITE));
        seconde.setBackgroundColor(intent.getIntExtra("wColor", Color.WHITE));
        secondf.setBackgroundColor(intent.getIntExtra("wColor", Color.WHITE));

        Button firstcsharp = findViewById(R.id.button18);
        firstcsharp.setBackgroundColor(intent.getIntExtra("bColor", Color.BLACK));
        Button firstdsharp = findViewById(R.id.button19);
        firstdsharp.setBackgroundColor(intent.getIntExtra("bColor", Color.BLACK));
        Button firstfsharp = findViewById(R.id.button24);
        firstfsharp.setBackgroundColor(intent.getIntExtra("bColor", Color.BLACK));
        Button firstgsharp = findViewById(R.id.button25);
        firstgsharp.setBackgroundColor(intent.getIntExtra("bColor", Color.BLACK));
        Button firstasharp = findViewById(R.id.button26);
        firstasharp.setBackgroundColor(intent.getIntExtra("bColor", Color.BLACK));
        Button secondcsharp = findViewById(R.id.button27);
        secondcsharp.setBackgroundColor(intent.getIntExtra("bColor", Color.BLACK));
        Button seconddsharp = findViewById(R.id.button28);
        seconddsharp.setBackgroundColor(intent.getIntExtra("bColor", Color.BLACK));

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

        midC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                midC.setBackgroundColor(intent.getIntExtra("sColor", Color.BLUE));
                soundPool.play(keyMidC, 1, 1,
                        0, 0, 1);
                //midC.setBackgroundColor(intent.getIntExtra("wColor", Color.WHITE));
            }
        });

    }



}
