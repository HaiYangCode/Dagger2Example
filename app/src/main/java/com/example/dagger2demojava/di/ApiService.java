package com.example.dagger2demojava.di;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiService {

    @GET("/get/name")
    Call<String> getUserInfo();
}
