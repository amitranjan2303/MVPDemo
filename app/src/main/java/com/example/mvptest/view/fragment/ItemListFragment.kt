package com.example.mvptest.view.fragment

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ProgressBar
import android.widget.Toast
import com.example.mvptest.R
import com.example.mvptest.contract.Contract
import com.example.mvptest.model.BaseModel
import com.example.mvptest.model.Item
import com.example.mvptest.presenter.MainPresenterImpl
import com.example.mvptest.view.adapter.ItemDataAdapter

class ItemListFragment : Fragment(), Contract.MainView {

    private lateinit var mRecyclerView: RecyclerView
    private lateinit var mProgressbar: ProgressBar
    private lateinit var mItemDataAdapter: ItemDataAdapter
    private lateinit var mPresenter: MainPresenterImpl
    private lateinit var mListeItemModel: ArrayList<Any>

    override fun onAttachFragment(fragment: Fragment?) {
        super.onAttachFragment(fragment)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        var view: View = inflater.inflate(R.layout.item_list_fragment, container, false)
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        init(view)
        //setup Adapter
        mListeItemModel = ArrayList<Any>()
        mItemDataAdapter = ItemDataAdapter(mListeItemModel)
        //setUp RecyclerView
        val linearLayoutManager: LinearLayoutManager = LinearLayoutManager(context)
        mRecyclerView.layoutManager = linearLayoutManager
        mRecyclerView.adapter = mItemDataAdapter
        //setup presenter
        mPresenter= MainPresenterImpl(this,context!!)
        mPresenter.start()
    }

    fun init(view: View) {
        mRecyclerView = view?.findViewById(R.id.recyclerview)
        mProgressbar = view?.findViewById(R.id.progressbar)
    }

    override fun updateView(itemList: ArrayList<Item>) {
        var list=ArrayList<Any>()
        list.addAll(itemList)
        mItemDataAdapter.updateList(list)
    }

    override fun showError(message: String) {
       //Todo for here shoing toast as per requirement we can show dialog
        Toast.makeText(context,message,Toast.LENGTH_LONG).show()
    }

    override fun hideError() {
        //Todo as per requirement hide dialog
    }

    override fun showLoading() {
       mProgressbar?.visibility=View.VISIBLE
    }

    override fun hideLoading() {
        mProgressbar?.visibility=View.GONE
    }
}