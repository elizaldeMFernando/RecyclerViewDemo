package com.example.recyclerviewdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    val listaPeliculas = listOf(
        MovieDataClass("dr Strange","accion"),
        MovieDataClass("spiderman","accion"),
        MovieDataClass("encanto", "infantil")
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initRecycler()
    }
    fun initRecycler(){
        findViewById<RecyclerView>(R.id.rvSuperHero).layoutManager = LinearLayoutManager(this)
        val adapter=MoviesAdapter(listaPeliculas)
        findViewById<RecyclerView>(R.id.rvSuperHero).adapter=adapter
    }
}