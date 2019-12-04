package com.example.pianoapp;

import android.content.pm.ActivityInfo;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class Settings extends AppCompatActivity {
    private int keyMidC, keyMidB, keyMidE, keyMidF, keyMidG, keyA;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT); // horizontal orientation
        setContentView(R.layout.settings);

        /*ColorPickerView.setColorListener(new ColorListener() {
            @Override
            public void onColorSelected(int color, boolean fromUser) {

            }
        });*/
    }
}
