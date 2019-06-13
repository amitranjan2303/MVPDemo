package com.example.mvptest.network

import com.example.mvptest.util.Constants
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


object RetrofitClientInstance {

    /* //Creating Auth Interceptor to add api_key query in front of all the requests.
     private val authInterceptor = Interceptor {chain->
         val newUrl = chain.request().url()
             .newBuilder()
             .addQueryParameter("api_key", AppConstants.tmdbApiKey)
             .build()

         val newRequest = chain.request()
             .newBuilder()
             .url(newUrl)
             .build()

         chain.proceed(newRequest)
     }

     //OkhttpClient for building http request url when we use intercepter
     private val tmdbClient = OkHttpClient().newBuilder()
         .addInterceptor(authInterceptor)
         .build()*/
    //OkhttpClient for building http request url
    private val okHttpClient: OkHttpClient.Builder = OkHttpClient.Builder()

   //Create Retrofit Instance
    private val retrofit: Retrofit = Retrofit.Builder()
        .client(okHttpClient.build())
        .baseUrl(Constants.BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    fun <T> buildService(serviceType:Class<T>):T{
        return retrofit.create(serviceType)
    }
}