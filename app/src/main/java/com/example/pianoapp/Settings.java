package com.example.pianoapp;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.skydoves.colorpickerview.ColorEnvelope;
import com.skydoves.colorpickerview.ColorPickerView;
import com.skydoves.colorpickerview.listeners.ColorEnvelopeListener;

public class Settings extends AppCompatActivity {
    private int wKey;
    private int bKey;
    private int shade;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT); // horizontal orientation
        setContentView(R.layout.settings);
        ColorPickerView whiteKey = findViewById(R.id.wKeyColorPicker);
        whiteKey.setColorListener(new ColorEnvelopeListener() {
            @Override
            public void onColorSelected(ColorEnvelope envelope, boolean fromUser) {
                TextView white = findViewById(R.id.whiteKeys);
                white.setText("White Keys: #" + envelope.getHexCode());
                wKey = envelope.getColor();
            }
        });
        ColorPickerView blackKey = findViewById(R.id.bKeyColorPicker);
        blackKey.setColorListener(new ColorEnvelopeListener() {
            @Override
            public void onColorSelected(ColorEnvelope envelope, boolean fromUser) {
                TextView black = findViewById(R.id.blackKeys);
                black.setText("Black Keys: #" + envelope.getHexCode());
                bKey = envelope.getColor();
            }
        });

        ColorPickerView shadow = findViewById(R.id.sColorPicker);

        shadow.setColorListener(new ColorEnvelopeListener() {
            @Override
            public void onColorSelected(ColorEnvelope envelope, boolean fromUser) {
                TextView shading = findViewById(R.id.shadowColor);
                shading.setText("Shadow Color: #" + envelope.getHexCode());
                shade = envelope.getColor();
            }
        });

        Button reset = findViewById(R.id.reset);
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                shade = Color.BLUE;
                bKey = Color.BLACK;
                wKey = Color.WHITE;
                TextView shading = findViewById(R.id.shadowColor);
                shading.setText("Shadow Color");
                TextView black = findViewById(R.id.blackKeys);
                black.setText("Black Keys");
                TextView white = findViewById(R.id.whiteKeys);
                white.setText("White Keys");
            }
        });

        Button change = findViewById(R.id.submit);
        change.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Settings.this, MainActivity.class);
                intent.putExtra("wColor", wKey);
                intent.putExtra("bColor", bKey);
                intent.putExtra("sColor", shade);
                startActivity(intent);
            }
        });

        Button goBackNow = findViewById(R.id.button10);

        goBackNow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goBackNow();

            }
        });

    }
    private void goBackNow() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        finish();
    }
}
