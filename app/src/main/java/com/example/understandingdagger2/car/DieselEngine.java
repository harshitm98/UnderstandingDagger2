package com.example.understandingdagger2.car;

import android.util.Log;

import javax.inject.Inject;

public class DieselEngine implements Engine {
    private static final String TAG = "Car";

    private int horsepower;
    // So that we can pass parameters at run time
    public DieselEngine(int horsepower){
        this.horsepower = horsepower;
    }

    @Override
    public void start() {
        Log.d(TAG, "Diesel Engine started. Horsepower: " + horsepower);
    }
}
