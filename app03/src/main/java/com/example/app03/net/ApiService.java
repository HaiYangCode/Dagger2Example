package com.example.app03.net;


import io.reactivex.Observable;
import retrofit2.http.GET;

public interface ApiService {
    @GET("/user/info")
    Observable<String> getUserInfo();
}
