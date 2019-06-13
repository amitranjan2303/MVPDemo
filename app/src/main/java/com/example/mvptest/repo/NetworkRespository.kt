package com.example.mvptest.repo

import android.content.Context
import com.example.mvptest.R
import com.example.mvptest.model.Dummy
import com.example.mvptest.network.NetworkApiService
import com.example.mvptest.network.RetrofitClientInstance
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class NetworkRespository(val networkCallback: NetworkCallback, val context: Context) {

    fun getItemsList() {

        val apiService: NetworkApiService = RetrofitClientInstance.buildService(NetworkApiService::class.java)
        val call: Call<Dummy> = apiService?.getAllData()

        call?.enqueue(object : Callback<Dummy> {

            override fun onResponse(call: Call<Dummy>, response: Response<Dummy>) {

                if (response.isSuccessful) {
                    networkCallback?.onResponse(response.body()!!)
                } else {
                    networkCallback?.onError(context?.resources.getString(R.string.error_mgs))
                }
            }

            override fun onFailure(call: Call<Dummy>, t: Throwable) {
                networkCallback?.onError(t.message.toString())
            }
        })
    }
}
