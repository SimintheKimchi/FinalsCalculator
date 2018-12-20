package com.example.finalscalculator_2;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


import java.text.DecimalFormat;


public class FinalsCalculator extends Fragment {
    public EditText current;
    public EditText wanted;
    public EditText percent;
    private double needed;
    private Button calculate;

    public String c;
    public String w;
    public String p;
    public String n;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_finals, container, false);
        wireWidgets(rootView);

        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double c = Double.parseDouble(current.getText().toString());
                double w = Double.parseDouble(wanted.getText().toString());
                double p = Double.parseDouble(percent.getText().toString());
                needed = (100 * w - (100 - p) * c) / p;

                DecimalFormat decimalFormat = new DecimalFormat("#.##");
                String formatted = decimalFormat.format(needed);

                Toast.makeText(getActivity(), "You need a " + formatted + "%.", Toast.LENGTH_LONG).show();
            }
        });

        return rootView;
    }

    private void wireWidgets(View rootView) {
        current = rootView.findViewById(R.id.editText_calculate_current);
        wanted = rootView.findViewById(R.id.editText_calculate_wanted);
        percent = rootView.findViewById(R.id.editText_calculate_percent);
        calculate = rootView.findViewById(R.id.button_calculate_calculate);
    }
}
