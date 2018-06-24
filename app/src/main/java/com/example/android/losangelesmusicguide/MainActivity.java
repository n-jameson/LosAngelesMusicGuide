package com.example.android.losangelesmusicguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find the View that shows the venues category
        TextView venues = (TextView) findViewById(R.id.venues);

        // Set a click listener on that View
        venues.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the venues category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link VenuesActivity}
                Intent venuesIntent = new Intent(MainActivity.this, VenuesActivity.class);

                // Start the new activity
                startActivity(venuesIntent);
            }

        });

        // Find the View that shows the studios category
        TextView studios = (TextView) findViewById(R.id.studios);

        //Set a click listener on that view
        studios.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the studios category is clicked.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link StudiosActivity}
                Intent studiosIntent = new Intent(MainActivity.this, StudiosActivity.class);

                // Start the new Activity
                startActivity(studiosIntent);
            }

        });

        // Find the view that shows the stores category
        TextView stores = (TextView) findViewById(R.id.stores);

        //Set a click listener on the view
        stores.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the stores category is clicked.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link StoresActivity}
                Intent storesIntent = new Intent(MainActivity.this, StoresActivity.class);

                // Start the new activity
                startActivity(storesIntent);
            }
        });

        // Find the view that shows the iconic locations category
        TextView iconicLocations = (TextView) findViewById(R.id.iconic_locations);

        //Set a click listener on the view
        iconicLocations.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the iconic locations category is clicked.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link IconicLocationsActivity}
                Intent iconicLocationsIntent = new Intent(MainActivity.this, IconicLocationsActivity.class);

                // Start the new activity
                startActivity(iconicLocationsIntent);
            }
        });





    }
}
