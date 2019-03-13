package com.example.understandingdagger2.car;

import android.util.Log;

import javax.inject.Inject;

public class Car {
    private static final String TAG = "Car";

    // Field and method injection are only automatically executed if we do constructor injection.
    // But for MainActivity which is constructed by Android, we cannot do those, so we have to
    // trigger injection procedure manually by component.inject(this);

    // Order of injection is constructor -> field -> method

    // Below commented is example of Field injected
    //@Inject private Engine engine;
    private Engine engine;
    private Wheels wheels;

    @Inject
    public Car(Engine engine, Wheels wheels) {
        this.engine = engine;
        this.wheels = wheels;
    }

    // Method injection
    @Inject
    public void enableRemote(Remote remote){
        remote.setListener(this);
    }

    public void drive(){
        engine.start();
        Log.d(TAG, "Driving...");
    }
}
