package com.example.android.losangelesmusicguide;


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
public class VenuesFragment extends Fragment {


    public VenuesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.location_list, container, false);

        // Create ArrayList for list of Items
        final ArrayList<Items> venues = new ArrayList<Items>();
        venues.add(new Items(R.string.venue_one_name, R.string.venue_one_address, R.string.venue_one_description, R.drawable.theforum));
        venues.add(new Items(R.string.venue_two_name, R.string.venue_two_address, R.string.venue_two_description, R.drawable.hollywoodbowl));
        venues.add(new Items(R.string.venue_three_name, R.string.venue_three_address, R.string.venue_three_description, R.drawable.roycehall));

        // Create an {@link LocationAdapter}, whose data source is a list of {@link Items}.
        LocationAdapter adapter = new LocationAdapter(getActivity(), venues);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // location_list.xml layout file.
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link LocationAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Items} in the list.
        listView.setAdapter(adapter);


        return rootView;
    }

}
