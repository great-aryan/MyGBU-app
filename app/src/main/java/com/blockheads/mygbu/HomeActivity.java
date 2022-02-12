package com.blockheads.mygbu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.HorizontalScrollView;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.SearchView;
import android.widget.Toast;

public class HomeActivity extends AppCompatActivity {
    HorizontalScrollView hscroll;
    SearchView searchbtn;
    ImageButton bprofile, bhostels, btransport, bculture, bsettings, bplacement, bfeedback,
            blibrary, bmaps, blifeatgbu,btimetable, bschools, bhelpdesk, badmission, bnotice,
            bcalender, bsports, bclub, bbank, youtube, instagram, twitter, facebook, gmail, whatsapp;

    LinearLayout youtube_btn, facebook_btn, twitter_btn, whatsapp_btn, gmail_btn, instagram_btn;
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

            youtube_btn = findViewById(R.id.youtube_btn);
            facebook_btn = findViewById(R.id.facebook_btn);
            twitter_btn = findViewById(R.id.twitter_btn);
            whatsapp_btn = findViewById(R.id.whatsapp_btn);
            gmail_btn = findViewById(R.id.gmail_btn);
            instagram_btn = findViewById(R.id.insta_btn);



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
        });
        bplacement.setOnClickListener(v -> {
            Intent i = new Intent(HomeActivity.this, Placementpage.class);
            startActivity(i);
        });
        bfeedback.setOnClickListener(v -> {
            Intent i = new Intent(HomeActivity.this, FeedbackActivity.class);
            startActivity(i);
        });
        blibrary.setOnClickListener(v -> {
            Intent i = new Intent(HomeActivity.this, LibraryActivity.class);
            startActivity(i);
        });
        bmaps.setOnClickListener(v -> {
            Intent i = new Intent(HomeActivity.this, MapActivity.class);
            startActivity(i);
        });
        blifeatgbu.setOnClickListener(v -> {
            Intent i = new Intent(HomeActivity.this, LifeatgbuActivity.class);
            startActivity(i);
        });
        btimetable.setOnClickListener(v -> {
            Toast.makeText(getApplicationContext(), "Select School", Toast.LENGTH_LONG).show();
            Intent i = new Intent(HomeActivity.this, Timetablepage.class);
            startActivity(i);
        });
        bschools.setOnClickListener(v -> {
            Intent i = new Intent(HomeActivity.this, Schoolspage.class);
            startActivity(i);
        });
        bhelpdesk.setOnClickListener(v -> {
            Intent i = new Intent(HomeActivity.this, Helpdeskpage.class);
            startActivity(i);
        });
        badmission.setOnClickListener(v -> {
            Intent i = new Intent(HomeActivity.this, Admissionpage.class);
            startActivity(i);
        });
        bnotice.setOnClickListener(v -> {
            Intent i = new Intent(HomeActivity.this, NoticeActivity.class);
            startActivity(i);
        });
        bcalender.setOnClickListener(v -> {
            Intent i = new Intent(HomeActivity.this, Calanderpage.class);
            startActivity(i);
        });
        bsports.setOnClickListener(v -> {
            Intent i = new Intent(HomeActivity.this, SportsActivity.class);
            startActivity(i);
        });
        bclub.setOnClickListener(v -> {
            Intent i = new Intent(HomeActivity.this, Clubpage.class);
            startActivity(i);
        });
        bbank.setOnClickListener(v -> {
            Intent i = new Intent(HomeActivity.this, Bankpage.class);
            startActivity(i);
        });
        youtube_btn.setOnClickListener(v -> {
            Uri uri = Uri.parse("https://www.youtube.com/channel/UCD1_8OJsfWFjrJWrhvTniGQ");
            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
            startActivity(intent);
        });
        facebook_btn.setOnClickListener(v -> {
            Uri uri = Uri.parse("https://www.facebook.com/dev.blockheadsprofile/");
            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
            startActivity(intent);
        });
        twitter_btn.setOnClickListener(v -> {
            Uri uri = Uri.parse("https://twitter.com/dev_BlockHeads");
            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
            startActivity(intent);
        });
        whatsapp_btn.setOnClickListener(v -> {
            Uri uri = Uri.parse("https://wa.me/911206055352");
            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
            startActivity(intent);
        });
        gmail_btn.setOnClickListener(v -> {
            Uri uri = Uri.parse("mailto:developers.blockheads@gmail.com?subject=MyGBU%20app%20Feedback%2Fcomplaint&body=Dear%20Block%20Heads%0D%0AName%3A%0D%0APhone%20no.%3A%20(optional)%0D%0A");
            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
            startActivity(intent);
        });
        instagram_btn.setOnClickListener(v -> {
            Uri uri = Uri.parse("https://www.instagram.com/dev.blockheads/");
            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
            startActivity(intent);
        });

    }
}