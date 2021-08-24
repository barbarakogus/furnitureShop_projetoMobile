package com.example.furnitureshopactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.furnitureshopactivity.R.id.recyclerViewProdutos

class MainActivity : AppCompatActivity() {

    //val produto1 = R.drawable.bedroom
    //val complementoProduto1 = "Discover studio"
    //val produto2 = R.drawable.meeting_room
    //val complementoProduto2 = "Discover studio"

    val complementoProduto3 = "Discover stuido"

    val listaProdutos = mutableListOf<Pair<String, String>>()

    var recyclerViewProdutos : RecyclerView? = null
    var adapterListaProdutos : Adapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerViewProdutos = findViewById(R.id.recyclerViewProdutos)

        //criarLista(produto1, complementoProduto1)
        //criarLista(produto2, complementoProduto2)

        //Passar a string com a URL da imagem é menos complexo e custoso
        //Como o ImageView será inflado pelo adapter, basta que o adaptador use
        //O Glide para colocar o conteúdo da imagem
        val produto3 = "https://ambientearcondicionado.com.br/blog/wp-content/uploads/2020/10/ACK02180.jpg"
        criarLista(produto3, complementoProduto3)

        adapterListaProdutos = Adapter(listaProdutos)
        recyclerViewProdutos?.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        recyclerViewProdutos?.adapter = adapterListaProdutos
    }

    fun criarLista(produto: String, complemento : String) {
        listaProdutos.add(produto to complemento)
    }

}