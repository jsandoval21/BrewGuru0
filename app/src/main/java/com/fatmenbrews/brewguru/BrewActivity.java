package com.fatmenbrews.brewguru;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import com.fatmenbrews.brewguru.Tabs.SlidingTabLayout;

public class BrewActivity extends AppCompatActivity {

    private Toolbar toolbar;
    private ViewPager mPager;
    private SlidingTabLayout mTabs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_brew);

        mPager = (ViewPager) findViewById(R.id.pager);
        mPager.setAdapter(new MyPagerAdapter(getSupportFragmentManager()));
        mTabs = (SlidingTabLayout) findViewById(R.id.tabs);
        mTabs.setViewPager(mPager);
    }

    class MyPagerAdapter extends FragmentPagerAdapter {
        private int mTabCount = 6;
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
            BrewFragment brewFragment = BrewFragment.getInstance(position);
            return brewFragment;
        }

        @Override
        public int getCount() {
            return mTabCount;
        }
    }
}
