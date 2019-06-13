package com.example.mvptest.presenter

import android.content.Context
import android.util.Log
import com.example.mvptest.contract.Contract
import com.example.mvptest.model.Dummy
import com.example.mvptest.repo.NetworkCallback
import com.example.mvptest.repo.NetworkRespository

open class MainPresenterImpl(private val mainView: Contract.MainView, private val context: Context) : Contract.MainPresenter,
    NetworkCallback {

    private val respository: NetworkRespository = NetworkRespository(this, context)

    override fun start() {
        mainView.showLoading()
        respository?.getItemsList()
    }

    override fun onResponse(baseModel: Any) {
        Log.d("AMIT "," success");
        mainView.hideLoading()
        if (baseModel is Dummy) {
            val dummy: Dummy = baseModel as Dummy
            mainView.updateView(dummy.results)
        }
    }

    override fun onError(message: String) {
        mainView.hideLoading()
        mainView.showError(message)
        Log.d("AMIT "," "+message);
    }
}