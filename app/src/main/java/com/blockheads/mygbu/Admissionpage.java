package com.blockheads.mygbu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Admissionpage extends AppCompatActivity {
    ImageButton bfees;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admissionpage);
        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }
        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);

        bfees = findViewById(R.id.bfees);

        bfees.setOnClickListener(v -> {
            Intent i = new Intent(Admissionpage.this, FeeActivity.class);
            startActivity(i);
        });
    }
}