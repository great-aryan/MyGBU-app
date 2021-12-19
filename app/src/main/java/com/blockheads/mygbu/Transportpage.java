package com.blockheads.mygbu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Transportpage extends AppCompatActivity {
    Button buttonCall;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transportpage);

        buttonCall = findViewById(R.id.btncall);

        buttonCall.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + "8178788527"));// Initiates the Intent
                startActivity(intent);

            }
        });
    }
}