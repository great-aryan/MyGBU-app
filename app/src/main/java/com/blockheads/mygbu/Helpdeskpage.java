package com.blockheads.mygbu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Helpdeskpage extends AppCompatActivity {
    Button buttonCall,buttonCall2,buttonCall3,buttonCall4,buttonCall5,buttonCall6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_helpdeskpage);
        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }
        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
        buttonCall = findViewById(R.id.genrcall);

        buttonCall.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + "01202344200"));// Initiates the Intent
                startActivity(intent);
            }
        });
        buttonCall2 = findViewById(R.id.admicall);

        buttonCall2.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + "01202344234"));// Initiates the Intent
                startActivity(intent);
            }
        });
        buttonCall3 = findViewById(R.id.admicall2);

        buttonCall3.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + "01202344255"));// Initiates the Intent
                startActivity(intent);
            }
        });
        buttonCall4 = findViewById(R.id.wardcall);

        buttonCall4.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + "01202346175"));// Initiates the Intent
                startActivity(intent);
            }
        });
        buttonCall5 = findViewById(R.id.dsacall);

        buttonCall5.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + "01202346175"));// Initiates the Intent
                startActivity(intent);
            }
        });
        buttonCall6 = findViewById(R.id.ictcall);

        buttonCall6.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + "01202346070"));// Initiates the Intent
                startActivity(intent);
            }
        });
    }
}