package com.blockheads.mygbu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.HorizontalScrollView;

public class HomeActivity extends AppCompatActivity {
    HorizontalScrollView hscroll;
    float v=1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();

            hscroll = findViewById(R.id.hscroll);
            hscroll.setTranslationX(500);
            hscroll.setAlpha(v);
            hscroll.animate().translationX(0).alpha(1).setDuration(1000).setStartDelay(100).start();



        }
    }
}