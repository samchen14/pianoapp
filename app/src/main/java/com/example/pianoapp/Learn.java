package com.example.pianoapp;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import com.github.aakira.expandablelayout.ExpandableRelativeLayout;

public class Learn extends AppCompatActivity {
    private int wColor;
    private int bColor;
    private int sColor;
    ExpandableRelativeLayout expandableLayout1, expandableLayout2, expandableLayout3, expandableLayout4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE); // horizontal orientation
        setContentView(R.layout.learn);
        Intent intent = getIntent();
        wColor = intent.getIntExtra("wColor", Color.WHITE);
        bColor = intent.getIntExtra("bColor", Color.BLACK);
        sColor = intent.getIntExtra("sColor", Color.BLUE);
        Button backButton = findViewById(R.id.button20);

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goBack();

            }
        });
    }

    public void expandableButton1(View view) {
        expandableLayout1 = (ExpandableRelativeLayout) findViewById(R.id.expandableLayout1);
        expandableLayout1.toggle(); // toggle expand and collapse
    }

    public void expandableButton2(View view) {
        expandableLayout2 = (ExpandableRelativeLayout) findViewById(R.id.expandableLayout2);
        expandableLayout2.toggle(); // toggle expand and collapse
    }

    public void expandableButton3(View view) {
        expandableLayout3 = (ExpandableRelativeLayout) findViewById(R.id.expandableLayout3);
        expandableLayout3.toggle(); // toggle expand and collapse
    }

    public void expandableButton4(View view) {
        expandableLayout4 = (ExpandableRelativeLayout) findViewById(R.id.expandableLayout4);
        expandableLayout4.toggle(); // toggle expand and collapse
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

