package com.example.android.losangelesmusicguide;

import android.location.Location;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class VenuesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.location_list);

//        // Create ArrayList for list of Items
        final ArrayList<Items> venues = new ArrayList<Items>();
        venues.add(new Items(R.string.venue_one_name, R.string.venue_one_address, R.string.venue_one_description, R.drawable.theforum));
        venues.add(new Items(R.string.venue_two_name, R.string.venue_two_address, R.string.venue_two_description, R.drawable.hollywoodbowl));
        venues.add(new Items(R.string.venue_three_name, R.string.venue_three_address, R.string.venue_three_description, R.drawable.roycehall));

        // Create an {@link LocationAdapter}, whose data source is a list of {@link Items}.

        LocationAdapter adapter = new LocationAdapter(this, venues);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // location_list.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link LocationAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Items} in the list.
        listView.setAdapter(adapter);


    }






}
