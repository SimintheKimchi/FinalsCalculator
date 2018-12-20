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
import android.widget.Toast;

import java.text.DecimalFormat;

public class FinalGradeCalculator extends Fragment {

    private EditText overallGrade;
    private EditText gradeOnFinal;
    private EditText weightOfFinal;
    private Button calculate1;
    private double whatYouGot;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_gpa, container, false);
        wireWidgets(rootView);

        calculate1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double overall = Double.parseDouble(overallGrade.getText().toString());
                double grade = Double.parseDouble(gradeOnFinal.getText().toString());
                double weight = Double.parseDouble(weightOfFinal.getText().toString());

                whatYouGot = ((100 - weight) * overall + weight * grade) / 100;

                DecimalFormat decimalFormat1 = new DecimalFormat("#.##");
                String formatted1 = decimalFormat1.format(whatYouGot);

                Toast.makeText(getActivity(), "You got a " + formatted1 + "%.", Toast.LENGTH_LONG).show();
            }
        });
        return rootView;
    }

    private void wireWidgets(View rootView) {
        overallGrade = rootView.findViewById(R.id.edittext_previous_overall);
        gradeOnFinal = rootView.findViewById(R.id.edittext_previous_grade);
        weightOfFinal = rootView.findViewById(R.id.edittext_previous_weight);
        calculate1 = rootView.findViewById(R.id.button_previous_calculate);
    }


}
