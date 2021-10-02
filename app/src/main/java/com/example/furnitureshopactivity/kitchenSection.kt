package com.example.furnitureshopactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class kitchenSection : AppCompatActivity() {

    data class ListRecommendedProducts (val product : String, val price : String, val description : String)

    val listaProductRecommended = listOf(
        ListRecommendedProducts("https://img2.gratispng.com/20180525/zok/kisspng-eames-lounge-chair-charles-and-ray-eames-eames-fib-5b0799d1cf0c44.1045103415272247858481.jpg", "$78,00", "Leather and wood chair"),
        ListRecommendedProducts("https://a-static.mlcdn.com.br/618x463/mesa-de-canto-bella-redonda-off-white-base-de-70-cm-decor-mobille/decormobille/1427p/ebce4fbf0e400c66bad5d39a53f9041e.jpg", "$100,00", "Wooden table"),
        ListRecommendedProducts("https://a-static.mlcdn.com.br/618x463/abajur-de-mesa-slim-68cm-castanho-cupula-algodao-cru-madelustre/ventilanet/5887p/5c0d57d5492ba040d3faeda0948a99be.jpg", "$88.00", "Table lamp"),
        ListRecommendedProducts("https://www.atelierclassico.com.br/media/catalog/product/cache/1/image/0dc2d03fe217f8c83829496872af24a0/a/m/amistad_-6185-carrinho-de-cha-com_bandeja.jpg", "$250,00", "Wooden tea cart")
    )

    var recyclerViewRecommended : RecyclerView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kitchen_section)

        val title = intent.getStringExtra("sectionName")
        Log.d("barbara", title.toString())
        val titleTela = findViewById<TextView>(R.id.title)
        titleTela.text = title

        recyclerViewRecommended = findViewById(R.id.recyclerViewRecommended)

        val adapterRecommendedProducts = AdapterRecommendedProducts(listaProductRecommended)
        recyclerViewRecommended?.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        recyclerViewRecommended?.adapter = adapterRecommendedProducts
    }
}

