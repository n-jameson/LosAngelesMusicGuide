package com.example.android.losangelesmusicguide;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class SimpleFragmentPagerAdapter extends FragmentPagerAdapter {

    // Created an array of Strings for the titles
    // of each fragment to be used in the Tab Layout
    private String tabTitles[] = new String[] { "Iconic Locations", "Studios", "Venues", "Stores" };

    public SimpleFragmentPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new IconicLocationsFragment();
        } else if (position == 1){
            return new StudiosFragment();
        } else if (position == 2) {
            return new VenuesFragment();
        } else  {
            return new StoresFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        // Generate title based on item position
        return tabTitles[position];
    }
}
