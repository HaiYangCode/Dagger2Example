package com.example.dagger2demojava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;


import com.example.dagger2demojava.di.ApiService;
import com.example.dagger2demojava.di.DaggerApplicationComponent;
import com.example.dagger2demojava.di.DaggerUserComponent;
import com.example.dagger2demojava.di.User;
import com.example.dagger2demojava.di.UserComponent;

import javax.inject.Inject;

import retrofit2.Retrofit;

public class MainActivity extends AppCompatActivity {

    @Inject
    User user;

    //    @Inject
//    Retrofit retrofit;
//    @Inject
//    Retrofit retrofit2;
//
//    @Inject
//    ApiService apiService;
//    @Inject
//    ApiService apiService2;
    UserComponent userComponent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        MyApp.getDaggerApplicationComponent().inject(this);

        userComponent = DaggerUserComponent.builder().applicationComponent(MyApp.getDaggerApplicationComponent()).build();

        userComponent.inject(this);
        Log.i("user", "user = = " + user);
//        Log.i("user", "retrofit = = " + retrofit);
//        Log.i("user", "retrofit = = " + retrofit2);
//        Log.i("user", "apiService = = " + apiService);
//        Log.i("user", "apiService = = " + apiService2);
    }
}