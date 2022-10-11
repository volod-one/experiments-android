package com.example.experimentsandroid

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
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

    @Deprecated("Deprecated in Java")
    override fun onBackPressed() {
        AlertDialog.Builder(this)
            .setTitle("Exit!")
            .setMessage("Are you sure you want to leave?")
            .setPositiveButton(android.R.string.ok) { _, _ ->
                finishAndRemoveTask()
            }
            .setNegativeButton(android.R.string.cancel, null)
            .show()
    }
}