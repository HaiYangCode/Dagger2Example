package com.example.dagger2demojava;

import android.app.Application;

import com.example.dagger2demojava.di.ApplicationComponent;
import com.example.dagger2demojava.di.DaggerApplicationComponent;

public class MyApp extends Application {
    static ApplicationComponent daggerApplicationComponent = DaggerApplicationComponent.create();

    public static ApplicationComponent getDaggerApplicationComponent() {
        return daggerApplicationComponent;
    }

    @Override
    public void onCreate() {
        super.onCreate();

    }
}
