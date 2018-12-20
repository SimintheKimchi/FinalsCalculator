package com.example.finalscalculator_2;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Previous extends Fragment {
    public TextView current;

    public void setPrevious() {
        FinalsCalculator fc = new FinalsCalculator();
        current.setText(fc.c);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_gpa, container, false);
        wireWidgets(rootView);

        return rootView;
    }



    private void wireWidgets(View rootView) {
        current = rootView.findViewById(R.id.textView_gpa_test);
    }
}