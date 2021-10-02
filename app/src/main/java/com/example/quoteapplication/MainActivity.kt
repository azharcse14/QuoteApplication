package com.example.quoteapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onPrevious(view: android.view.View) {}
    fun onNext(view: android.view.View) {}
    fun onShare(view: android.view.View) {}
}