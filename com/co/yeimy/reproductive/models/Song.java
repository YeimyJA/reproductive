package com.co.yeimy.reproductive.models;

public class Song extends Audio {
    private String album, singer, style;

    @Override
    public int getRating() {
        if (getTotalLike() > 5000)
            return 8;
        else 
            return 4;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    
}
