package com.dicoding.comicstore

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var rvComics: RecyclerView
    private var listComic: ArrayList<Comic> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvComics = findViewById(R.id.rv_comics)
        rvComics.setHasFixedSize(true)

        listComic.addAll(ComicsData.listData)
        showRecyclerCardView()
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if(item.itemId == R.id.action_about_page) {
            val intentObject = Intent(this@MainActivity, AboutActivity::class.java)
            startActivity(intentObject)
        }
        return super.onOptionsItemSelected(item)
    }

    private fun showRecyclerCardView() {
        rvComics.layoutManager = LinearLayoutManager(this)
        val cardViewComicAdapter = CardViewComicAdapter(listComic)
        rvComics.adapter = cardViewComicAdapter

        cardViewComicAdapter.setOnItemClickCallback(object : CardViewComicAdapter.OnItemClickCallback {
            override fun onItemClicked(data: Comic) {
                val intentObject = Intent(this@MainActivity, DetailActivity::class.java)
                intentObject.putExtra(DetailActivity.EXTRA_COMIC, data)
                startActivity(intentObject)
            }
        })

    }
}