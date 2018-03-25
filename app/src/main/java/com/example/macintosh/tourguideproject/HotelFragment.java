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

    public HotelFragment() {}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootview = inflater.inflate(R.layout.activity_locationlist,container,false);

        hotel_lists = new ArrayList<>();

        hotel_lists.add(new Location(getString(R.string.premier_inn),getString(R.string.eastRdOldSt),R.drawable.preminn,getString(R.string.descriptionOne)));
        hotel_lists.add(new Location(getString(R.string.travelodge),getString(R.string.cityRoad),R.drawable.travelodge,getString(R.string.descriptionOne)));
        hotel_lists.add(new Location(getString(R.string.theZHotel),getString(R.string.onethreesix)+ getString(R.string.cityRoad) + getString(R.string.london),R.drawable.zhotel,getString(R.string.descriptionTwo)));
        hotel_lists.add(new Location(getString(R.string.theHoxton),getString(R.string.eightone) +getString(R.string.greateastRd),R.drawable.thehoxton,getString(R.string.descriptionThree)));
        hotel_lists.add(new Location(getString(R.string.easyHotle), getString(R.string.eighty)+getString(R.string.oldst), R.drawable.easyhotel,getString(R.string.descriptionFour)));
        hotel_lists.add(new Location(getString(R.string.thistle), getString(R.string.centralst),R.drawable.thistle, getString(R.string.descFive)));
        hotel_lists.add(new Location(getString(R.string.courthouse), getString(R.string.threethirtyfive)+ getString(R.string.oldst), R.drawable.courthouse,getString(R.string.descSix)));
        hotel_lists.add(new Location(getString(R.string.montcalm), getString(R.string.onefiveone) + getString(R.string.cityRoad), R.drawable.montcalm,getString(R.string.descSeven)));
        hotel_lists.add(new Location(getString(R.string.pointahotel), getString(R.string.paulst), R.drawable.pointhotel,getString(R.string.descEight)));
        hotel_lists.add(new Location(getString(R.string.citizenm), getString(R.string.twoseventyfive)+ getString(R.string.oldst), R.drawable.citizenm,getString(R.string.descNine)));

        LocationAdapter<Location> itemsAdapter = new LocationAdapter<>(getActivity(), hotel_lists);

        ListView listView = rootview.findViewById(R.id.cafelistview);

        listView.setAdapter(itemsAdapter);

        return rootview;
    }
}
