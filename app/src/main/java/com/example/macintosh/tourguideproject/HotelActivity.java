package com.example.macintosh.tourguideproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class HotelActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.category);

        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container, new HotelFragment())
                .commit();
    }
}
