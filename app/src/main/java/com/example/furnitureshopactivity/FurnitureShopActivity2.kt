package com.example.furnitureshopactivity

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class FurnitureShopActivity2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_furniture_shop2)

            val buyNow = findViewById<TextView>(R.id.imageText)
            val buttonBack = findViewById<TextView>(R.id.backText)

            buyNow.setOnClickListener {
                val goToPayment = Intent(this, FurnitureShop2Finalizing ::class.java)
                startActivity(goToPayment)
            }

            buttonBack.setOnClickListener {
                val backToFirstPage = Intent(this, MainActivity ::class.java)
                startActivity(backToFirstPage)
            }
        }
    }


