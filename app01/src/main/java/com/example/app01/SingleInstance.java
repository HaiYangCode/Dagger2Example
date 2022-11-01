package com.example.app01;

import android.util.Log;

import javax.inject.Inject;

public class SingleInstance {
    @Inject
    User user;

    @Inject
    public SingleInstance() {
        DaggerApplicationComponent.create().inject(this);
        Log.i("TAG", "SingleInstance === " + user);
    }
}
