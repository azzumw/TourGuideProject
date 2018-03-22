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
public class LocalShopsFragment extends Fragment {

    private ArrayList<Location> localshopslist;

    public LocalShopsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootview = inflater.inflate(R.layout.activity_locationlist,container,false);


        localshopslist = new ArrayList<>();

        localshopslist.add(new Location("Sun Star Express","135 city Road, Old Street",R.drawable.sunstar));
        localshopslist.add(new Location("Sainsbury's","159 City Rd, Hoxton","Local Grocery Shop"));
        localshopslist.add(new Location("Sainsbury's","Old Street Roundabout","Local Grocery Shop"));
        localshopslist.add(new Location("Tesco","","New North Road","Local Grocery Shop",R.drawable.tesco));
        localshopslist.add(new Location("Costcutter","","202 City Road","Convenience Shop",R.drawable.costcut));
        localshopslist.add(new Location("Istanbul Supermarket","213 City Road","202 City Road","Convenience Shop",R.drawable.istanbul));


        LocationAdapter<Location> itemsAdapter = new LocationAdapter<>(getActivity(),localshopslist);

        ListView listView = rootview.findViewById(R.id.cafelistview);

        listView.setAdapter(itemsAdapter);

        return rootview;
    }

}
