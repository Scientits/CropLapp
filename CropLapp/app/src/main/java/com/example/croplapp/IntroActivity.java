package com.example.croplapp;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;
import android.util.Log;

import com.github.paolorotolo.appintro.AppIntro;
import com.github.paolorotolo.appintro.AppIntro2;
import com.github.paolorotolo.appintro.AppIntroFragment;
import com.github.paolorotolo.appintro.model.SliderPage;

/**
 * Created by FRAMGIA\ngo.dinh.ngoc on 25/06/2017.
 */

public class IntroActivity extends AppIntro {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    protected void onStart() {
        super.onStart();

        setFadeAnimation();

        // Just create a `SliderPage` and provide title, description, background and image.
        // AppIntro will do the rest.
        SliderPage sliderPage = new SliderPage();
        sliderPage.setTitle("title1");
        sliderPage.setDescription("description1");
        sliderPage.setImageDrawable(R.mipmap.information);
        sliderPage.setBgColor(getResources().getColor(R.color.colorAccent));

        addSlide(AppIntroFragment.newInstance(sliderPage));

        sliderPage.setTitle("title2");
        sliderPage.setDescription("description2");
        sliderPage.setImageDrawable(R.mipmap.information);
        sliderPage.setBgColor(getResources().getColor(R.color.colorAccent));

        addSlide(AppIntroFragment.newInstance(sliderPage));

        // OPTIONAL METHODS
        // Override bar/separator color.
        setBarColor(Color.parseColor("#D81B60"));
//        setSeparatorColor(Color.parseColor("#2196F3"));

        // Hide Skip/Done button.
        showSkipButton(true);

        setProgressButtonEnabled(true);

        // Turn vibration on and set intensity.
        // NOTE: you will probably need to ask VIBRATE permission in Manifest.
//        setVibrate(true);
//        setVibrateIntensity(30);
    }

    @Override
    public void onSkipPressed(Fragment currentFragment) {
        super.onSkipPressed(currentFragment);
        // Do something when users tap on Skip button.
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        finish();
    }

    @Override
    public void onDonePressed(Fragment currentFragment) {
        super.onDonePressed(currentFragment);
        // Do something when users tap on Done button.
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        finish();
    }

    @Override
    public void onSlideChanged(@Nullable Fragment oldFragment, @Nullable Fragment newFragment) {
        super.onSlideChanged(oldFragment, newFragment);
        // Do something when the slide changes.
    }
}