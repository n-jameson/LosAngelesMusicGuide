package com.example.android.losangelesmusicguide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class StudiosActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.location_list);

        // Create ArrayList for list of Items
        final ArrayList<Items> studios = new ArrayList<Items>();
        studios.add(new Items(R.string.studio_one_name, R.string.studio_one_address, R.string.studio_one_description, R.drawable.capitolstudios));
        studios.add(new Items(R.string.studio_two_name, R.string.studio_two_address, R.string.studio_two_description, R.drawable.conwaystudios));
        studios.add(new Items(R.string.studio_three_name, R.string.studio_three_address, R.string.studio_three_description, R.drawable.eastweststudios));

        // Create an {@link LocationAdapter}, whose data source is a list of {@link Items}.
        LocationAdapter adapter = new LocationAdapter(this, studios);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // location_list.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link LocationAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Items} in the list.
        listView.setAdapter(adapter);


    }





}
