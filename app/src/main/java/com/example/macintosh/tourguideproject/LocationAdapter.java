package com.example.macintosh.tourguideproject;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class LocationAdapter<L> extends ArrayAdapter<Location> {

    public LocationAdapter(@NonNull Context context, @NonNull ArrayList<Location> objects) {
        super(context, 0, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;

        if(listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item,parent,false);
        }

        Location currentLocation = getItem(position);

        TextView nameTV = listItemView.findViewById(R.id.list_item_name);
        TextView descTV = listItemView.findViewById(R.id.list_item_desc);
        TextView nameaddress = listItemView.findViewById(R.id.list_item_address);
        TextView namephone = listItemView.findViewById(R.id.list_item_phone);
        ImageView imageView = listItemView.findViewById(R.id.list_item_image_view);

        nameTV.setText(currentLocation.getName());
        descTV.setText(currentLocation.getDescription());
        nameaddress.setText(currentLocation.getAddress());
        namephone.setText(currentLocation.getPhonenumber());

        if(currentLocation.isHasImage())
            imageView.setImageResource(currentLocation.getImageResID());
        else{
            imageView.setVisibility(View.GONE);
        }

        return listItemView;
    }
}
