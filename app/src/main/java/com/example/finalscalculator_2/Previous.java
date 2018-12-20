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

public class Previous extends Fragment {
    private TextView cPrev;
    private TextView wPrev;
    private TextView pPrev;
    private TextView nPrev;
    private EditText cur;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_previous, container, false);
        wireWidgets(rootView);
        setPrevious();

        return rootView;
    }

    private void setPrevious() {
        Calculator calc = new Calculator();
        cur = Calculator.getCurrent();
        cPrev.setText(cur.toString());
    }

    private void wireWidgets(View rootView) {
        cPrev = rootView.findViewById(R.id.textView_previous_current);
        wPrev = rootView.findViewById(R.id.textView_previous_wanted);
        pPrev = rootView.findViewById(R.id.textView_previous_percent);
        nPrev = rootView.findViewById(R.id.textView_previous_needed);
    }

    public TextView getcPrev() {
        return cPrev;
    }

    public void setcPrev(EditText cPrev) {
        this.cPrev = cPrev;
    }

    public TextView getwPrev() {
        return wPrev;
    }

    public void setwPrev(EditText wPrev) {
        this.wPrev = wPrev;
    }

    public TextView getpPrev() {
        return pPrev;
    }

    public void setpPrev(EditText pPrev) {
        this.pPrev = pPrev;
    }

    public TextView getnPrev() {
        return nPrev;
    }

    public void setnPrev(EditText nPrev) {
        this.nPrev = nPrev;
    }

}