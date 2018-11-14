package com.fatmenbrews.brewguru;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Juan on 11/5/2018.
 */

public class BrewFragment extends Fragment {

    private TextView mTextView;

    public static BrewFragment getInstance(int position) {
        BrewFragment myFragment = new BrewFragment();
        Bundle args = new Bundle();
        args.putInt("position", position);              //replace with a key
        myFragment.setArguments(args);

        return myFragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View layout = inflater.inflate(R.layout.brew_fragment, container, false);
        mTextView = (TextView) layout.findViewById(R.id.brew_text);
        Bundle bundle = getArguments();
        if(bundle != null)
        {
            mTextView.setText("The page selected is: " + bundle.getInt("position"));
        }


        return layout;
    }
}
