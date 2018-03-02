package com.example.macintosh.tourguideproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class PoiActivity extends AppCompatActivity {

    private ArrayList<Location> poi_list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurant_andcafe);

        poi_list = new ArrayList<>();

        poi_list.add(new Location("Premier Inn","East Road, Old Street","Affordable and Luxury Hotel"));
        poi_list.add(new Location("Travelodge","City Road","Affordable and Luxury Hotel"));

        LocationAdapter<Location> itemsAdapter = new LocationAdapter<>(PoiActivity.this,poi_list);

        ListView listView = findViewById(R.id.cafelistview);

        listView.setAdapter(itemsAdapter);

    }
}
