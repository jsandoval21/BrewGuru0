package com.fatmenbrews.brewguru;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Juan on 11/5/2018.
 */

public class BrewFragment extends Fragment {

    private static final String TAB_POSITION = "position";

    public static BrewFragment getInstance(int position) {
        BrewFragment brewFragment = new BrewFragment();
        Bundle args = new Bundle();
        args.putInt(TAB_POSITION, position);              //replace with a key
        brewFragment.setArguments(args);

        return brewFragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Log.d("Brew fragment", "in Brew fragment");
        return inflater.inflate(R.layout.brew_fragment, container, false);
    }
}
