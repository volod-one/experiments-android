package com.example.experimentsandroid

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.experimentsandroid.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val btnToToastActivity = binding.openToastActivity
        btnToToastActivity.setOnClickListener {
            val intent = Intent(this, ToastActivity::class.java)
            intent.putExtra("toast", "Hello from MainActivity")
            startActivity(intent)
        }
    }
}