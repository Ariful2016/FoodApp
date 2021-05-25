package com.ariful.foodapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class SplashActivity extends AppCompatActivity {

    TextView splashtxt;
    ImageView splashimg;
    CountDownTimer countDownTimer;

    FirebaseAuth firebaseAuth;
    FirebaseUser firebaseUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        splashtxt = findViewById(R.id.splash);
        splashimg = findViewById(R.id.splashimge);

        countDownTimer = new CountDownTimer(3000,1000) {
            @Override
            public void onTick(long l) {

            }

            @Override
            public void onFinish() {
                if(firebaseUser != null) {

                    startActivity(new Intent(getApplicationContext(), MainActivity.class));
                    finish();

                }else {

                    startActivity(new Intent(getApplicationContext(), StartActivity.class));
                    finish();

                }

            }
        }.start();


    }
}