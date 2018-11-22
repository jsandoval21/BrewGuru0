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

public class WaterChemFragment extends Fragment {
    private static final String TAB_POSITION = "position";

    public static WaterChemFragment getInstance(int position) {
        WaterChemFragment waterChemFragment = new WaterChemFragment();
        Bundle args = new Bundle();
        args.putInt(TAB_POSITION, position);              //replace with a key
        waterChemFragment.setArguments(args);

        return waterChemFragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Log.d("Water Chem fragment", "in Water Chem fragment");
        return inflater.inflate(R.layout.waterchemistry_fragment, container, false);
    }
}
