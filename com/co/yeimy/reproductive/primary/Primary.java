package com.co.yeimy.reproductive.primary;

import com.co.yeimy.reproductive.models.Song;
import com.co.yeimy.reproductive.models.Podcast;

public class Primary {

    public static void main(String[] args) {
        Song mySong = new Song();
        mySong.setTitle("Forever");
        mySong.setSinger("Kiss");

        Podcast myPodcast = new Podcast();
        myPodcast.setPresenter("Gabriela Aguilar");
        myPodcast.setTitle("Cafe");
        
        for (int i = 0; i < 100; i++) {
            mySong.like();
        }for (int i = 0; i < 5000; i++) {
            mySong.reproductives();
        }

        System.out.println("Total de reproducciones: "+mySong.getTotalReproductive());
        System.out.println("Total de me gusta: "+mySong.getTotalLike());
    }
}
