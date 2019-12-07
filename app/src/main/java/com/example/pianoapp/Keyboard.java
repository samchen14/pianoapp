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

        /*firstc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                firstc.setBackgroundColor(intent.getIntExtra("sColor", Color.BLUE));
                soundPool.play(keyMidC, 1, 1,
                        0, 0, 1);
                //midC.setBackgroundColor(intent.getIntExtra("wColor", Color.WHITE));
            }
        });*/

        firstc.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        firstc.setBackgroundColor(intent.getIntExtra("sColor", Color.BLUE));
                        soundPool.play(keyMidC, 1, 1,
                                0, 0, 1);
                        break;
                    case MotionEvent.ACTION_UP:
                        firstc.setBackgroundColor(intent.getIntExtra("wColor", Color.WHITE));
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
                        firstcsharp.setBackgroundColor(intent.getIntExtra("sColor", Color.BLUE));
                        soundPool.play(keyMidCSharp, 1, 1,
                                0, 0, 1);
                        break;
                    case MotionEvent.ACTION_UP:
                        firstcsharp.setBackgroundColor(intent.getIntExtra("bColor", Color.BLACK));
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
                        firstd.setBackgroundColor(intent.getIntExtra("sColor", Color.BLUE));
                        soundPool.play(keyMidD, 1, 1,
                                0, 0, 1);
                        break;
                    case MotionEvent.ACTION_UP:
                        firstd.setBackgroundColor(intent.getIntExtra("wColor", Color.WHITE));
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
                        firstdsharp.setBackgroundColor(intent.getIntExtra("sColor", Color.BLUE));
                        soundPool.play(keyMidDSharp, 1, 1,
                                0, 0, 1);
                        break;
                    case MotionEvent.ACTION_UP:
                        firstdsharp.setBackgroundColor(intent.getIntExtra("bColor", Color.BLACK));
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
                        firste.setBackgroundColor(intent.getIntExtra("sColor", Color.BLUE));
                        soundPool.play(keyMidE, 1, 1,
                                0, 0, 1);
                        break;
                    case MotionEvent.ACTION_UP:
                        firste.setBackgroundColor(intent.getIntExtra("wColor", Color.WHITE));
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
                        firstf.setBackgroundColor(intent.getIntExtra("sColor", Color.BLUE));
                        soundPool.play(keyMidF, 1, 1,
                                0, 0, 1);
                        break;
                    case MotionEvent.ACTION_UP:
                        firstf.setBackgroundColor(intent.getIntExtra("wColor", Color.WHITE));
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
                        firstfsharp.setBackgroundColor(intent.getIntExtra("sColor", Color.BLUE));
                        soundPool.play(keyMidFSharp, 1, 1,
                                0, 0, 1);
                        break;
                    case MotionEvent.ACTION_UP:
                        firstfsharp.setBackgroundColor(intent.getIntExtra("bColor", Color.BLACK));
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
                        firstg.setBackgroundColor(intent.getIntExtra("sColor", Color.BLUE));
                        soundPool.play(keyMidG, 1, 1,
                                0, 0, 1);
                        break;
                    case MotionEvent.ACTION_UP:
                        firstg.setBackgroundColor(intent.getIntExtra("wColor", Color.WHITE));
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
                        firstgsharp.setBackgroundColor(intent.getIntExtra("sColor", Color.BLUE));
                        soundPool.play(keyMidGSharp, 1, 1,
                                0, 0, 1);
                        break;
                    case MotionEvent.ACTION_UP:
                        firstgsharp.setBackgroundColor(intent.getIntExtra("bColor", Color.BLACK));
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
                        firsta.setBackgroundColor(intent.getIntExtra("sColor", Color.BLUE));
                        soundPool.play(keyMidA, 1, 1,
                                0, 0, 1);
                        break;
                    case MotionEvent.ACTION_UP:
                        firsta.setBackgroundColor(intent.getIntExtra("wColor", Color.WHITE));
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
                        firstasharp.setBackgroundColor(intent.getIntExtra("sColor", Color.BLUE));
                        soundPool.play(keyMidASharp, 1, 1,
                                0, 0, 1);
                        break;
                    case MotionEvent.ACTION_UP:
                        firstasharp.setBackgroundColor(intent.getIntExtra("bColor", Color.BLACK));
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
                        firstb.setBackgroundColor(intent.getIntExtra("sColor", Color.BLUE));
                        soundPool.play(keyMidB, 1, 1,
                                0, 0, 1);
                        break;
                    case MotionEvent.ACTION_UP:
                        firstb.setBackgroundColor(intent.getIntExtra("wColor", Color.WHITE));
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
                        secondc.setBackgroundColor(intent.getIntExtra("sColor", Color.BLUE));
                        soundPool.play(keyHighC, 1, 1,
                                0, 0, 1);
                        break;
                    case MotionEvent.ACTION_UP:
                        secondc.setBackgroundColor(intent.getIntExtra("wColor", Color.WHITE));
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
                        secondcsharp.setBackgroundColor(intent.getIntExtra("sColor", Color.BLUE));
                        soundPool.play(keyHighCSharp, 1, 1,
                                0, 0, 1);
                        break;
                    case MotionEvent.ACTION_UP:
                        secondcsharp.setBackgroundColor(intent.getIntExtra("wColor", Color.WHITE));
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
                        secondd.setBackgroundColor(intent.getIntExtra("sColor", Color.BLUE));
                        soundPool.play(keyHighD, 1, 1,
                                0, 0, 1);
                        break;
                    case MotionEvent.ACTION_UP:
                        secondd.setBackgroundColor(intent.getIntExtra("wColor", Color.WHITE));
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
                        seconddsharp.setBackgroundColor(intent.getIntExtra("sColor", Color.BLUE));
                        soundPool.play(keyHighDSharp, 1, 1,
                                0, 0, 1);
                        break;
                    case MotionEvent.ACTION_UP:
                        seconddsharp.setBackgroundColor(intent.getIntExtra("wColor", Color.WHITE));
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
                        seconde.setBackgroundColor(intent.getIntExtra("sColor", Color.BLUE));
                        soundPool.play(keyHighE, 1, 1,
                                0, 0, 1);
                        break;
                    case MotionEvent.ACTION_UP:
                        seconde.setBackgroundColor(intent.getIntExtra("wColor", Color.WHITE));
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
                        secondf.setBackgroundColor(intent.getIntExtra("sColor", Color.BLUE));
                        soundPool.play(keyHighF, 1, 1,
                                0, 0, 1);
                        break;
                    case MotionEvent.ACTION_UP:
                        secondf.setBackgroundColor(intent.getIntExtra("wColor", Color.WHITE));
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
        startActivity(intent);
        finish();
    }
}