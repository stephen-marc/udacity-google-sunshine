package com.example.prochnow.sunshine.app;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.Arrays;


/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    String[] forecastDataArray = {"Today - Sunny - 88 / 63", "Tomorrow - Foggy- 70 / 46", "Weds - Cloudy - 72 / 81", "Thus - Rainy- 64 / 51", "Fri - Foggy - 70 / 46", "Sat - Sunny - 76 / 68"};

    ArrayList<String> forecastData = new ArrayList<String>(Arrays.asList(forecastDataArray));

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_main, container, false);
    }
}
