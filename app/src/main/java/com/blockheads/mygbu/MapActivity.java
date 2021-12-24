package com.blockheads.mygbu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MapActivity extends AppCompatActivity {
    ImageButton bmlibrary, bmacademic, bmadmin, bmaudit, bmbadmin, bmbirsa, bmbuddhacafe,
            bmboyshostel, bmcencomp, bmcricket,bmenggralab, bmfootball, bmgateno1, bmgateno2,
            bmgateno3, bmgateno4, bmgateno5, bmghasidas, bmgimshos, bmgirlscanteen, bmhelipad,
            bmindoorstadium, bmmedicent, bmmotherdairy, bmmushi, bmramsaran, bmsavitri,
            bmsobio, bmsoea, bmsoeb, bmsoict, bmsoljg,
            ;

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
        b = findViewById(R.id.bmsom);
        b = findViewById(R.id.bmsovac);
        b = findViewById(R.id.bmshopcom);
        b = findViewById(R.id.bmsarovar);
        b = findViewById(R.id.bmtennis);
        b = findViewById(R.id.bmtulsidas);
        b = findViewById(R.id.bmfactype2);
        b = findViewById(R.id.bmfactype23);
        b = findViewById(R.id.bmfactype3);
        b = findViewById(R.id.bmfactype4);
        b = findViewById(R.id.bmfactype5a);
        b = findViewById(R.id.bmfactype5b);
        b = findViewById(R.id.bmfactype5c);
        b = findViewById(R.id.bmwatertank);


        bmlibrary.setOnClickListener( new View.OnClickListener() {
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