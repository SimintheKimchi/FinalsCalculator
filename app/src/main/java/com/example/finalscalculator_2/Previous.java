package com.example.finalscalculator_2;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

public class Previous extends Fragment {
    private EditText cPrev;
    private EditText wPrev;
    private EditText pPrev;
    private EditText nPrev;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_calculator, container, false);
        wireWidgets(rootView);

        return rootView;
    }


    private void wireWidgets(View rootView) {
        cPrev = rootView.findViewById(R.id.textView_previous_current);
        wPrev = rootView.findViewById(R.id.textView_previous_wanted);
        pPrev = rootView.findViewById(R.id.textView_previous_percent);
        nPrev = rootView.findViewById(R.id.textView_previous_needed);
    }


}
