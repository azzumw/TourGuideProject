package com.example.macintosh.tourguideproject;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class RestaurantCafeFragment extends Fragment {

    private ArrayList<Location> list_cafes_rest;

    public RestaurantCafeFragment() {}


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.activity_locationlist,container,false);

        list_cafes_rest = new ArrayList<>();

        list_cafes_rest.add(new Location(getString(R.string.curiouscafe),"Pitfield Street","567876546",getString(R.string.cafe_desc_one),R.drawable.yellowcafe));
        list_cafes_rest.add(new Location(getString(R.string.monika),"Pitfield Street","567876546",getString(R.string.cafe_desc_two),R.drawable.summermonika));
        list_cafes_rest.add(new Location(getString(R.string.cj),"Bevenden Street","567876546",getString(R.string.cafe_desc_two),R.drawable.coffeejunc));
        list_cafes_rest.add(new Location(getString(R.string.starbks),"Old Street Roudabout","567876546",getString(R.string.cafe_desc_three),R.drawable.starbucks));
        list_cafes_rest.add(new Location(getString(R.string.cc),"Old Street Roudabout","567876546",getString(R.string.cafe_desc_four),R.drawable.cc));
        list_cafes_rest.add(new Location(getString(R.string.mexi),"Old Street Roudabout","567876546",getString(R.string.cafe_desc_five),R.drawable.mexican));
        list_cafes_rest.add(new Location(getString(R.string.shoreditchgrind),"Old Street Roudabout","567876546",getString(R.string.cafe_desc_six),R.drawable.shoreditchgrind));
        list_cafes_rest.add(new Location(getString(R.string.ceviche),"Old Street Roudabout","567876546",getString(R.string.cafe_desc_seven),R.drawable.ceviche));
        list_cafes_rest.add(new Location(getString(R.string.jamie),"Old Street Roudabout","567876546",getString(R.string.cafe_desc_eight),R.drawable.fifteen));
        list_cafes_rest.add(new Location(getString(R.string.nandos),"City Road","567876546",getString(R.string.cafe_desc_nine),R.drawable.nandos));

        LocationAdapter<Location> itemsAdapter = new LocationAdapter<>(getActivity(),list_cafes_rest);

        ListView listView = rootView.findViewById(R.id.cafelistview);

        listView.setAdapter(itemsAdapter);

        return rootView;

    }

}
