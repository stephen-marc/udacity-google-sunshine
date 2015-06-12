package com.example.prochnow.sunshine.app;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import java.util.ArrayList;
import java.util.Arrays;


/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    String[] forecastDataArray = {"Today - Sunny - 88 / 63", "Tomorrow - Foggy- 70 / 46", "Weds - Cloudy - 72 / 81", "Thus - Rainy- 64 / 51", "Fri - Foggy - 70 / 46", "Sat - Sunny - 76 / 68"};

    ArrayList<String> weekForecast = new ArrayList<String>(Arrays.asList(forecastDataArray));

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(), R.layout.list_item_forecast, R.id.list_item_forecast_textview, weekForecast);
        return inflater.inflate(R.layout.fragment_main, container, false);
    }
}
