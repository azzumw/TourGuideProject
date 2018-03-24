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
public class GymFragment extends Fragment {

    private ArrayList<Location> gym_list;

    public GymFragment(){}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootview = inflater.inflate(R.layout.activity_locationlist,container,false);

        gym_list = new ArrayList<>();

        gym_list.add(new Location(getString(R.string.gymbox),"201A Old Street",R.drawable.gymbox, "6am - 11pm"));
        gym_list.add(new Location(getString(R.string.outrivals),"22 Hoxton street",R.drawable.outrivals,"Closes 9:30pm"));
        gym_list.add(new Location(getString(R.string.manor),"Singer Street",R.drawable.manorec,"8am - 10:00pm"));
        gym_list.add(new Location(getString(R.string.energiefit),"60-63 Bunhill Row",R.drawable.energie,"24 hours"));
        gym_list.add(new Location(getString(R.string.thevault), "Zetland House, Old Street",R.drawable.thevault,"24 hours"));
        gym_list.add(new Location(getString(R.string.nuffield),"1-6 Bateman's Row",R.drawable.nuffield,"24 hours"));
        gym_list.add(new Location(getString(R.string.thefightcity),"15 Worship St",R.drawable.fightcity,"Closes 9pm"));
        gym_list.add(new Location(getString(R.string.virgin),"333 Goswell Rd",R.drawable.virgin,"Closes 10pm"));
        gym_list.add(new Location(getString(R.string.pureG),"8 Bacon Street",R.drawable.purelogo,"24/7"));
        gym_list.add(new Location(getString(R.string.ff),getString(R.string.cityRoad),R.drawable.ff,"Closes 9pm"));

        LocationAdapter<Location> itemsAdapter = new LocationAdapter<>(getActivity(),gym_list);

        ListView listView = rootview.findViewById(R.id.cafelistview);

        listView.setAdapter(itemsAdapter);

        return rootview;
    }

}
