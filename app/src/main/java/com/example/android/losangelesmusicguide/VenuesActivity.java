package com.example.android.losangelesmusicguide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

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

    }






}
