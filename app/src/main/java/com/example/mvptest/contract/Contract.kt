package com.example.mvptest.contract

import com.example.mvptest.model.Item

interface Contract {

    interface MainPresenter {
        fun start()
    }

    interface MainView {
        fun showError(message: String)
        fun hideError()
        fun showLoading()
        fun hideLoading()
        fun updateView(itemList:ArrayList<Item>)
    }
}