package com.blockheads.mygbu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    ImageView splash_logo;
    TextView splashgbu;
    TextView bhpro;
    float v=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }
        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);//  set status text dark
        splash_logo = findViewById(R.id.splash_logo);
        splashgbu = findViewById(R.id.splashgbu);
        bhpro = findViewById(R.id.bhpro);

        splash_logo.setTranslationY(50);
        splashgbu.setTranslationY(200);
        bhpro.setTranslationY(300);

        splash_logo.setAlpha(v);
        splashgbu.setAlpha(v);
        bhpro.setAlpha(v);

        splash_logo.animate().translationY(0).alpha(1).setDuration(100).setStartDelay(10).start();
        splashgbu.animate().translationY(0).alpha(1).setDuration(500).setStartDelay(200).start();
        bhpro.animate().translationY(0).alpha(1).setDuration(500).setStartDelay(200).start();

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                //This method will be executed once the timer is over
                // Start your app main activity
                Intent i = new Intent(MainActivity.this, LoginActivity.class);
                startActivity(i);
                // close this activity
                finish();
            }
        }, 1000);

        }
    }

