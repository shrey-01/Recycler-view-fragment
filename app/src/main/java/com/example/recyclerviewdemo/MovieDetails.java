package com.example.recyclerviewdemo;

public class MovieDetails {

    private String movieName;
    private double rating;
    private int image;
    public MovieDetails(String movieName, double rating, int image){

        this.movieName=movieName;
        this.rating=rating;
        this.image=image;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }



    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }
    public double getRating(){
        return rating;
    }
}
