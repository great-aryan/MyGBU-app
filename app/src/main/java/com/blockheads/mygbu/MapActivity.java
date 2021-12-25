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
        bmfootball = findViewById(R.id.bmfootball0);
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


        bmacademic.setOnClickListener(v -> {
            Uri gmmIntentUri = Uri.parse("google.navigation:q=Academic Block, Government Institute of Medical Sciences,Gautam Buddha University campus, Greater Noida, Uttar Pradesh 201312&mode=w");
            Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
            mapIntent.setPackage("com.google.android.apps.maps");
            startActivity(mapIntent);

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
                Uri gmmIntentUri = Uri.parse("google.navigation:q=Boys Hostel GBU, CGGG+XC7, G.Buddha University, Greater Noida, Uttar Pradesh 201312&mode=w");
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
                Uri gmmIntentUri = Uri.parse("google.navigation:q=Central Computer Center, Gautam Buddha University (Delhi NCR), G, Greater Noida, Uttar Pradesh 201312&mode=w");
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                startActivity(mapIntent);

            }
        });
        bmcricket.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri gmmIntentUri = Uri.parse("google.navigation:q=GBU Cricket Ground, CGFH+M3Q, G.Buddha University, Greater Noida, Uttar Pradesh 201312&mode=w");
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                startActivity(mapIntent);

            }
        });


        bmenggralab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri gmmIntentUri = Uri.parse("google.navigation:q=Engineering Graphics Lab,CG9F+WGG, G.Buddha University, Greater Noida, Uttar Pradesh 201312&mode=w");
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                startActivity(mapIntent);

            }
        });
        bmfootball.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri gmmIntentUri = Uri.parse("google.navigation:q=Football Ground, CGFG+2G9, G.Buddha University, Greater Noida, Uttar Pradesh 201312 GBU&mode=w");
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                startActivity(mapIntent);

            }
        });

        bmlibrary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri gmmIntentUri = Uri.parse("google.navigation:q=Bodhisattva Dr. B.R. Ambedkar Central Library, Gautam Buddha University (Delhi NCR), Yamuna Expy, Greater Noida, Uttar Pradesh 201308&mode=w");
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                startActivity(mapIntent);

            }
        });

        bmgateno1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri gmmIntentUri = Uri.parse("google.navigation:q=&mode=w");
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                startActivity(mapIntent);

            }
        });

        bmgateno2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri gmmIntentUri = Uri.parse("google.navigation:q=&mode=w");
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                startActivity(mapIntent);

            }
        });
        bmgateno3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri gmmIntentUri = Uri.parse("google.navigation:q=Gate No 2, G.Buddha University, Greater Noida, Uttar Pradesh 201312&mode=w");
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                startActivity(mapIntent);

            }
        });
        bmgateno4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri gmmIntentUri = Uri.parse("google.navigation:qGate No 4, G.Buddha University, Greater Noida, Uttar Pradesh 201312=&mode=w");
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                startActivity(mapIntent);

            }
        });
        bmgateno5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri gmmIntentUri = Uri.parse("google.navigation:q=Gate No 5, G.Buddha University, Greater Noida, Uttar Pradesh 201312&mode=w");
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                startActivity(mapIntent);

            }
        });
        bmghasidas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri gmmIntentUri = Uri.parse("google.navigation:q=Ghasidas Hostel, G.Buddha University, Greater Noida, Uttar Pradesh 201310&mode=w");
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                startActivity(mapIntent);

            }
        });
        bmgimshos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri gmmIntentUri = Uri.parse("google.navigation:q=GIMS hospital greater noida up, Unnamed Road, Greater Noida, Uttar Pradesh 201310&mode=w");
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                startActivity(mapIntent);

            }
        });
        bmgirlscanteen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri gmmIntentUri = Uri.parse("google.navigation:q=GBU Girls Hostel Canteen, Unnamed Road, G.Buddha University, Greater Noida, Uttar Pradesh 201310&mode=w");
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                startActivity(mapIntent);

            }
        });
        bmhelipad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri gmmIntentUri = Uri.parse("google.navigation:q=Gautam Buddha University Helipad, CG99+444, Greater Noida, Uttar Pradesh 201312&mode=w");
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                startActivity(mapIntent);

            }
        });
        bmindoorstadium.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri gmmIntentUri = Uri.parse("google.navigation:q=GBU Indoor Stadium, CGGH+793, G.Buddha University, Greater Noida, Uttar Pradesh 201312&mode=w");
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                startActivity(mapIntent);

            }
        });
        bmmedicent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri gmmIntentUri = Uri.parse("google.navigation:q=Meditation Center, Yamuna Expressway, Gautam Budh Nagar, Greater Noida, Uttar Pradesh 201308&mode=w");
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                startActivity(mapIntent);

            }
        });
        bmmotherdairy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri gmmIntentUri = Uri.parse("google.navigation:q=Mother Diary, CGHG+5WH, Greater Noida, Uttar Pradesh 201312&mode=w");
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                startActivity(mapIntent);

            }
        });
        bmmushi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri gmmIntentUri = Uri.parse("google.navigation:q=Munshi Premchand hostel, CGGG+FF9, Greater Noida, Uttar Pradesh 201312&mode=w");
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                startActivity(mapIntent);

            }
        });
        bmramsaran.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri gmmIntentUri = Uri.parse("google.navigation:q=Ramsaran Das boys Hostel, CGFG+V7H, G.Buddha University, Greater Noida, Uttar Pradesh 201312&mode=w");
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                startActivity(mapIntent);

            }
        });
        bmsavitri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri gmmIntentUri = Uri.parse("google.navigation:q=SAVITRI BAI GIRLS HOSTEL, GAUTAM BUDDHA UNIVERSITY, Greater Noida, Uttar Pradesh 201312&mode=w");
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                startActivity(mapIntent);

            }
        });
        bmsobio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri gmmIntentUri = Uri.parse("google.navigation:q=School of Biotechnology,Yamuna Expy, G.Buddha University, Gautam Buddha Nagar, Uttar Pradesh 201312&mode=w");
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                startActivity(mapIntent);

            }
        });
        bmsoea.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri gmmIntentUri = Uri.parse("google.navigation:q=School of Engineering Block-A,Gautam Buddha Nagar, Uttar Pradesh 201308&mode=w");
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                startActivity(mapIntent);

            }
        });
        bmsoeb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri gmmIntentUri = Uri.parse("google.navigation:q=School of Engineering Block B, CGCF+4M4, G.Buddha University, Greater Noida, Uttar Pradesh 201312&mode=w");
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                startActivity(mapIntent);

            }
        });
        bmsoict.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri gmmIntentUri = Uri.parse("google.navigation:q=School of ICT, university, Greater Noida, Uttar Pradesh 201310&mode=w");
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                startActivity(mapIntent);

            }
        });
        bmsoljg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri gmmIntentUri = Uri.parse("google.navigation:q=School of Law, Justice and Governance, CG8F+VWP, Greater Noida, Uttar Pradesh 201312&mode=w");
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                startActivity(mapIntent);

            }
        });
        bmsom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri gmmIntentUri = Uri.parse("google.navigation:q=School of Management, CG8C+VRV, G.Buddha University, Greater Noida, Uttar Pradesh 201312&mode=w");
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                startActivity(mapIntent);

            }
        });
        bmsovac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri gmmIntentUri = Uri.parse("google.navigation:q=School of Vocational Studies and Applied Science,Yamuna Expressway, Greater Noida, Gautam Bhudh Nagar, Greater Noida, Uttar Pradesh 201308&mode=w");
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                startActivity(mapIntent);

            }
        });
        bmshopcom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri gmmIntentUri = Uri.parse("google.navigation:q=G.B.U Shopping Complex, CGHH+256, G.Buddha University, Greater Noida, Uttar Pradesh 201312&mode=w");
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                startActivity(mapIntent);

            }
        });
        bmsarovar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri gmmIntentUri = Uri.parse("google.navigation:q=Tathagat Gautam Buddha Statue( Sarovar), G.Buddha University, Greater Noida, Uttar Pradesh 201308&mode=w");
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                startActivity(mapIntent);

            }
        });
        bmtennis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri gmmIntentUri = Uri.parse("google.navigation:q=Tennis court, CGFG+MCX, Greater Noida, Uttar Pradesh 201312&mode=w");
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                startActivity(mapIntent);

            }
        });
        bmtulsidas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri gmmIntentUri = Uri.parse("google.navigation:q=Tulsidas Boys Hostel, CGGF+5MG, G.Buddha University, Greater Noida, Uttar Pradesh 201312&mode=w");
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                startActivity(mapIntent);

            }
        });
        bmfactype2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri gmmIntentUri = Uri.parse("google.navigation:q=Gautam Buddha University type 2-3 Housing, CGHJ+5Q2, Greater Noida, Uttar Pradesh 201312&mode=w");
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                startActivity(mapIntent);

            }
        });
        bmfactype3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri gmmIntentUri = Uri.parse("google.navigation:q=Gautam Buddha University type 2-3 Housing, CGHJ+5Q2, Greater Noida, Uttar Pradesh 201312&mode=w");
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                startActivity(mapIntent);

            }
        });
        bmfactype4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri gmmIntentUri = Uri.parse("google.navigation:q=GBU Type 4 Faculty Housing, CGFJ+H25, G.Buddha University, Greater Noida, Uttar Pradesh 201312&mode=w");
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                startActivity(mapIntent);

            }
        });
        bmfactype5a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri gmmIntentUri = Uri.parse("google.navigation:q=Gautam Buddha University type 5A Housing, CGHJ+5Q2, Greater Noida, Uttar Pradesh 201312&mode=w");
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                startActivity(mapIntent);

            }
        });
        bmfactype5b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri gmmIntentUri = Uri.parse("google.navigation:q=Type 5B, CGCH+8M9, G.Buddha University, Greater Noida, Uttar Pradesh 201312&mode=w");
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                startActivity(mapIntent);

            }
        });
        bmfactype5c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri gmmIntentUri = Uri.parse("google.navigation:q+Type 5C, CGCH+8M9, G.Buddha University, Greater Noida, Uttar Pradesh 201312&mode=w");
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                startActivity(mapIntent);

            }
        });
        bmwatertank.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri gmmIntentUri = Uri.parse("google.navigation:q=GBU Water Tank, CGHG+6JC, G.Buddha University, Greater Noida, Uttar Pradesh 201312&mode=w");
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                startActivity(mapIntent);

            }
        });

    }

}