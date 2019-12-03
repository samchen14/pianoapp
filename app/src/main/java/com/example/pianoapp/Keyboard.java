package com.example.pianoapp;

import android.media.SoundPool;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Keyboard extends AppCompatActivity {
    private SoundPool soundPool;
    private int keyMidC, keyMidB, keyMidE, keyMidF, keyMidG, keyA;
<<<<<<< HEAD

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
=======
>>>>>>> 1f16a705cb4423b42b765be099942296b96aa5cc
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
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

        keyMidB = soundPool.load(this, R.raw.midb, 1);
        midC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        midD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                soundPool.play(keyMidB, 1, 1, 0, 0, 1);
            }
        });

        midE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        midF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        midG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        A.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
<<<<<<< HEAD
    }

}




//        getSupportActionBar().setDisplayShowHomeEnabled(true);
//        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
//        }
//
//        @Override
//        public boolean onOptionsItemSelected(MenuItem item) {
//            int id = item.getItemId();
//
//            if (id == android.R.id.home) {
//                this.finish();
//
//
//        }
//
//        return super.onOptionsItemSelected(item);
=======


        //getSupportActionBar().setDisplayShowHomeEnabled(true);
        //getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
>>>>>>> 1f16a705cb4423b42b765be099942296b96aa5cc
