package com.example.sizzlingbiteapprebuild.introduction;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.airbnb.lottie.LottieAnimationView;
import com.example.sizzlingbiteapprebuild.R;

public class IntroductoryActivity extends AppCompatActivity {

    ImageView imgBg, logo, appName;
    LottieAnimationView splash;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_introductory);

        imgBg = findViewById(R.id.img_bg);
        logo = findViewById(R.id.logo);
        appName = findViewById(R.id.app_name);
        splash = findViewById(R.id.splash);

        imgBg.animate().translationY(-1600).setDuration(1000).setStartDelay(4000);
        logo.animate().translationY(1400).setDuration(1000).setStartDelay(4000);
        appName.animate().translationY(1400).setDuration(1000).setStartDelay(4000);
        splash.animate().translationY(1400).setDuration(1000).setStartDelay(4000);
    }
}