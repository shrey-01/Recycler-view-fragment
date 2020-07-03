package com.example.recyclerviewdemo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerHolder> {
    private List<MovieDetails> mList;
    private Context mcontext;

    public RecyclerAdapter(List<MovieDetails> mList, Context mcontext) {
        this.mList=mList;
        this.mcontext=mcontext;

    }


    public RecyclerHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(mcontext).inflate(R.layout.movie_list,parent,false);

        return new RecyclerHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerHolder holder, int position) {
        holder.mMovieNameTextView.setText(mList.get(position).getMovieName());
        holder.mRatingTextView.setText(String.valueOf(mList.get(position).getRating()) );
        holder.mMovieImageView.setImageResource(mList.get(position).getImage());

    }

    @Override
    public int getItemCount() {
        return mList.size();
    }
}
