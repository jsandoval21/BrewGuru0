package com.fatmenbrews.brewguru;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Juan on 11/13/2018.
 */

public class HopsFragment extends Fragment {
    private static final String TAB_POSITION = "position";

    public static HopsFragment getInstance(int position) {
        HopsFragment hopsFragment = new HopsFragment();
        Bundle args = new Bundle();
        args.putInt(TAB_POSITION, position);              //replace with a key
        hopsFragment.setArguments(args);

        return hopsFragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Log.d("hops fragment", "in hops fragment");
        return inflater.inflate(R.layout.hops_fragment, container, false);
    }
}
