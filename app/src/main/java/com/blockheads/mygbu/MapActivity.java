package com.blockheads.mygbu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MapActivity extends AppCompatActivity {
    ImageButton bmlib, bmict;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);
        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }
        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);

        bmlib = findViewById(R.id.bmlib);
        b = findViewById(R.id.b);
        b = findViewById(R.id.b);
        b = findViewById(R.id.b);
        b = findViewById(R.id.b);
        b = findViewById(R.id.b);
        b = findViewById(R.id.b);
        b = findViewById(R.id.b);
        b = findViewById(R.id.b);
        b = findViewById(R.id.b);
        b = findViewById(R.id.b);
        b = findViewById(R.id.b);
        b = findViewById(R.id.b);
        b = findViewById(R.id.b);
        b = findViewById(R.id.b);
        b = findViewById(R.id.b);


        bmlib.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri gmmIntentUri = Uri.parse("google.navigation:q=Bodhisattva Dr. B.R. Ambedkar Central Library, Gautam Buddha University (Delhi NCR), Yamuna Expy, Greater Noida, Uttar Pradesh 201308&mode=w");
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                startActivity(mapIntent);

            }
        });
        b.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri gmmIntentUri = Uri.parse("google.navigation:q=xcxc&mode=w");
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                startActivity(mapIntent);

            }
        });
    }
}