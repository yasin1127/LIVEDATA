package com.example.livedata


import android.os.Bundle
import android.view.LayoutInflater
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.livedata.databinding.ActivityMainBinding
import com.example.livedata.viewmodel.CVM

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val cvm:CVM by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        cvm.co.observe(this, {binding.ctxt.text=it.toString()})

        binding.icbtn.setOnClickListener {
            cvm.incrementC()

        }
        binding.dcbtn.setOnClickListener {
            cvm.decrementC()

        }
        binding.rbtn.setOnClickListener {
            cvm.resetC()

        }

    }
}