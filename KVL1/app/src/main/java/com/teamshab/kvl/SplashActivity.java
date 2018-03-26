package com.teamshab.kvl;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.daimajia.androidanimations.library.Techniques;
import com.viksaa.sssplash.lib.activity.AwesomeSplash;
import com.viksaa.sssplash.lib.cnst.Flags;
import com.viksaa.sssplash.lib.model.ConfigSplash;

public class SplashActivity extends AwesomeSplash {

    @Override
    public void initSplash(ConfigSplash configSplash) {

        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        //Background Animation
        configSplash.setBackgroundColor(R.color.colorSecondary);
        configSplash.setAnimCircularRevealDuration(2000);
        /*configSplash.setRevealFlagX(Flags.REVEAL_LEFT);
        configSplash.setRevealFlagX(Flags.REVEAL_BOTTOM);*/
        configSplash.setRevealFlagX(Flags.REVEAL_RIGHT);

        //Logo Animation
        configSplash.setLogoSplash(R.drawable.kvl_logo_1);
        configSplash.setAnimLogoSplashDuration(5000);
        configSplash.setAnimPathFillingDuration(3000);
        configSplash.setAnimLogoSplashTechnique(Techniques.BounceIn);

        //Title
        configSplash.setTitleSplash(getString(R.string.knust_virtual_library));
        configSplash.setTitleTextColor(R.color.white);
        configSplash.setTitleTextSize(30f);
        configSplash.setAnimTitleDuration(3000);
        configSplash.setAnimTitleTechnique(Techniques.FadeInLeft);
    }

    @Override
    public void animationsFinished() {

        Intent intent = new Intent(SplashActivity.this, MainActivity.class);
        startActivity(intent);

    }
}
