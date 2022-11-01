package com.example.app03;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.example.app03.app.DaggerApplicationComponent;
import com.example.app03.net.ApiService;
import com.example.app03.net.ApiServiceComponent;
import com.example.app03.net.DaggerApiServiceComponent;
import com.example.app03.net.DaggerBaseHttpComponent;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    ApiService apiService;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DaggerApiServiceComponent.builder()
                .baseHttpComponent(DaggerBaseHttpComponent.builder()
                        .applicationComponent(DaggerApplicationComponent.create())
                        .build()).build()
                .inject(this);
        Log.i("TAG", "apiService == " + apiService);

    }
}