package com.example.macintosh.tourguideproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;

public class RestaurantANDcafeActivity extends AppCompatActivity {
    ArrayList<Location> list_cafes_rest;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurant_andcafe);

        list_cafes_rest = new ArrayList<>();

        list_cafes_rest.add(new Location("Yellow Cafe","Pitfield Street","567876546"));



    }
}
