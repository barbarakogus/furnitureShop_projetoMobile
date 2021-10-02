package com.example.furnitureshopactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    val listaProdutos = mutableListOf(
        "kitchen" to "https://ambientearcondicionado.com.br/blog/wp-content/uploads/2020/10/ACK02180.jpg",
        "living room" to "https://blog.conectareforma.com.br/wp-content/uploads/2020/11/Arquitetura-Residencial-%E2%80%93-Tambor%C3%A9-600-m2-%E2%80%93-Arquitetura-e-Design-de-Interiores-de-Alto-Padr%C3%A3o-768x545.jpg",
        "bedroom" to "https://images.arquidicas.com.br/wp-content/uploads/2015/10/01234756/quarto-de-casal-1024x719.png",
        "office" to "https://cdnm.westwing.com.br/glossary/uploads/br/2016/01/01201134/escrit%C3%B3rio-com-mesa-de-madeira-e-prateleira-e-cadeira-de-rotina_iStock_c-a1690.jpg",
        "gourmet area" to "https://www.ceramicaportinari.com.br/blog/htdocs/content/uploads/2019/01/2.jpg",
        "bathroom" to "https://www.decorfacil.com/wp-content/uploads/2018/05/20180523banheiros-pequenos-decorados-60-1.jpg"
    )


    var recyclerViewProdutos : RecyclerView? = null
    var adapterListaProdutos : Adapter? = null
    var complementoTela : TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerViewProdutos = findViewById(R.id.recyclerViewProdutos)
        complementoTela = findViewById(R.id.textoComplemento)

        adapterListaProdutos = Adapter(listaProdutos, onClick = {
            val intent = when (listaProdutos[it].first) {
                "kitchen" -> Intent(this, kitchenSection ::class.java)
                "living room" -> Intent(this, FurnitureShopActivity2 ::class.java)
                else -> null
            }
            Log.d("kogus", listaProdutos[it].first)
            intent?.putExtra("sectionName", listaProdutos[it].first)
            Log.d("barbara", it.toString())
            intent?.let{startActivity(it)}
        })
        recyclerViewProdutos?.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        recyclerViewProdutos?.adapter = adapterListaProdutos
    }
}