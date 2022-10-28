package com.example.dagger2demojava.di;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;

@Module
public class NetModule {

    //告诉dagger可以通过该方法获得实例
    @Provides
    public Retrofit providerRetrofit(OkHttpClient okHttpClient) {
        return new Retrofit.Builder()
                .baseUrl("http://baidu.com/")
                .client(okHttpClient)
                .build();
    }

    @Provides
    public OkHttpClient providerOkHttpClient() {
        return new OkHttpClient();
    }

    //这种方式会自动找当前类中是否有提供该参数的方法，如果有的话就会调用默认的这个方法
    @Singleton
    @Provides
    public ApiService providerApiService(Retrofit retrofit) {
        return retrofit.create(ApiService.class);
    }
}
