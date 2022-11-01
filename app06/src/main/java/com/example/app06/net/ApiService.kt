package com.example.app06.net

import io.reactivex.rxjava3.core.Observable
import retrofit2.http.GET

interface ApiService {
    @GET("/user/info")
    fun getUserInfo(): Observable<String>
}