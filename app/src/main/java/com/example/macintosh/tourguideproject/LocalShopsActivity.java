package com.example.macintosh.tourguideproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class LocalShopsActivity extends AppCompatActivity {

    private ArrayList<Location> localshopslist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurant_andcafe);

        localshopslist = new ArrayList<>();

        localshopslist.add(new Location("Sun Star Express","135 city Road, Old Street",R.drawable.sunstar));

        LocationAdapter<Location> itemsAdapter = new LocationAdapter<>(LocalShopsActivity.this,localshopslist);

        ListView listView = findViewById(R.id.cafelistview);

        listView.setAdapter(itemsAdapter);

    }
}
