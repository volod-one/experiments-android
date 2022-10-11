package com.example.experimentsandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.experimentsandroid.databinding.ActivityToastBinding

class ToastActivity : AppCompatActivity() {
    private lateinit var binding: ActivityToastBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityToastBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val btnRunToast = binding.runToast
        btnRunToast.setOnClickListener {
            val text = intent.getStringExtra("toast")
            val duration = Toast.LENGTH_LONG
            val toast = Toast.makeText(this, text, duration)
            toast.show()
        }

        val btnCloseActivity = binding.closeToastActivity
        btnCloseActivity.setOnClickListener {
            finish()
        }
    }
}