package com.example.kinoshop

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import kotlinx.android.synthetic.main.layout_movie_list_item.view.*

class MovieAdapter: RecyclerView.Adapter<RecyclerView.ViewHolder>(){

    private var items: List<Movie> = ArrayList()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return MovieViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.layout_movie_list_item, parent, false)
        )
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when(holder){
            is MovieViewHolder ->{
                holder.bind(items.get(position))
            }
        }
    }
    override fun getItemCount(): Int {
        return items.size
    }

    fun submitList(movieList: List<Movie>){
        items=movieList
    }

    class MovieViewHolder constructor(
        itemView: View
    ): RecyclerView.ViewHolder(itemView){
        val movieTitle:TextView = itemView.movie_title
        val movieYear:TextView = itemView.movie_year
        val movieImg: ImageView = itemView.movie_img
        val movieCountry:TextView = itemView.movie_country
        val movieGenre:TextView = itemView.movie_genre

        fun bind(movie: Movie){
            movieTitle.setText(movie.title)
            movieYear.setText((movie.year.toString()))
            movieCountry.setText((movie.country))
            movieGenre.setText((movie.genre))

            val requestOptions = RequestOptions()
                .placeholder(R.drawable.ic_launcher_background)
                .error(R.drawable.ic_launcher_foreground)

            Glide.with(itemView.context)
                .applyDefaultRequestOptions(requestOptions)
                .load(movie.image)
                .into(movieImg)
        }
    }


}