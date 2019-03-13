package com.example.understandingdagger2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.understandingdagger2.car.Car;
import com.example.understandingdagger2.dagger.CarComponent;
import com.example.understandingdagger2.dagger.DaggerCarComponent;
import com.example.understandingdagger2.dagger.DieselEngineModule;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {
    // Injection cannot be private or final.
     @Inject public Car car;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        CarComponent component = DaggerCarComponent.create();
        // This is to inject values at run time
//        CarComponent component = DaggerCarComponent.builder()
//                .dieselEngineModule(new DieselEngineModule(100))
//                .build();

//        Same way to do the same thing we did before but through different method
        CarComponent component = DaggerCarComponent.builder()
                .horsePower(150)
                .engineCapacity(1400)
                .build();


//        car = component.getCar();
        // Field injection...
        component.inject(this);
        car.drive();
    }
}
