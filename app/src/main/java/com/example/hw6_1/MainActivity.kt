package com.example.hw6_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import com.example.hw6_1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }

    private val viewModel: CounterViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        initListeners()
        observe()
    }

    private fun observe() {
        viewModel.count.observe(this) { count ->
            binding.tvCount.text = count.toString()
        }
    }

    private fun initListeners() {
        binding.apply {
            btnInc.setOnClickListener { viewModel.inc() }
            btnDec.setOnClickListener { viewModel.dec() }
        }
    }
}