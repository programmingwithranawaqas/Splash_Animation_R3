package com.example.splash_animation_r3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Home extends AppCompatActivity {

    TextView tvResult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Intent i = getIntent();

        String text = "ID : "+i.getStringExtra("key_id")+
        "\nNAME : "+i.getStringExtra("key_name")+
        "\nSEMESTER : "+i.getStringExtra("key_sem");

        tvResult = findViewById(R.id.tvResult);
        tvResult.setText(text);


    }
}