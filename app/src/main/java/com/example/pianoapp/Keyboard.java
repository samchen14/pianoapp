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
    private int keyMidC, keyMidCSharp, keyMidD, keyMidDSharp, keyMidE, keyMidF, keyMidFSharp, keyMidG, keyMidGSharp, keyMidA, keyMidASharp, keyMidB;

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

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            soundPool = new SoundPool.Builder().setMaxStreams(5).build();
        }
        // Does setMaxStreams need to match the total number of keys?



        keyMidC = soundPool.load(this, R.raw.midc, 1);
        keyMidCSharp = soundPool.load(this, R.raw.midcsharp, 1);
        keyMidD = soundPool.load(this, R.raw.midd, 1);
        keyMidDSharp = soundPool.load(this, R.raw.middsharp, 1);
        keyMidE = soundPool.load(this, R.raw.mide, 1);

        keyMidF = soundPool.load(this, R.raw.midf, 1);
        keyMidFSharp = soundPool.load(this, R.raw.midfsharp,1);
        keyMidG = soundPool.load(this, R.raw.midg, 1);
        keyMidGSharp = soundPool.load(this, R.raw.midgsharp, 1);
        keyMidA = soundPool.load(this, R.raw.mida, 1);
        keyMidASharp = soundPool.load(this, R.raw.midasharp, 1);
        keyMidB = soundPool.load(this, R.raw.midb, 1);

        firstc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                firstc.setBackgroundColor(intent.getIntExtra("sColor", Color.BLUE));
                soundPool.play(keyMidC, 1, 1,
                        0, 0, 1);
                //midC.setBackgroundColor(intent.getIntExtra("wColor", Color.WHITE));
            }
        });

        firstcsharp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                firstcsharp.setBackgroundColor(intent.getIntExtra("sColor", Color.BLUE));
                soundPool.play(keyMidCSharp, 1, 1,
                        0, 0, 1);
                //midC.setBackgroundColor(intent.getIntExtra("wColor", Color.WHITE));
            }
        });

        firstd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                firstd.setBackgroundColor(intent.getIntExtra("sColor", Color.BLUE));
                soundPool.play(keyMidD, 1, 1,
                        0, 0, 1);
                //midC.setBackgroundColor(intent.getIntExtra("wColor", Color.WHITE));
            }
        });

        firstdsharp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                firstdsharp.setBackgroundColor(intent.getIntExtra("sColor", Color.BLUE));
                soundPool.play(keyMidD, 1, 1,
                        0, 0, 1);
                //midC.setBackgroundColor(intent.getIntExtra("wColor", Color.WHITE));
            }
        });

        firste.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                firste.setBackgroundColor(intent.getIntExtra("sColor", Color.BLUE));
                soundPool.play(keyMidE, 1, 1,
                        0, 0, 1);
                //midC.setBackgroundColor(intent.getIntExtra("wColor", Color.WHITE));
            }
        });

        firstf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                firstf.setBackgroundColor(intent.getIntExtra("sColor", Color.BLUE));
                soundPool.play(keyMidF, 1, 1,
                        0, 0, 1);
                //midC.setBackgroundColor(intent.getIntExtra("wColor", Color.WHITE));
            }
        });

        firstfsharp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                firstfsharp.setBackgroundColor(intent.getIntExtra("sColor", Color.BLUE));
                soundPool.play(keyMidFSharp, 1, 1,
                        0, 0, 1);
                //midC.setBackgroundColor(intent.getIntExtra("wColor", Color.WHITE));
            }
        });

        firstg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                firstg.setBackgroundColor(intent.getIntExtra("sColor", Color.BLUE));
                soundPool.play(keyMidG, 1, 1,
                        0, 0, 1);
                //midC.setBackgroundColor(intent.getIntExtra("wColor", Color.WHITE));
            }
        });

        firstgsharp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                firstgsharp.setBackgroundColor(intent.getIntExtra("sColor", Color.BLUE));
                soundPool.play(keyMidGSharp, 1, 1,
                        0, 0, 1);
                //midC.setBackgroundColor(intent.getIntExtra("wColor", Color.WHITE));
            }
        });

        firsta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                firsta.setBackgroundColor(intent.getIntExtra("sColor", Color.BLUE));
                soundPool.play(keyMidA, 1, 1,
                        0, 0, 1);
                //midC.setBackgroundColor(intent.getIntExtra("wColor", Color.WHITE));
            }
        });

        firstasharp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                firstasharp.setBackgroundColor(intent.getIntExtra("sColor", Color.BLUE));
                soundPool.play(keyMidASharp, 1, 1,
                        0, 0, 1);
                //midC.setBackgroundColor(intent.getIntExtra("wColor", Color.WHITE));
            }
        });

        firstb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                firstb.setBackgroundColor(intent.getIntExtra("sColor", Color.BLUE));
                soundPool.play(keyMidB, 1, 1,
                        0, 0, 1);
                //midC.setBackgroundColor(intent.getIntExtra("wColor", Color.WHITE));
            }
        });




    }



}
