package com.blockheads.mygbu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.HorizontalScrollView;
import android.widget.ImageButton;
import android.widget.SearchView;
import android.widget.Toast;

public class HomeActivity extends AppCompatActivity {
    HorizontalScrollView hscroll;
    SearchView searchbtn;
    ImageButton brofile, bhostels, btransport,bculture, bsettings, bplacement, bfeedback;
    ImageButton 
    float v=1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();

            hscroll = findViewById(R.id.hscroll);






            searchbtn = findViewById(R.id.searchbtn);
            hscroll.setTranslationX(500);
            hscroll.setAlpha(v);
            hscroll.animate().translationX(0).alpha(1).setDuration(1000).setStartDelay(100).start();

            searchbtn.setMaxWidth(500);

        }
        google.setOnClickListener(v -> {
            Toast.makeText(getApplicationContext(), "Login Bypass", Toast.LENGTH_SHORT).show();
            Intent i = new Intent(LoginActivity.this, HomeActivity.class);
            startActivity(i);
            finish();
    }
}