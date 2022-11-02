package com.example.app04.net;

import dagger.Module;
import dagger.Provides;
import hu.akarnokd.rxjava3.retrofit.RxJava3CallAdapterFactory;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

@Module
public class ApiServiceModule {
    //TODO 在module提供实例
    @NetScope
    @Provides
    String providerUrl() {
        return "http://www.baidu.com";
    }

    @NetScope
    @Provides
    GsonConverterFactory providerGsonConverterFactory() {
        return GsonConverterFactory.create();
    }

    @NetScope
    @Provides
    RxJava3CallAdapterFactory providerRxjava3CallAdapterFactory() {

        return RxJava3CallAdapterFactory.create();
    }

    /**
     * 1. 这里可以通过作用域限制实例使用的范围,这里的作用域必须和自己的Component使用的一样。
     * 2. 一个Component只能有一个作用域修饰符。
     *
     * @return
     */
    @NetScope
    @Provides
    OkHttpClient providerOkHttpClient() {
        return new OkHttpClient.Builder()
                //TODO  这里可以添加各种拦截器
                .build();
    }

    @NetScope
    @Provides
    Retrofit providerRetrofit(String url,
                              OkHttpClient okHttpClient,
                              GsonConverterFactory gsonConverterFactory,
                              RxJava3CallAdapterFactory rxJava3CallAdapterFactory) {
        return new Retrofit.Builder()
                .baseUrl(url)
                .client(okHttpClient)
                .addConverterFactory(gsonConverterFactory)
                .addCallAdapterFactory(rxJava3CallAdapterFactory)
                .build();
    }

    @NetScope
    @Provides
    ApiService providerApiService(Retrofit retrofit) {
        return retrofit.create(ApiService.class);
    }
}
