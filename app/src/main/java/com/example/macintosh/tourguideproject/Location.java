package com.example.macintosh.tourguideproject;

/**
 * Created by macintosh on 01/03/2018.
 */

public class Location {
    private String name;
    private String address;
    private String phonenumber;
    private int imageResID;

    public Location(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public Location(String name, String address, int imageResID) {
        this.name = name;
        this.address = address;
        this.imageResID = imageResID;
    }

    public Location(String name, String address, String phonenumber) {
        this.name = name;
        this.address = address;
        this.phonenumber = phonenumber;
    }

    public Location(String name, String address, String phonenumber, int imageResID) {
        this.name = name;
        this.address = address;
        this.phonenumber = phonenumber;
        this.imageResID = imageResID;
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

    public String getPhonenumber() {
        return phonenumber;
    }
}
