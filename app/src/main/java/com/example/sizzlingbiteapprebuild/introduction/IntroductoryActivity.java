package com.example.sizzlingbiteapprebuild.introduction;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager.widget.PagerAdapter;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.airbnb.lottie.LottieAnimationView;
import com.bumptech.glide.Glide;
import com.cuberto.liquid_swipe.LiquidPager;
import com.example.sizzlingbiteapprebuild.R;
import com.example.sizzlingbiteapprebuild.introduction.boardingScreen.OnBoardingScreenFragment1;
import com.example.sizzlingbiteapprebuild.introduction.boardingScreen.OnBoardingScreenFragment2;
import com.example.sizzlingbiteapprebuild.introduction.boardingScreen.OnBoardingScreenFragment3;

public class IntroductoryActivity extends AppCompatActivity {

    ImageView imgBg, logo, appName;
    LottieAnimationView splash;

    LiquidPager liquidPager;
    private static final int NUM_PAGE = 3;
    ScreenSliderPagerAdapter pagerAdapter;

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


        liquidPager = findViewById(R.id.liquid_pager);
        pagerAdapter = new ScreenSliderPagerAdapter(getSupportFragmentManager());
        liquidPager.setAdapter(pagerAdapter);
    }

    private class ScreenSliderPagerAdapter extends FragmentStatePagerAdapter {

        public ScreenSliderPagerAdapter(@NonNull FragmentManager fm) {
            super(fm);
        }

        @NonNull
        @Override
        public Fragment getItem(int position) {
            switch (position) {
                case 0:
                    OnBoardingScreenFragment1 fragment1 = new OnBoardingScreenFragment1();
                    return fragment1;
                case 1:
                    OnBoardingScreenFragment2 fragment2 = new OnBoardingScreenFragment2();
                    return fragment2;
                case 2:
                    OnBoardingScreenFragment3 fragment3 = new OnBoardingScreenFragment3();
                    return fragment3;
                default:
                    return null;
            }
        }

        @Override
        public int getCount() {
            return NUM_PAGE;
        }
    }
}