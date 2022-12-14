package com.example.app01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {
    @Inject
    SingleInstance instance;
    @Inject
    User user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DaggerApplicationComponent.create().inject(this);
        Log.i("TAG", "instance == " + instance);
        Log.i("TAG", "user == " + user);
    }
}