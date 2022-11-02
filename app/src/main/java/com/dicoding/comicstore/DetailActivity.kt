package com.dicoding.comicstore

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class DetailActivity : AppCompatActivity() {
    companion object {
        const val EXTRA_COMIC = "extra_comic"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val imgDetailCover: ImageView = findViewById(R.id.img_detail_cover)

        val tvDetailTitle: TextView = findViewById(R.id.tv_detail_title)
        val tvDetailAuthor: TextView = findViewById(R.id.tv_detail_author)
        val tvDetailPrice: TextView = findViewById(R.id.tv_detail_price)
        val tvDetailDescription: TextView = findViewById(R.id.tv_detail_description)
        val tvDetailGenre: TextView = findViewById(R.id.tv_detail_genre)
        val tvDetailPages: TextView = findViewById(R.id.tv_detail_pages)
        val tvDetailPublicationDate: TextView = findViewById(R.id.tv_detail_publication_date)
        val tvDetailPublisher: TextView = findViewById(R.id.tv_detail_publisher)
        val tvDetailIsbn: TextView = findViewById(R.id.tv_detail_isbn)

        val btnAddToCart: Button = findViewById(R.id.btn_add_to_cart)
        btnAddToCart.setOnClickListener(View.OnClickListener {
            Toast.makeText(this, "Added to Cart!", Toast.LENGTH_SHORT).show()
        })

        val comic: Comic = intent.getParcelableExtra<Comic>(EXTRA_COMIC) as Comic
        tvDetailTitle.text = comic.title
        tvDetailAuthor.text = comic.author
        tvDetailPrice.text = comic.price
        tvDetailDescription.text = comic.description
        tvDetailGenre.text = comic.genre
        tvDetailPages.text = comic.pages.toString()
        tvDetailPublicationDate.text = comic.publicationDate
        tvDetailPublisher.text = comic.publisher
        tvDetailIsbn.text = comic.isbn
        imgDetailCover.setImageResource(comic.cover)

    }
}