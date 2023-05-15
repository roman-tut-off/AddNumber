package com.example.addnumber

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.addnumber.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var bind: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        bind = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(bind.root)
        var counter = 0
        val viewModel = ViewModelProvider(this).get(MainViewModel::class.java)
        bind.TextView.text = viewModel.number.toString()

        bind.buttonAdd.setOnClickListener {
            bind.TextView.text = viewModel.number.toString()
            viewModel.addNumber()
        }
    }
}