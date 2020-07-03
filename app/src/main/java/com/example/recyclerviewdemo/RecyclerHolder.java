package com.example.recyclerviewdemo;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

public class RecyclerHolder extends RecyclerView.ViewHolder {
    public TextView mMovieNameTextView;
    public TextView mRatingTextView;
    public ImageView mMovieImageView;
    public RecyclerHolder(View view) {

        super(view);
        mMovieNameTextView=view.findViewById(R.id.tv_movieName);
        mRatingTextView=view.findViewById(R.id.tv_rating);
        mMovieImageView=view.findViewById(R.id.iv);
    }
}
