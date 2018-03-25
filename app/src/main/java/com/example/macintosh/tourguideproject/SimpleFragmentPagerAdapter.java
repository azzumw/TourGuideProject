package com.example.macintosh.tourguideproject;

import android.content.ContentValues;
import android.content.Context;
import android.content.res.Resources;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by macintosh on 20/03/2018.
 */

public class SimpleFragmentPagerAdapter extends FragmentPagerAdapter{

    Context  context;

    public SimpleFragmentPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        this.context = context;
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
            case 0: return context.getString(R.string.cafe);
            case 1: return context.getString(R.string.shops);
            case 2: return context.getString(R.string.hotels);
            case 3: return context.getString(R.string.fitness);
            default:return null;
        }
    }

    @Override
    public int getCount() {
        return 4;
    }
}
