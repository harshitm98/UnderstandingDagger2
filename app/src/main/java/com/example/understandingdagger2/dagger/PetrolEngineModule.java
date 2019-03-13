package com.example.understandingdagger2.dagger;

import com.example.understandingdagger2.car.Engine;
import com.example.understandingdagger2.car.PetrolEngine;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class PetrolEngineModule {
    // Use @Binds instead of @Provides
    @Binds
    abstract Engine bindEngine(PetrolEngine engine);
}
