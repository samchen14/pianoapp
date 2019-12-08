package com.example.pianoapp;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.graphics.Color;
import android.media.SoundPool;
import android.os.Build;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Keyboard extends AppCompatActivity {
    private SoundPool soundPool;
    private int wColor;
    private int bColor;
    private int sColor;
    private static final String whiteKeyColor = "whiteKeys";
    private static final String blackKeyColor = "blackKeys";
    private static final String keyShadingColor = "keyShading";
    private int keyMidC, keyMidCSharp, keyMidD, keyMidDSharp, keyMidE, keyMidF, keyMidFSharp, keyMidG, keyMidGSharp, keyMidA, keyMidASharp, keyMidB, keyHighC, keyHighCSharp, keyHighD, keyHighDSharp, keyHighE, keyHighF;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE); // horizontal orientation
        setContentView(R.layout.keyboard);
        Intent intent = getIntent();

        Button backButton = findViewById(R.id.back);

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
        wColor = intent.getIntExtra("wColor", Color.WHITE);
        bColor = intent.getIntExtra("bColor", Color.BLACK);
        sColor = intent.getIntExtra("sColor", Color.BLUE);
        firstc.setBackgroundColor(wColor);
        firstd.setBackgroundColor(wColor);
        firste.setBackgroundColor(wColor);
        firstf.setBackgroundColor(wColor);
        firstg.setBackgroundColor(wColor);
        firsta.setBackgroundColor(wColor);
        firstb.setBackgroundColor(wColor);
        secondc.setBackgroundColor(wColor);
        secondd.setBackgroundColor(wColor);
        seconde.setBackgroundColor(wColor);
        secondf.setBackgroundColor(wColor);

        Button firstcsharp = findViewById(R.id.button18);
        firstcsharp.setBackgroundColor(bColor);
        Button firstdsharp = findViewById(R.id.button19);
        firstdsharp.setBackgroundColor(bColor);
        Button firstfsharp = findViewById(R.id.button24);
        firstfsharp.setBackgroundColor(bColor);
        Button firstgsharp = findViewById(R.id.button25);
        firstgsharp.setBackgroundColor(bColor);
        Button firstasharp = findViewById(R.id.button26);
        firstasharp.setBackgroundColor(bColor);
        Button secondcsharp = findViewById(R.id.button27);
        secondcsharp.setBackgroundColor(bColor);
        Button seconddsharp = findViewById(R.id.button28);
        seconddsharp.setBackgroundColor(bColor);

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
        keyMidFSharp = soundPool.load(this, R.raw.midfsharp, 1);
        keyMidG = soundPool.load(this, R.raw.midg, 1);
        keyMidGSharp = soundPool.load(this, R.raw.midgsharp, 1);
        keyMidA = soundPool.load(this, R.raw.mida, 1);
        keyMidASharp = soundPool.load(this, R.raw.midasharp, 1);
        keyMidB = soundPool.load(this, R.raw.midb, 1);
        keyHighC = soundPool.load(this, R.raw.highc, 1);
        keyHighCSharp = soundPool.load(this, R.raw.highcsharp, 1);
        keyHighD = soundPool.load(this, R.raw.highd, 1);
        keyHighDSharp = soundPool.load(this, R.raw.highdsharp, 1);
        keyHighE = soundPool.load(this, R.raw.highe, 1);
        keyHighF = soundPool.load(this, R.raw.highf, 1);

        firstc.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        firstc.setBackgroundColor(sColor);
                        soundPool.play(keyMidC, 1, 1,
                                0, 0, 1);
                        break;
                    case MotionEvent.ACTION_UP:
                        firstc.setBackgroundColor(wColor);
                        break;
                    default:
                }
                return false;
            }
        });

        firstcsharp.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        firstcsharp.setBackgroundColor(sColor);
                        soundPool.play(keyMidCSharp, 1, 1,
                                0, 0, 1);
                        break;
                    case MotionEvent.ACTION_UP:
                        firstcsharp.setBackgroundColor(bColor);
                        break;
                    default:
                }
                return false;
            }
        });

        firstd.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        firstd.setBackgroundColor(sColor);
                        soundPool.play(keyMidD, 1, 1,
                                0, 0, 1);
                        break;
                    case MotionEvent.ACTION_UP:
                        firstd.setBackgroundColor(wColor);
                        break;
                    default:
                }
                return false;
            }
        });

        firstdsharp.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        firstdsharp.setBackgroundColor(sColor);
                        soundPool.play(keyMidDSharp, 1, 1,
                                0, 0, 1);
                        break;
                    case MotionEvent.ACTION_UP:
                        firstdsharp.setBackgroundColor(bColor);
                        break;
                    default:
                }
                return false;
            }
        });

        firste.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        firste.setBackgroundColor(sColor);
                        soundPool.play(keyMidE, 1, 1,
                                0, 0, 1);
                        break;
                    case MotionEvent.ACTION_UP:
                        firste.setBackgroundColor(wColor);
                        break;
                    default:
                }
                return false;
            }
        });

        firstf.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        firstf.setBackgroundColor(sColor);
                        soundPool.play(keyMidF, 1, 1,
                                0, 0, 1);
                        break;
                    case MotionEvent.ACTION_UP:
                        firstf.setBackgroundColor(wColor);
                        break;
                    default:
                }
                return false;
            }
        });

        firstfsharp.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        firstfsharp.setBackgroundColor(sColor);
                        soundPool.play(keyMidFSharp, 1, 1,
                                0, 0, 1);
                        break;
                    case MotionEvent.ACTION_UP:
                        firstfsharp.setBackgroundColor(bColor);
                        break;
                    default:
                }
                return false;
            }
        });

        firstg.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        firstg.setBackgroundColor(sColor);
                        soundPool.play(keyMidG, 1, 1,
                                0, 0, 1);
                        break;
                    case MotionEvent.ACTION_UP:
                        firstg.setBackgroundColor(wColor);
                        break;
                    default:
                }
                return false;
            }
        });

        firstgsharp.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        firstgsharp.setBackgroundColor(sColor);
                        soundPool.play(keyMidGSharp, 1, 1,
                                0, 0, 1);
                        break;
                    case MotionEvent.ACTION_UP:
                        firstgsharp.setBackgroundColor(bColor);
                        break;
                    default:
                }
                return false;
            }
        });

        firsta.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        firsta.setBackgroundColor(sColor);
                        soundPool.play(keyMidA, 1, 1,
                                0, 0, 1);
                        break;
                    case MotionEvent.ACTION_UP:
                        firsta.setBackgroundColor(wColor);
                        break;
                    default:
                }
                return false;
            }
        });

        firstasharp.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        firstasharp.setBackgroundColor(sColor);
                        soundPool.play(keyMidASharp, 1, 1,
                                0, 0, 1);
                        break;
                    case MotionEvent.ACTION_UP:
                        firstasharp.setBackgroundColor(bColor);
                        break;
                    default:
                }
                return false;
            }
        });

        firstb.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        firstb.setBackgroundColor(sColor);
                        soundPool.play(keyMidB, 1, 1,
                                0, 0, 1);
                        break;
                    case MotionEvent.ACTION_UP:
                        firstb.setBackgroundColor(wColor);
                        break;
                    default:
                }
                return false;
            }
        });

        secondc.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        secondc.setBackgroundColor(sColor);
                        soundPool.play(keyHighC, 1, 1,
                                0, 0, 1);
                        break;
                    case MotionEvent.ACTION_UP:
                        secondc.setBackgroundColor(wColor);
                        break;
                    default:
                }
                return false;
            }
        });

        secondcsharp.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        secondcsharp.setBackgroundColor(sColor);
                        soundPool.play(keyHighCSharp, 1, 1,
                                0, 0, 1);
                        break;
                    case MotionEvent.ACTION_UP:
                        secondcsharp.setBackgroundColor(wColor);
                        break;
                    default:
                }
                return false;
            }
        });

        secondd.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        secondd.setBackgroundColor(sColor);
                        soundPool.play(keyHighD, 1, 1,
                                0, 0, 1);
                        break;
                    case MotionEvent.ACTION_UP:
                        secondd.setBackgroundColor(wColor);
                        break;
                    default:
                }
                return false;
            }
        });

        seconddsharp.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        seconddsharp.setBackgroundColor(sColor);
                        soundPool.play(keyHighDSharp, 1, 1,
                                0, 0, 1);
                        break;
                    case MotionEvent.ACTION_UP:
                        seconddsharp.setBackgroundColor(wColor);
                        break;
                    default:
                }
                return false;
            }
        });

        seconde.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        seconde.setBackgroundColor(sColor);
                        soundPool.play(keyHighE, 1, 1,
                                0, 0, 1);
                        break;
                    case MotionEvent.ACTION_UP:
                        seconde.setBackgroundColor(wColor);
                        break;
                    default:
                }
                return false;
            }
        });

        secondf.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        secondf.setBackgroundColor(sColor);
                        soundPool.play(keyHighF, 1, 1,
                                0, 0, 1);
                        break;
                    case MotionEvent.ACTION_UP:
                        secondf.setBackgroundColor(wColor);
                        break;
                    default:
                }
                return false;
            }


        });

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goBack();

            }
        });
    }

    private void goBack() {
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("wColor", wColor);
        intent.putExtra("bColor", bColor);
        intent.putExtra("sColor", sColor);
        startActivity(intent);
        finish();
    }
}