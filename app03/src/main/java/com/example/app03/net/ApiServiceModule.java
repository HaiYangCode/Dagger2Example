package com.example.app03.net;

import dagger.Module;
import dagger.Provides;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

@Module
public class ApiServiceModule {

    @NetScope
    @Provides
    ApiService providerApiService(Retrofit retrofit) {
        return retrofit.create(ApiService.class);
    }
}
