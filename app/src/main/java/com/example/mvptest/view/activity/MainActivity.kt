package com.example.mvptest.view.activity

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.mvptest.R
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentTransaction
import com.example.mvptest.view.fragment.ItemListFragment


class MainActivity : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setUpFramment()
    }

    private fun setUpFramment() {
        val fragment: ItemListFragment = ItemListFragment()
        val manager: FragmentManager = supportFragmentManager
        val transaction: FragmentTransaction = manager.beginTransaction()
        transaction.add(R.id.frame_container, fragment)
        transaction.commit()
    }
}
