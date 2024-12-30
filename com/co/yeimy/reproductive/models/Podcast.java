package com.co.yeimy.reproductive.models;

import com.co.yeimy.reproductive.models.Audio;

public class Podcast extends Audio{
    private String presenter, description;

    @Override
    public int getRating(){
       if (getTotalReproductive()>=2000)
            return 9;
       else 
            return 2;
    }

    public String getPresenter() {
        return presenter;
    }

    public void setPresenter(String presenter) {
        this.presenter = presenter;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
}
