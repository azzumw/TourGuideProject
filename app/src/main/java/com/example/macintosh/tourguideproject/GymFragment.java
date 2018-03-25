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

        gym_list.add(new Location(getString(R.string.gymbox),"201A "+getString(R.string.oldst),R.drawable.gymbox, getString(R.string.sixToEleven)));
        gym_list.add(new Location(getString(R.string.outrivals),getString(R.string.tthoxtonst),R.drawable.outrivals,getString(R.string.closesHalfNine)));
        gym_list.add(new Location(getString(R.string.manor),getString(R.string.singerst),R.drawable.manorec,getString(R.string.eightToTen)));
        gym_list.add(new Location(getString(R.string.energiefit),getString(R.string.bunhillrow),R.drawable.energie,getString(R.string.twentyfourseven)));
        gym_list.add(new Location(getString(R.string.thevault), getString(R.string.zetland),R.drawable.thevault,getString(R.string.twentyfourseven)));
        gym_list.add(new Location(getString(R.string.nuffield),getString(R.string.batemansrow),R.drawable.nuffield,getString(R.string.twentyfourseven)));
        gym_list.add(new Location(getString(R.string.thefightcity),getString(R.string.worshipst),R.drawable.fightcity,getString(R.string.closesNine)));
        gym_list.add(new Location(getString(R.string.virgin),getString(R.string.goswellrd),R.drawable.virgin,getString(R.string.closesTen)));
        gym_list.add(new Location(getString(R.string.pureG),getString(R.string.bacon),R.drawable.purelogo,getString(R.string.twentyfourseven)));
        gym_list.add(new Location(getString(R.string.ff),getString(R.string.cityRoad),R.drawable.ff,getString(R.string.closesNine)));

        LocationAdapter<Location> itemsAdapter = new LocationAdapter<>(getActivity(),gym_list);

        ListView listView = rootview.findViewById(R.id.cafelistview);

        listView.setAdapter(itemsAdapter);

        return rootview;
    }
}
