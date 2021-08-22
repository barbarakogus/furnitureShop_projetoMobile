package com.example.furnitureshopactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class FurnitureShop2Finalizing : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_furniture_shop2_finalizing)

        val buttonBack = findViewById<TextView>(R.id.backTextPayment)
        buttonBack.setOnClickListener {
            val backToPreviousPage = Intent(this, FurnitureShopActivity2 ::class.java)
            startActivity(backToPreviousPage)
        }
    }
}