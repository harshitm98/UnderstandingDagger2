package com.example.understandingdagger2.dagger;

import com.example.understandingdagger2.car.Rims;
import com.example.understandingdagger2.car.Tyre;
import com.example.understandingdagger2.car.Wheels;

import dagger.Module;
import dagger.Provides;

@Module
public class WheelsModule {

    // static so we do not have instancise and directly call
    @Provides
    static Rims provideRims(){
        return new Rims();
    }

    @Provides
    static Tyre provideTyre(){
        Tyre tyre = new Tyre();
        tyre.inflate();
        return tyre;
    }

    @Provides
    static Wheels provideWheels(Rims rims, Tyre tyre){
        return new Wheels(rims, tyre);
    }
}
