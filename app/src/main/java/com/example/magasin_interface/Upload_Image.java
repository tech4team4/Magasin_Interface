package com.example.magasin_interface;

public class Upload_Image {
    private String ImageURL;

    public String getImageURL() {
        return ImageURL;
    }

    public void setImageURL(String imageURL) {
        ImageURL = imageURL;
    }

    public Upload_Image() {
    }

    public Upload_Image(String imageURL) {
        ImageURL = imageURL;
    }
}
