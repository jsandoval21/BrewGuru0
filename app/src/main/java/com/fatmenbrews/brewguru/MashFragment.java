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

public class MashFragment extends Fragment {
    private static final String TAB_POSITION = "position";

    public static MashFragment getInstance(int position) {
        MashFragment mashFragment = new MashFragment();
        Bundle args = new Bundle();
        args.putInt(TAB_POSITION, position);              //replace with a key
        mashFragment.setArguments(args);

        return mashFragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }


    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Log.d("mash fragment", "in mash fragment");
        return inflater.inflate(R.layout.mash_fragment, container, false);
    }
}
