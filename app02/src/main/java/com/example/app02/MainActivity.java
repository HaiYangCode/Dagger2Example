package com.example.app02;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.example.app02.net.ApiService;
import com.example.app02.net.DaggerHttpComponent;


import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {


    @Inject
    ApiService apiService;

    @Inject
    ApiService apiService2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DaggerHttpComponent.builder()
                .build()
                .inject(this);
        Log.i(" TAG", "apiService === " + apiService);
        Log.i(" TAG", "apiService2 === " + apiService2);

    }
}