package com.androidimplementation;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // initialization code

        for (int i = 0; i < 2000; i++) {

        }

        startActivity(new Intent(this, MainActivity.class));
        finish();
    }
}
