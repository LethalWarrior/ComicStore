package com.dicoding.comicstore

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class CardViewComicAdapter(private val listComic: ArrayList<Comic>) : RecyclerView.Adapter<CardViewComicAdapter.CardViewViewHolder>() {

    private lateinit var onItemClickCallback: OnItemClickCallback

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_cardview_comic, parent, false)
        return CardViewViewHolder(view)
    }

    override fun onBindViewHolder(holder: CardViewViewHolder, position: Int) {
        val comic = listComic[position]

        Glide.with(holder.itemView.context)
            .load(comic.cover)
            .apply(RequestOptions().override(279, 396))
            .into(holder.imgCover)

        holder.tvTitle.text = comic.title
        holder.tvAuthor.text = comic.author
        holder.tvDescription.text = comic.description
        holder.tvPrice.text = comic.price

        holder.itemView.setOnClickListener{onItemClickCallback.onItemClicked(listComic[holder.adapterPosition])}
    }

    override fun getItemCount(): Int {
        return listComic.size
    }

    inner class CardViewViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var imgCover: ImageView = itemView.findViewById(R.id.img_item_cover)
        var tvTitle: TextView = itemView.findViewById(R.id.tv_item_title)
        var tvAuthor: TextView = itemView.findViewById(R.id.tv_item_author)
        var tvDescription: TextView = itemView.findViewById(R.id.tv_item_description)
        var tvPrice: TextView = itemView.findViewById(R.id.tv_item_price)
    }

    interface OnItemClickCallback {
        fun onItemClicked(data: Comic)
    }
}