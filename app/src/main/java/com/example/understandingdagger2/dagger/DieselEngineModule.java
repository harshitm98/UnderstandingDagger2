package com.example.understandingdagger2.dagger;

import com.example.understandingdagger2.car.DieselEngine;
import com.example.understandingdagger2.car.Engine;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

@Module
public class DieselEngineModule {

    private int horsePower;

    public DieselEngineModule(int horsePower) {
        this.horsePower = horsePower;
    }
//    This is also just an another way to the same thing. We tell Dagger where it can find
//    int horsePower.
//
//    @Provides
//    int provideHorsePower(){
//        return horsePower
//    }
//
//    @Provides
//    Engine provideEngine(DieselEngine engine){
//        return engine;
//    }

    @Provides
    Engine provideEngine(){
        return new DieselEngine(horsePower);
    }
}
