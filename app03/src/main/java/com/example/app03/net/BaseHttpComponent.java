package com.example.app03.net;

import com.example.app03.MainActivity;
import com.example.app03.app.ApplicationComponent;

import dagger.Component;
import dagger.Provides;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

@BaseHttpScope
@Component(modules = BaseHttpModule.class, dependencies = ApplicationComponent.class)
public interface BaseHttpComponent {

    Retrofit providerRetrofit();
}
