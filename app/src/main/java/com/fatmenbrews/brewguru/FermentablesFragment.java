package com.fatmenbrews.brewguru;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.text.InputType;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;

import com.toptoche.searchablespinnerlibrary.SearchableSpinner;


/**
 * Created by Juan on 11/13/2018.
 */

public class FermentablesFragment extends Fragment {
    private static final String TAB_POSITION = "position";

    //IDs for fermentables
    public int fermID = 1;
    public int unitID = 1;
    public int listID = 1;
    public int percID = 1;
    public int deleID = 1;

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

        final View v = inflater.inflate(R.layout.fermentables_fragment, container, false);
        addFermentable(v);

        FloatingActionButton fab = v.findViewById(R.id.add_fermentable);
        fab.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                addFermentable(v);
                Snackbar.make(view, "Add Fermentable Snackbar", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        return v;
    }

    public void addFermentable(View v){
        LinearLayout scrollView = v.findViewById(R.id.fermentable_objects);

        // Fermentable amount
        EditText amtText = new EditText(getActivity());
        LinearLayout.LayoutParams amtP = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        amtText.setLayoutParams(amtP);
        amtText.setHint(R.string.amount_hint);
        amtText.setInputType(InputType.TYPE_CLASS_NUMBER | InputType.TYPE_NUMBER_FLAG_DECIMAL);
        amtText.setId(fermID);
        scrollView.addView(amtText);

        //Fermentable amount units
        Spinner unitSpinner = new Spinner(getActivity());
        LinearLayout.LayoutParams unitP = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        unitSpinner.setLayoutParams(unitP);
        unitSpinner.setId(unitID);
        ArrayAdapter<CharSequence> unitAdapter = ArrayAdapter.createFromResource(getActivity(),
                R.array.amount_units, android.R.layout.simple_spinner_item);
        unitAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        unitSpinner.setAdapter(unitAdapter);
        scrollView.addView(unitSpinner);

        //Fermentables list
        SearchableSpinner ferm_list = new SearchableSpinner(getActivity());
        LinearLayout.LayoutParams fermentablesP = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        ferm_list.setLayoutParams(fermentablesP);
        ferm_list.setId(listID);
        ArrayAdapter<CharSequence> listAdapter = ArrayAdapter.createFromResource(getActivity(),
                R.array.fermentables_list, android.R.layout.simple_spinner_item);
        listAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        ferm_list.setAdapter(listAdapter);
        scrollView.addView(ferm_list);

        //Display percentage of fermentable in grain bill
        TextView percentView = new TextView(getActivity());
        LinearLayout.LayoutParams percentViewP = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        percentView.setLayoutParams(percentViewP);
        percentView.setText(50 + 50 + "%");
        percentView.setId(percID);
        scrollView.addView(percentView);

        //TODO:remove fermentables button function
        //button to remove fermentables
        ImageButton deleteButton = new ImageButton(getActivity());
        LinearLayout.LayoutParams deleteButtonP = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        deleteButtonP.gravity = Gravity.RIGHT|Gravity.END;
        deleteButton.setLayoutParams(deleteButtonP);
        deleteButton.setImageResource(R.drawable.baseline_remove_black_18dp_2x);
        deleteButton.setId(deleID);
        scrollView.addView(deleteButton);

        //Increment IDs
        fermID++;
        unitID++;
        listID++;
        percID++;
        deleID++;
        Log.d("fermentables fragment", "add a fermentable.  new fermid: " + fermID);
    }
}
