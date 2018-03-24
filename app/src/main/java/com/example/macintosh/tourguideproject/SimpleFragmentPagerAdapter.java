package com.example.macintosh.tourguideproject;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by macintosh on 20/03/2018.
 */

public class SimpleFragmentPagerAdapter extends FragmentPagerAdapter{
    private final String CAFE = "Cafes";
    private final String SHOPS = "Shops";
    private final String HOTELS = "Hotels";
    private final String FITNESS = "Fitness";

    public SimpleFragmentPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0: return new RestaurantCafeFragment();
            case 1: return new LocalShopsFragment();
            case 2: return new HotelFragment();
            case 3: return new GymFragment();
            default:return null;
        }
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position){
            case 0: return CAFE;
            case 1: return SHOPS;
            case 2: return HOTELS;
            case 3: return FITNESS;
            default:return null;
        }
    }

    @Override
    public int getCount() {
        return 4;
    }
}
