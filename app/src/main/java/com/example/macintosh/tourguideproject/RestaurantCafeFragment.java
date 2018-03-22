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

    public RestaurantCafeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.activity_locationlist,container,false);

        list_cafes_rest = new ArrayList<>();

        list_cafes_rest.add(new Location("Curious Yellow Cafe","Pitfield Street","567876546","Tiny, Swedish cafe & eatery with sidewalk seats.",R.drawable.yellowcafe));
        list_cafes_rest.add(new Location("Summer with Monica","Pitfield Street","567876546","Bijou, trendy cafe",R.drawable.summermonika));
        list_cafes_rest.add(new Location("Coffee Junction","Bevenden Street","567876546","Bijou, trendy cafe",R.drawable.coffeejunc));
        list_cafes_rest.add(new Location("Starbucks","Old Street Roudabout","567876546","Popular Coffee Shop",R.drawable.starbucks));
        list_cafes_rest.add(new Location("Chicken Cottage","Old Street Roudabout","567876546","Fast-Food for Chicken lovers",R.drawable.cc));
        list_cafes_rest.add(new Location("Mexican","Old Street Roudabout","567876546","Buritos/Tapas - taste of Mexico",R.drawable.mexican));
        list_cafes_rest.add(new Location("Shoreditch Grind","Old Street Roudabout","567876546","Trendy Coffee Shop, Bar and Bakery",R.drawable.shoreditchgrind));
        list_cafes_rest.add(new Location("Ceviche","Old Street Roudabout","567876546","Buzzy Spot for Peruvian Seafood and dish",R.drawable.ceviche));
        list_cafes_rest.add(new Location("Jamie's Fifteen","Old Street Roudabout","567876546","Jamie Oliver's Modern British Flagship",R.drawable.fifteen));
        list_cafes_rest.add(new Location("Nando's","City Road","567876546","Spicy, Afro-Portuguese chain",R.drawable.nandos));

        //create LocationAdapter
        LocationAdapter<Location> itemsAdapter = new LocationAdapter<>(getActivity(),list_cafes_rest);

        //set the listview
        ListView listView = rootView.findViewById(R.id.cafelistview);


        //set Adapter to listView
        listView.setAdapter(itemsAdapter);

        return rootView;

    }

}
