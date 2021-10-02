package com.example.furnitureshopactivity

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class AdapterRecommendedProducts (val listaProductRecommended : List<kitchenSection.ListRecommendedProducts>) : RecyclerView.Adapter<AdapterRecommendedProducts.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) : ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.layout_linha_recommended, parent, false)
        val viewHolderRecommendedProducts = ViewHolder(view)
        return viewHolderRecommendedProducts
    }

    override fun onBindViewHolder(holder : ViewHolder, position: Int) {
        val recommendedProduct = listaProductRecommended[position]
        holder.preencherRecyclerView(recommendedProduct)
    }

    override fun getItemCount(): Int {
        return listaProductRecommended.size
    }

    class ViewHolder (itemView : View) : RecyclerView.ViewHolder(itemView) {
        val imagemRecommendedProduct = itemView.findViewById<ImageView>(R.id.product_recommended)
        val priceRecommendedProduct = itemView.findViewById<TextView>(R.id.price_text)
        val descriptionRecommendedProduct = itemView.findViewById<TextView>(R.id.product_description)

        fun preencherRecyclerView (product : kitchenSection.ListRecommendedProducts) {
            Glide.with(itemView.context).load(product.product).into(imagemRecommendedProduct)
            priceRecommendedProduct.text = product.price
            descriptionRecommendedProduct.text = product.description
        }
    }
}

