package com.example.macintosh.tourguideproject;

/**
 * Created by macintosh on 01/03/2018.
 */

public class Location {
    private String name;
    private String address;
    private String phonenumber;
    private String description;
    private int imageResID = -1;


    public Location(String name, String address, String description) {
        this.name = name;
        this.address = address;
        this.description = description;
    }

    public Location(String name, String address, int imageResID) {
        this.name = name;
        this.address = address;
        this.imageResID = imageResID;
    }

    public Location(String name, String address, String phonenumber,String description) {
        this.name = name;
        this.address = address;
        this.phonenumber = phonenumber;
        this.description = description;
    }

    public Location(String name, String address, String phonenumber, String description, int imageResID) {
        this.name = name;
        this.address = address;
        this.phonenumber = phonenumber;
        this.imageResID = imageResID;
        this.description = description;
    }

    public int getImageResID() {
        return imageResID;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getDescription() {
        return description;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public boolean isHasImage() {
        return imageResID != -1;
    }
}
