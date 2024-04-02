package com.example.splash_animation_r3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class SplashScreen extends AppCompatActivity {

    ImageView ivLogo;
    TextView tvSlogan;
    Animation logo_anim;
    Animation slogan_anim;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        init();
        ivLogo.setAnimation(logo_anim);
        tvSlogan.setAnimation(slogan_anim);

        //Intents
        new Handler()
                .postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        startActivity(new Intent(SplashScreen.this, MainActivity.class));
                        finish();
                    }
                }, 2000);
    }

    private void init()
    {
        ivLogo = findViewById(R.id.ivLogo);
        tvSlogan = findViewById(R.id.tvSlogan);
        logo_anim = AnimationUtils.loadAnimation(this, R.anim.logo_animation);
        slogan_anim = AnimationUtils.loadAnimation(this, R.anim.slogan_animation);
    }
}