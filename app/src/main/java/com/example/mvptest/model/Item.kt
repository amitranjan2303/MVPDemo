package com.example.mvptest.model

data class Item(
    val type: String,
    val title: String,
    val subTitle: String,
    val url: String,
    val iconUrl: String
) : BaseModel()
