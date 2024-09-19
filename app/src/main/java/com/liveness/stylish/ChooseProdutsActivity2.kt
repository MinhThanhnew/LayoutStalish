package com.liveness.stylish

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.liveliness.stylish.R

class ChooseProdutsActivity2 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_choos_produts2)
        val btnNext: View = findViewById(R.id.btnNext2)
        btnNext.setOnClickListener {
            val intent: Intent = Intent(this, ChooseProdutsActivity3::class.java)
            startActivity(intent)
        }
    }
}