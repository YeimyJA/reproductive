package com.co.yeimy.reproductive.models;

public class Audio {
    private String title;
    private int totalReproductive, totalLike, rating;

    public int getRating() {
        return rating;
    }
    public void setRaiting(int raiting) {
        this.rating = raiting;
    }
    public void like(){
        this.totalLike++;
    }
    public	void reproductives(){
        this.totalReproductive++;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public int getTotalReproductive() {
        return totalReproductive;
    }
    public void setTotalReproductive(int totalReproductive) {
        this.totalReproductive = totalReproductive;
    }
    public int getTotalLike() {
        return totalLike;
    }
    public void setTotalLike(int totalLike) {
        this.totalLike = totalLike;
    }
    
}
