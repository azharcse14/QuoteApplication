package com.example.quoteapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider

class MainActivity : AppCompatActivity() {

    lateinit var mainViewModel: MainViewModel

    private val quoteText:TextView
        get() = findViewById(R.id.quoteText)

    private val quoteAuthor:TextView
        get() = findViewById(R.id.quoteAuthor)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        
        mainViewModel = ViewModelProvider(this, MainViewModelFactory(application)).get(MainViewModel::class.java)
        setQuote(mainViewModel.getQuote())
    }

    private fun setQuote(quote: Quote) {
        quoteText.text= quote.text
        quoteAuthor.text = quote.author
    }

    fun onPrevious(view: android.view.View) {
        setQuote(mainViewModel.previousQuote())
    }
    fun onNext(view: android.view.View) {
        setQuote(mainViewModel.nextQuote())
    }
    fun onShare(view: android.view.View) {
        
    }
}