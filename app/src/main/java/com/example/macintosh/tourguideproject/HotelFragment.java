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
public class HotelFragment extends Fragment {

    private ArrayList<Location> hotel_lists;

    public HotelFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootview = inflater.inflate(R.layout.activity_locationlist,container,false);


        hotel_lists = new ArrayList<>();

        hotel_lists.add(new Location("Premier Inn","East Road, Old Street",R.drawable.preminn,"Affordable and Luxury Hotel"));
        hotel_lists.add(new Location("Travelodge","City Road",R.drawable.travelodge,"Affordable and Luxury Hotel"));
        hotel_lists.add(new Location("The Z Hotel Shoreditch","136-144 City Rd, London",R.drawable.zhotel,"Trendy and Affordable living"));
        hotel_lists.add(new Location("The Hoxton","81 Great Easterb Road",R.drawable.thehoxton,"Urban-Chic hotel surrounded by bars"));
        hotel_lists.add(new Location("EasyHotel", "80 Old Street", R.drawable.easyhotel,"Utilitarian Red Brick Hotel offering spartan rooms"));
        hotel_lists.add(new Location("Thistle City Barbican", "Central Street",R.drawable.thistle, "Luxury hotel only 10 mins walk from old street"));
        hotel_lists.add(new Location("Court House hotel", "335 Old Street", R.drawable.courthouse,"hip up-market hotel"));
        hotel_lists.add(new Location("M By Montcalm Shoreditch Tech City ", "151 City Road", R.drawable.montcalm,"3 Mins Walk From Old Street Station"));
        hotel_lists.add(new Location("Point a Hotel", "8 Paul Street", R.drawable.pointhotel,"Surrounded by buzzy bars and vibrant restaurants"));
        hotel_lists.add(new Location("citizenM London Shoreditch hotel", "275 Old Street", R.drawable.citizenm,"Opposite Great Eastern Street"));



        LocationAdapter<Location> itemsAdapter = new LocationAdapter<>(getActivity(), hotel_lists);

        ListView listView = rootview.findViewById(R.id.cafelistview);

        listView.setAdapter(itemsAdapter);

        return rootview;

    }

}
