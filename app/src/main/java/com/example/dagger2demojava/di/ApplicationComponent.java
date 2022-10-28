package com.example.dagger2demojava.di;

import com.example.dagger2demojava.MainActivity;

import javax.inject.Singleton;

import dagger.Component;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;

//2. 指定Dagger注入到那个类
@Singleton
@Component(modules = {NetModule.class})
public interface ApplicationComponent {
    Retrofit retrofit();

    OkHttpClient okHttpClient();

    ApiService apiService();

//    void inject(MainActivity mainActivity);
}
