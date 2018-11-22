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

public class FermentablesFragment extends Fragment {
    private static final String TAB_POSITION = "position";

    public static FermentablesFragment getInstance(int position) {
        FermentablesFragment fermentablesFragment = new FermentablesFragment();
        Bundle args = new Bundle();
        args.putInt(TAB_POSITION, position);              //replace with a key
        fermentablesFragment.setArguments(args);

        return fermentablesFragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Log.d("fermentables fragment", "in fermentables fragment");
        return inflater.inflate(R.layout.fermentables_fragment, container, false);
    }
}
