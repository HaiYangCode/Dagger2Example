package com.example.app02;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.example.app02.dao.Name01;
import com.example.app02.dao.Name02;
import com.example.app02.dao.Student;
import com.example.app02.net.ApiService;
import com.example.app02.net.DaggerHttpComponent;


import javax.inject.Inject;
import javax.inject.Named;

public class MainActivity extends AppCompatActivity {


    @Name01
    @Inject
    Student stu01;
    @Name02
    @Inject
    Student stu02;
    @Named("threeParam")
    @Inject
    Student stu03;


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

        Log.i(" TAG", "stu01 === " + stu01);

        Log.i(" TAG", "stu02 === " + stu02);

        Log.i(" TAG", "stu03 === " + stu03);

    }
}