package com.example.app04;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.example.app04.net.ApiService;

import javax.inject.Inject;


public class MainActivity extends AppCompatActivity {

    @Inject
    ApiService apiService;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DaggerApplicationComponent.create()
                .createApiServiceComponent()
                .create()
                .inject(this);
        Log.i("TAG", "apiService == " + apiService);
    }
}