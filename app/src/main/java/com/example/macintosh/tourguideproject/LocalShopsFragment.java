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

    public LocalShopsFragment() {}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootview = inflater.inflate(R.layout.activity_locationlist,container,false);

        localshopslist = new ArrayList<>();

        localshopslist.add(new Location(getString(R.string.sunstar),getString(R.string.onethirtyfive)+getString(R.string.cityRoad)+", "+ getString(R.string.oldst),R.drawable.sunstar));
        localshopslist.add(new Location(getString(R.string.sainsbury),getString(R.string.onefivenine)+ getString(R.string.cityRoad),getString(R.string.localGro)));
        localshopslist.add(new Location(getString(R.string.sainsbury),getString(R.string.oldstround),getString(R.string.localGro)));
        localshopslist.add(new Location(getString(R.string.tesco),getString(R.string.nnr),getString(R.string.localGro),R.drawable.tesco));
        localshopslist.add(new Location(getString(R.string.costc),getString(R.string.twozerotwo)+getString(R.string.cityRoad),getString(R.string.convenience),R.drawable.costcut));
        localshopslist.add(new Location(getString(R.string.istanbulsuper),getString(R.string.twothirteen)+ getString(R.string.cityRoad),getString(R.string.convenience),R.drawable.istanbul));

        LocationAdapter<Location> itemsAdapter = new LocationAdapter<>(getActivity(),localshopslist);

        ListView listView = rootview.findViewById(R.id.cafelistview);

        listView.setAdapter(itemsAdapter);

        return rootview;
    }
}
