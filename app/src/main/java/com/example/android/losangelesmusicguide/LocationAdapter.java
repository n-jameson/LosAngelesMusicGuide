package com.example.android.losangelesmusicguide;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * {@link LocationAdapter} is an {@link ArrayAdapter} that can provide the layout for each location item
 * based on a data source, which is a list of {@link Items} objects.
 */


public class LocationAdapter extends ArrayAdapter<Items> {


    /**
     * Create a new {@link LocationAdapter} object.
     *
     * @param context is the current context (i.e. Activity) that the adapter is being created in.
     * @param items   is the list of {@link Items} to be displayed.
     */
    public LocationAdapter(Context context, ArrayList<Items> items) {
        super(context, 0, items);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.location_item, parent, false);
        }

        // Get the {@link Items} object located at this position in the list
        Items currentLocation = getItem(position);

        // Find the ImageView in the location_item.xml layout with the ID location_picture
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.location_picture);
        // Set the ImageView to the image associated with the currentLocation
        imageView.setImageResource(currentLocation.getImageResourceId());

        // Find the TextView in the location_item.xml layout with the ID location_name
        TextView nameView = (TextView) listItemView.findViewById(R.id.location_name);
        // Set the TextView to the name associated with the currentLocation
        nameView.setText(currentLocation.getNameOfLocation());

        // Find the TextView in the location_item.xml layout with the ID location_address
        TextView addressView = (TextView) listItemView.findViewById(R.id.location_address);
        // Set the TextView to the address associated with the currentLocation
        addressView.setText(currentLocation.getAddress());

        // Find the TextView in the location_item.xml layout with the ID location_description
        TextView descriptionView = (TextView) listItemView.findViewById(R.id.location_description);
        // Set the TextView to the address associated with the currentLocation
        descriptionView.setText(currentLocation.getDescription());

        return listItemView;


    }
}
