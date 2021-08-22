package com.example.furnitureshopactivity

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import com.example.furnitureshopactivity.databinding.ActivityFurnitureShop2Binding

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


