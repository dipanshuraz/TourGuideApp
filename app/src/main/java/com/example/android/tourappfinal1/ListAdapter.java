package com.example.android.tourappfinal1;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class ListAdapter extends FragmentPagerAdapter {
    private Context mContext;

    public ListAdapter(Context context, FragmentManager fm) {

        super(fm);

        mContext = context;

    }
    @Override
    public Fragment getItem(int position) {

        if (position == 0) {

            return new ViewFragment();

        } else if (position == 1){

            return new TempleFragment();

        } else if (position == 2){

            return new ShopsFragment();

        } else {

            return new CollegeFragment();

        }

    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {

        if (position == 0) {

            return mContext.getString(R.string.category_views);

        } else if (position == 1) {

            return mContext.getString(R.string.category_temple);

        } else if (position == 2) {

            return mContext.getString(R.string.category_shops);

        } else {

            return mContext.getString(R.string.category_college);

        }

    }

}
