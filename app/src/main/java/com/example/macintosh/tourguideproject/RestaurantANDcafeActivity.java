package com.example.macintosh.tourguideproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class RestaurantANDcafeActivity extends AppCompatActivity {
    ArrayList<Location> list_cafes_rest;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurant_andcafe);

        list_cafes_rest = new ArrayList<>();

        list_cafes_rest.add(new Location("Curious Yellow Cafe","Pitfield Street","567876546","Tiny, Swedish cafe & eatery with sidewalk seats.",R.drawable.yellowkafe));
        list_cafes_rest.add(new Location("Coffee with Monica","Pitfield Street","567876546","Bijou, trendy cafe"));
        list_cafes_rest.add(new Location("Coffee Junction","Bevenden Street","567876546","Bijou, trendy cafe"));
        list_cafes_rest.add(new Location("Starbucks","Old Street Roudabout","567876546","Popular Coffee Shop",R.drawable.starbucks));
        list_cafes_rest.add(new Location("Chicken Cottage","Old Street Roudabout","567876546","Fast-Food for Chicken lovers",R.drawable.cc));
        list_cafes_rest.add(new Location("Mexican","Old Street Roudabout","567876546","Buritos/Tapas - taste of Mexico"));
        list_cafes_rest.add(new Location("Shoreditch Grind","Old Street Roudabout","567876546","Trendy Coffee Shop, Bar and Bakery",R.drawable.shoreditchgrind));
        list_cafes_rest.add(new Location("Ceviche","Old Street Roudabout","567876546","Buzzy Spot for Peruvian Seafood and dish",R.drawable.ceviche));
        list_cafes_rest.add(new Location("Jamie's Fifteen","Old Street Roudabout","567876546","Jamie Oliver's Modern British Flagship"));
        list_cafes_rest.add(new Location("Nando's","City Road","567876546","Spicy, Afro-Portuguese chain"));
        list_cafes_rest.add(new Location("Old Fountain","City Road","567876546","Traditional ale, Pub grub & roof terrace"));

        //create LocationAdapter
        LocationAdapter<Location> itemsAdapter = new LocationAdapter<>(RestaurantANDcafeActivity.this,list_cafes_rest);

        //set the listview
        ListView listView = findViewById(R.id.cafelistview);


        //set Adapter to listView
        listView.setAdapter(itemsAdapter);

    }
}
