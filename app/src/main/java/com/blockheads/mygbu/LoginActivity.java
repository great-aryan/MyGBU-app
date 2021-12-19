package com.blockheads.mygbu;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import com.google.android.material.floatingactionbutton.FloatingActionButton;


import androidx.appcompat.app.AppCompatActivity;


public class LoginActivity extends AppCompatActivity {

    FloatingActionButton fb, google, twitter;
    EditText rollno;
    EditText pass;
    TextView forgetPass;
    Button login;
    int counter = 4;
    float v = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }

        fb = findViewById(R.id.fab_fb);
        google = findViewById(R.id.fab_google);
        twitter = findViewById(R.id.fab_twitter);
        rollno = findViewById(R.id.rollno);
        pass = findViewById(R.id.pass);
        forgetPass = findViewById(R.id.forget_pass);
        login = findViewById(R.id.button);

        fb.setTranslationY(200);
        google.setTranslationY(200);
        twitter.setTranslationY(200);
        rollno.setTranslationX(400);
        pass.setTranslationX(400);
        forgetPass.setTranslationX(400);
        login.setTranslationY(300);

        fb.setAlpha(v);
        google.setAlpha(v);
        twitter.setAlpha(v);
        rollno.setAlpha(v);
        pass.setAlpha(v);
        forgetPass.setAlpha(v);
        login.setAlpha(v);


        rollno.animate().translationX(0).alpha(1).setDuration(500).setStartDelay(100).start();
        pass.animate().translationX(0).alpha(1).setDuration(500).setStartDelay(200).start();
        forgetPass.animate().translationX(0).alpha(1).setDuration(500).setStartDelay(200).start();
        login.animate().translationY(0).alpha(1).setDuration(500).setStartDelay(300).start();
        google.animate().translationY(0).alpha(1).setDuration(500).setStartDelay(300).start();
        fb.animate().translationY(0).alpha(1).setDuration(500).setStartDelay(400).start();
        twitter.animate().translationY(0).alpha(1).setDuration(500).setStartDelay(500).start();


                login.setOnClickListener(v -> {
                    if (rollno.getText().toString().equals("215UCS004") &&
                            pass.getText().toString().equals("123456")) {
                        Intent i = new Intent(LoginActivity.this, HomeActivity.class);
                        startActivity(i);
                        finish();
                    } else {

                        login.setVisibility(View.VISIBLE);
                        login.setBackgroundColor(Color.RED);
                        counter--;
                        login.setText("Try Again " + Integer.toString(counter));

                        if (counter == 0) {
                            login.setEnabled(false);
                            login.setText("Login Disabled");
                            Toast.makeText(getApplicationContext(), "Restart the App", Toast.LENGTH_SHORT).show();
                        }
                    }
                });
        google.setOnClickListener(v -> {
            Toast.makeText(getApplicationContext(), "Registered Google account not found", Toast.LENGTH_SHORT).show();

        });
        twitter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Twitter login will be available soon", Toast.LENGTH_SHORT).show();
                Intent myWebLink = new Intent(android.content.Intent.ACTION_VIEW);
                myWebLink.setData(Uri.parse("http://www.twitter.com"));
                startActivity(myWebLink);
            }
        });
        fb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Facebook login will be available soon", Toast.LENGTH_SHORT).show();
                Intent myWebLink = new Intent(android.content.Intent.ACTION_VIEW);
                myWebLink.setData(Uri.parse("http://www.fb.com"));
                startActivity(myWebLink);

            }
        });
    }
}