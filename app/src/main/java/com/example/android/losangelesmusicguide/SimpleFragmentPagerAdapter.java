package com.example.android.losangelesmusicguide;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class SimpleFragmentPagerAdapter extends FragmentPagerAdapter {

    private Context mContext;

    public SimpleFragmentPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
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
        if (position == 0) {
            return mContext.getString(R.string.iconic_locations_name);
        } else if (position == 1) {
            return mContext.getString(R.string.studios_name);
        } else if (position == 2) {
            return mContext.getString(R.string.venues_name);
        } else {
            return mContext.getString(R.string.stores_name);
        }
    }
}
