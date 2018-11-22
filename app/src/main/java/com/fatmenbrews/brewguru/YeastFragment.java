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

public class YeastFragment extends Fragment {
    private static final String TAB_POSITION = "position";

    public static YeastFragment getInstance(int position) {
        YeastFragment yeastFragment = new YeastFragment();
        Bundle args = new Bundle();
        args.putInt(TAB_POSITION, position);              //replace with a key
        yeastFragment.setArguments(args);

        return yeastFragment;
    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Log.d("yeast fragment", "in yeast fragment");
        return inflater.inflate(R.layout.yeast_fragment, container, false);
    }
}
