package com.example.furnitureshopactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    val listaProdutos = mutableListOf<Pair<String, String>>()

    var recyclerViewProdutos : RecyclerView? = null
    var adapterListaProdutos : Adapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerViewProdutos = findViewById(R.id.recyclerViewProdutos)

        val produto1 = "https://ambientearcondicionado.com.br/blog/wp-content/uploads/2020/10/ACK02180.jpg"
        val complementoProduto1 = "kitchen"
        val produto2 = "https://blog.conectareforma.com.br/wp-content/uploads/2020/11/Arquitetura-Residencial-%E2%80%93-Tambor%C3%A9-600-m2-%E2%80%93-Arquitetura-e-Design-de-Interiores-de-Alto-Padr%C3%A3o-768x545.jpg"
        val complementoProduto2 = "living room"
        val produto3 = "https://images.arquidicas.com.br/wp-content/uploads/2015/10/01234756/quarto-de-casal-1024x719.png"
        val complementoProduto3 = "bedroom"
        val produto4 = "https://cdnm.westwing.com.br/glossary/uploads/br/2016/01/01201134/escrit%C3%B3rio-com-mesa-de-madeira-e-prateleira-e-cadeira-de-rotina_iStock_c-a1690.jpg"
        val complementoProduto4 = "office"
        val produto5 = "https://www.ceramicaportinari.com.br/blog/htdocs/content/uploads/2019/01/2.jpg"
        val complementoProduto5 = "gourmet area"
        val produto6 = "https://www.decorfacil.com/wp-content/uploads/2018/05/20180523banheiros-pequenos-decorados-60-1.jpg"
        val complementoProduto6 = "bathroom"
        criarLista(produto1, complementoProduto1)
        criarLista(produto2, complementoProduto2)
        criarLista(produto3, complementoProduto3)
        criarLista(produto4, complementoProduto4)
        criarLista(produto5, complementoProduto5)
        criarLista(produto6, complementoProduto6)

        adapterListaProdutos = Adapter(listaProdutos)
        recyclerViewProdutos?.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        recyclerViewProdutos?.adapter = adapterListaProdutos
    }

    fun criarLista(produto: String, complemento : String) {
        listaProdutos.add(produto to complemento)
    }

}