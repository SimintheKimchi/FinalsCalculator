package com.example.finalscalculator_2;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

//implement the interface OnNavigationItemSelectedListener in your activity class
public class MainActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {

    private EditText current;
    private EditText wanted;
    private EditText percent;
    private double needed;
    private Button calculate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //loading the default fragment
        loadFragment(new Calculator());

        //getting bottom navigation view and attaching the listener
        BottomNavigationView navigation = findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(this);

        wireWidgets();

        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double c = Double.parseDouble(current.getText().toString());
                double w = Double.parseDouble(wanted.getText().toString());
                double p = Double.parseDouble(percent.getText().toString());
                needed = (w - c * (100% - p)) / p;
                Toast.makeText(MainActivity.this, "You need" + needed + ":)", Toast.LENGTH_LONG).show();
            }
        });
    }

    private void wireWidgets() {
        current = findViewById(R.id.editText_calculate_current);
        wanted = findViewById(R.id.editText_calculate_wanted);
        percent = findViewById(R.id.editText_calculate_percent);
        calculate = findViewById(R.id.button_calculate_calculate);
    }


    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        Fragment fragment = null;

        switch (item.getItemId()) {
            case R.id.navigation_calculate:
                fragment = new Calculator();
                break;

            case R.id.navigation_previous:
                fragment = new Previous();
                break;
        }

        return loadFragment(fragment);
    }

    private boolean loadFragment(Fragment fragment) {
        //switching fragment
        if (fragment != null) {
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.fragment_container, fragment)
                    .commit();
            return true;
        }
        return false;
    }
}
