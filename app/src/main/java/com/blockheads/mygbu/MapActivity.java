package com.blockheads.mygbu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MapActivity extends AppCompatActivity {
    ImageButton bmlibrary, bmacademic, bmadmin, bmaudit, bmbadmin, bmbirsa, bmbuddhacafe,
            bmboyshostel, bmcencomp, bmcricket, bmenggralab, bmfootball, bmgateno1, bmgateno2,
            bmgateno3, bmgateno4, bmgateno5, bmghasidas, bmgimshos, bmgirlscanteen, bmhelipad,
            bmindoorstadium, bmmedicent, bmmotherdairy, bmmushi, bmramsaran, bmsavitri,
            bmsobio, bmsoea, bmsoeb, bmsoict, bmsoljg, bmsom, bmsovac, bmshopcom, bmsarovar,
            bmtennis, bmtulsidas, bmfactype2, bmfactype3, bmfactype4, bmfactype5a,
            bmfactype5b, bmfactype5c, bmwatertank;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);
        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }
        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);

        bmacademic = findViewById(R.id.bmacademic);
        bmadmin = findViewById(R.id.bmadmin);
        bmaudit = findViewById(R.id.bmaudit);
        bmbadmin = findViewById(R.id.bmbadmin);
        bmbirsa = findViewById(R.id.bmbirsa);
        bmbuddhacafe = findViewById(R.id.bmbuddhacafe);
        bmboyshostel = findViewById(R.id.bmboyshostel);
        bmcencomp = findViewById(R.id.bmcencomp);
        bmcricket = findViewById(R.id.bmcricket);
        bmenggralab = findViewById(R.id.bmenggralab);
        bmfootball = findViewById(R.id.bmfootball);
        bmgateno1 = findViewById(R.id.bmgateno1);
        bmgateno2 = findViewById(R.id.bmgateno2);
        bmgateno3 = findViewById(R.id.bmgateno3);
        bmgateno4 = findViewById(R.id.bmgateno4);
        bmgateno5 = findViewById(R.id.bmgateno5);
        bmghasidas = findViewById(R.id.bmghasidas);
        bmgimshos = findViewById(R.id.bmgimshos);
        bmgirlscanteen = findViewById(R.id.bmgirlscanteen);
        bmhelipad = findViewById(R.id.bmhelipad);
        bmlibrary = findViewById(R.id.bmliberary);
        bmindoorstadium = findViewById(R.id.bmindoorstadium);
        bmmedicent = findViewById(R.id.bmmedicent);
        bmmotherdairy = findViewById(R.id.bmmotherdairy);
        bmmushi = findViewById(R.id.bmmushi);
        bmramsaran = findViewById(R.id.bmramsaran);
        bmsavitri = findViewById(R.id.bmsavitri);
        bmsobio = findViewById(R.id.bmsobio);
        bmsoea = findViewById(R.id.bmsoea);
        bmsoeb = findViewById(R.id.bmsoeb);
        bmsoict = findViewById(R.id.bmsoict);
        bmsoljg = findViewById(R.id.bmsoljg);
        bmsom = findViewById(R.id.bmsom);
        bmsovac = findViewById(R.id.bmsovac);
        bmshopcom = findViewById(R.id.bmshopcom);
        bmsarovar = findViewById(R.id.bmsarovar);
        bmtennis = findViewById(R.id.bmtennis);
        bmtulsidas = findViewById(R.id.bmtulsidas);
        bmfactype2 = findViewById(R.id.bmfactype2);
        bmfactype3 = findViewById(R.id.bmfactype3);
        bmfactype4 = findViewById(R.id.bmfactype4);
        bmfactype5a = findViewById(R.id.bmfactype5a);
        bmfactype5b = findViewById(R.id.bmfactype5b);
        bmfactype5c = findViewById(R.id.bmfactype5c);
        bmwatertank = findViewById(R.id.bmwatertank);


        bmacademic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri gmmIntentUri = Uri.parse("google.navigation:q=Academic Block, Government Institute of Medical Sciences,Gautam Buddha University campus, Greater Noida, Uttar Pradesh 201312&mode=w");
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                startActivity(mapIntent);

            }
        });
        bmadmin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri gmmIntentUri = Uri.parse("google.navigation:q=Administrative Block, Gautam Buddha University, Greater Noida, Uttar Pradesh 201312&mode=w");
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                startActivity(mapIntent);

            }
        });
        bmaudit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri gmmIntentUri = Uri.parse("google.navigation:q=GBU Auditorium, CG7C+VP2, G.Buddha University, Greater Noida, Uttar Pradesh 201312&mode=w");
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                startActivity(mapIntent);

            }
        });
        bmbadmin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri gmmIntentUri = Uri.parse("google.navigation:q=MMJ Badminton Court, CGGG+GW9, G.Buddha University, Greater Noida, Uttar Pradesh 201312 MMJ &mode=w");
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                startActivity(mapIntent);

            }
        });
        bmbirsa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri gmmIntentUri = Uri.parse("google.navigation:q=BIRSA MUNDA BOYS HOSTEL, GAUTAM BUDDHA UNIVERSITY, Greater Noida, Uttar Pradesh 201312&mode=w");
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                startActivity(mapIntent);

            }
        });
        bmboyshostel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri gmmIntentUri = Uri.parse("google.navigation:q=&mode=w");
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                startActivity(mapIntent);

            }
        });
        bmbuddhacafe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri gmmIntentUri = Uri.parse("google.navigation:q=Buddha Cafe, G.Buddha University, Greater Noida, Uttar Pradesh 201312&mode=w");
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                startActivity(mapIntent);

            }
        });
        bmcencomp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri gmmIntentUri = Uri.parse("google.navigation:q=xcxc&mode=w");
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                startActivity(mapIntent);

            }
        });
        bmcricket.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri gmmIntentUri = Uri.parse("google.navigation:q=xcxc&mode=w");
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                startActivity(mapIntent);

            }
        });


        bmenggralab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri gmmIntentUri = Uri.parse("google.navigation:q=Bodhisattva Dr. B.R. Ambedkar Central Library, Gautam Buddha University (Delhi NCR), Yamuna Expy, Greater Noida, Uttar Pradesh 201308&mode=w");
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                startActivity(mapIntent);

            }
        });
        bmfootball.setOnClickListener(new View.OnClickListener() {
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