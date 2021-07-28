package com.example.recycleview;

public class FeaturedHelperClass {
    int image;
    String title,description;

    //then making getter
    public int getImage()
    {
        return image;
    }

    public String getTitle()
    {
        return title;
    }

    public String getDescription()
    {
        return description;
    }
//making a instance first
    public FeaturedHelperClass(int image, String title, String description) {
        this.image = image;
        this.title = title;
        this.description = description;
    }

}
