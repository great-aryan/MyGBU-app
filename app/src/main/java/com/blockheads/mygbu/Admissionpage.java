package com.blockheads.mygbu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class Admissionpage extends AppCompatActivity {
    ImageButton bfees, badmisbro,bprogram;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admissionpage);
        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }
        TextView linkTextView = findViewById(R.id.gbuacin);
        TextView linkTextView2 = findViewById(R.id.fburl);
        TextView linkTextView3 = findViewById(R.id.gbuemail);
        TextView linkTextView4 = findViewById(R.id.tweeturl);

        linkTextView.setMovementMethod(LinkMovementMethod.getInstance());
        linkTextView2.setMovementMethod(LinkMovementMethod.getInstance());
        linkTextView3.setMovementMethod(LinkMovementMethod.getInstance());
        linkTextView4.setMovementMethod(LinkMovementMethod.getInstance());

        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);

        bfees = findViewById(R.id.bfees);
        badmisbro = findViewById(R.id.badmisbro);
        bprogram = findViewById(R.id.bprogram);

        bfees.setOnClickListener(v -> {
            Intent i = new Intent(Admissionpage.this, FeeActivity.class);
            startActivity(i);
        });
        badmisbro.setOnClickListener(v -> {
            Intent i = new Intent(Admissionpage.this, BrochureActivity.class);
            startActivity(i);
        });
        bprogram.setOnClickListener(v -> {
            Intent i = new Intent(Admissionpage.this, ProgrammeActivity.class);
            startActivity(i);
        });
    }
}