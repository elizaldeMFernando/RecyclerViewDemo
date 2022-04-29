package com.example.recyclerviewdemo

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MoviesAdapter(val movies:List<MovieDataClass>):RecyclerView.Adapter<MoviesAdapter.MoviesHolder>() {




    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MoviesHolder {
        val layoutInflater =  LayoutInflater.from(parent.context)
        return MoviesHolder(layoutInflater.inflate(R.layout.item_peliculas,parent,false))

    }

    override fun onBindViewHolder(holder: MoviesHolder, position: Int) {
        holder.render(movies[position])
    }

    override fun getItemCount(): Int {
        return movies.size
    }
    class MoviesHolder(val view: View):RecyclerView.ViewHolder(view){
        fun render(movie:MovieDataClass){
            view.findViewById<TextView>(R.id.tvNombre).text=movie.nombre
            view.findViewById<TextView>(R.id.tvGenero).text=movie.genero


        }
    }
}