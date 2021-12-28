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
    ImageButton bprofile, bhostels, btransport, bculture, bsettings, bplacement, bfeedback,
            blibrary, bmaps, blifeatgbu,btimetable, bschools, bhelpdesk, badmission, bnotice,
            bcalender, bsports, bclub, bbank, youtube, instagram, twitter, facebook, gmail, whatsapp;
    float v = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();

            hscroll = findViewById(R.id.hscroll);

            bprofile = findViewById(R.id.bprofile);
            bhostels = findViewById(R.id.bhostels);
            btransport = findViewById(R.id.btransport);
            bculture = findViewById(R.id.bculture);
            bsettings = findViewById(R.id.bsettings);
            bplacement = findViewById(R.id.bplacement);
            bfeedback = findViewById(R.id.bfeedback);

            blibrary = findViewById(R.id.blibrary);
            bmaps = findViewById(R.id.bmaps);
            blifeatgbu = findViewById(R.id.blifeatgbu);
            btimetable = findViewById(R.id.btimetable);
            bschools = findViewById(R.id.bschools);
            bhelpdesk = findViewById(R.id.bhelpdesk);
            badmission = findViewById(R.id.badmission);
            bnotice = findViewById(R.id.bnotice);
            bcalender = findViewById(R.id.bcalender);
            bsports = findViewById(R.id.bsports);
            bclub = findViewById(R.id.bclub);
            bbank = findViewById(R.id.bbank);
            searchbtn = findViewById(R.id.searchbtn);
            youtube = findViewById(R.id.byoutube);
            instagram = findViewById(R.id.binsta);
            twitter = findViewById(R.id.twitter);
            facebook = findViewById(R.id.facebook);
            gmail = findViewById(R.id.gmail);
            whatsapp = findViewById(R.id.whatsapp);


            hscroll.setTranslationX(500);
            hscroll.setAlpha(v);
            hscroll.animate().translationX(0).alpha(1).setDuration(1000).setStartDelay(100).start();

            searchbtn.setMaxWidth(500);

        }
        bprofile.setOnClickListener(v -> {
            Intent i = new Intent(HomeActivity.this, ProfileActivity.class);
            startActivity(i);
        });
        bhostels.setOnClickListener(v -> {
            Intent i = new Intent(HomeActivity.this, Hostelpage.class);
            startActivity(i);
        });
        btransport.setOnClickListener(v -> {
            Intent i = new Intent(HomeActivity.this, Transportpage.class);
            startActivity(i);
        });
        bculture.setOnClickListener(v -> {
            Intent i = new Intent(HomeActivity.this, Culturepage.class);
            startActivity(i);
        });
        bsettings.setOnClickListener(v -> {
            Intent i = new Intent(HomeActivity.this, SettingActivity.class);
            startActivity(i);
        });bplacement.setOnClickListener(v -> {
            Intent i = new Intent(HomeActivity.this, Placementpage.class);
            startActivity(i);
        });bfeedback.setOnClickListener(v -> {
            Intent i = new Intent(HomeActivity.this, FeedbackActivity.class);
            startActivity(i);
        });blibrary.setOnClickListener(v -> {
            Intent i = new Intent(HomeActivity.this, LibraryActivity.class);
            startActivity(i);
        });bmaps.setOnClickListener(v -> {
            Intent i = new Intent(HomeActivity.this, MapActivity.class);
            startActivity(i);
        });blifeatgbu.setOnClickListener(v -> {
            Intent i = new Intent(HomeActivity.this, LifeatgbuActivity.class);
            startActivity(i);
        });btimetable.setOnClickListener(v -> {
            Toast.makeText(getApplicationContext(), "Select School", Toast.LENGTH_LONG).show();
            Intent i = new Intent(HomeActivity.this, Timetablepage.class);
            startActivity(i);
        });bschools.setOnClickListener(v -> {
            Intent i = new Intent(HomeActivity.this, Schoolspage.class);
            startActivity(i);
        });bhelpdesk.setOnClickListener(v -> {
            Intent i = new Intent(HomeActivity.this, Helpdeskpage.class);
            startActivity(i);
        });badmission.setOnClickListener(v -> {
            Intent i = new Intent(HomeActivity.this, Admissionpage.class);
            startActivity(i);
        });bnotice.setOnClickListener(v -> {
            Intent i = new Intent(HomeActivity.this, NoticeActivity.class);
            startActivity(i);
        });bcalender.setOnClickListener(v -> {
            Intent i = new Intent(HomeActivity.this, Calanderpage.class);
            startActivity(i);
        });bsports.setOnClickListener(v -> {
            Intent i = new Intent(HomeActivity.this, SportsActivity.class);
            startActivity(i);
        });bclub.setOnClickListener(v -> {
            Intent i = new Intent(HomeActivity.this, Clubpage.class);
            startActivity(i);
        });bbank.setOnClickListener(v -> {
            Intent i = new Intent(HomeActivity.this, Bankpage.class);
            startActivity(i);
        });

    }
}