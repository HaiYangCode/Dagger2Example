package com.example.app06

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.app06.ext.threadTransformer
import com.example.app06.net.ApiService
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    @Inject
    lateinit var apiService: ApiService
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.i("TAG", "apiService === $apiService")
        apiService.getUserInfo()
            .threadTransformer()
            .subscribe({
                Log.i("TAG", "success==$it")
            }, {
                Log.i("TAG", "throwable==$it")
            })


    }
}