package com.example.app05;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import javax.inject.Inject;

import dagger.multibindings.IntoMap;

public class MainActivity extends AppCompatActivity {

    @Inject
    BInterface impl01;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DaggerApplicationComponent.create()
                .inject(this);

        Log.i("TAG", "impl01 === " + impl01.getClass().getSimpleName());
    }
}