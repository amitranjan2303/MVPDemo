package com.example.mvptest.repo

import com.example.mvptest.model.BaseModel

open interface NetworkCallback {
    fun onResponse(any: Any)
    fun onError(message: String)
}