package com.fatmenbrews.brewguru;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.fatmenbrews.brewguru.Tabs.SlidingTabLayout;

public class BrewActivity extends FragmentActivity {

    private ViewPager mPager;
    private SlidingTabLayout mTabs;
    private int mTabCount = 6;
    private int mPageSelected;

    FragmentPagerAdapter adapterViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_brew);

        mPager = findViewById(R.id.pager);
        mPager.setAdapter(new MyPagerAdapter(getSupportFragmentManager()));
        //mPager.setOffscreenPageLimit(mTabCount);
        //mTabs.setOnPageChangeListener(pageChangeListener);
        //mPager.setCurrentItem(mPageSelected);
        mTabs = findViewById(R.id.tabs);
        mTabs.setViewPager(mPager);
    }



    /*  PagerAdapter class to handle tabs  */

    class MyPagerAdapter extends FragmentStatePagerAdapter {
        String[] mTabNames;

        public MyPagerAdapter(FragmentManager fm) {
            super(fm);
            mTabNames = getResources().getStringArray(R.array.tabs);
        }

        @Override
        public CharSequence getPageTitle(int position){
            return mTabNames[position];
        }

        @Override
        public Fragment getItem(int position) {

            Fragment fragment = null;
            switch (position){
                case 0: fragment = BrewFragment.getInstance(position);
                    Log.d("Brew Activity", "position" + position);
                    break;
                case 1: fragment = FermentablesFragment.getInstance(position);
                    Log.d("Brew Activity", "position" + position);
                    break;
                case 2: fragment = HopsFragment.getInstance(position);
                    Log.d("Brew Activity", "position" + position);
                    break;
                case 3: fragment = MashFragment.getInstance(position);
                    Log.d("Brew Activity", "position" + position);
                    break;
                case 4: fragment = YeastFragment.getInstance(position);
                    Log.d("Brew Activity", "position" + position);
                    break;
                case 5: fragment = WaterChemFragment.getInstance(position);
                    Log.d("Brew Activity", "position" + position);
                    break;
                default:
                    break;
            }

            return fragment;
        }

        @Override
        public int getCount() {
            return mTabCount;
        }
    }
}
