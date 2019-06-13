package com.example.mvptest.network


import com.example.mvptest.model.Dummy
import retrofit2.Call
import retrofit2.http.GET

interface NetworkApiService {

    //@GET("/v2/5d013c543200002800f9db35")
    @GET("/v2/5d0296e33100005a00ab30a1")
    fun getAllData(): Call<Dummy>
}