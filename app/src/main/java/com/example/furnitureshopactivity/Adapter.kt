package com.example.furnitureshopactivity

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class Adapter (var listaProdutos : List<Pair<String, String>>) : RecyclerView.Adapter<Adapter.ViewHolder> () {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Adapter.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.layout_linha_produto, parent, false)
        val viewHolderListaProdutos = ViewHolder(view)
        return viewHolderListaProdutos
    }

    override fun onBindViewHolder(holder: Adapter.ViewHolder, position: Int) {
        val produto = listaProdutos[position]
        holder.preencherLista(produto.first, produto.second)
    }

    override fun getItemCount(): Int {
        return listaProdutos.size
    }

    class ViewHolder (itemView: View) : RecyclerView.ViewHolder(itemView) {
        var produtoTela = itemView.findViewById<ImageView>(R.id.imagemProduto)
        val complementoTela = itemView.findViewById<TextView>(R.id.textoComplemento)

        fun preencherLista (produto: String, complemento: String) {
            Glide.with(itemView.context).load(produto).into(produtoTela)
            complementoTela.text = complemento

            /*complementoTela.setOnClickListener {
                val goToNextPage = Intent(this, FurnitureShopActivity2 ::class.java)
                startActivity(goToNextPage)
            }*/
        }
    }
}