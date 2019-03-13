package com.example.understandingdagger2.dagger;

import com.example.understandingdagger2.MainActivity;
import com.example.understandingdagger2.car.Car;

import javax.inject.Named;

import dagger.BindsInstance;
import dagger.Component;

// Can replace DieselEngineModule with PetrolEngineModule. Also can be replaced with FakeEngineModule
// to test the app. But can not have both modules.
@Component(modules = {WheelsModule.class, PetrolEngineModule.class})
public interface CarComponent {
    Car getCar();
    // (Field injection implementation)
    // Seperate functions for seperate activities
    void inject(MainActivity mainActivity);

    // This is for PetrolEngineModule, to pass the horsePower. Quite efficient
    @Component.Builder
    interface Builder{

//        Since both the Builder are returning the same data type, Dagger does not know how to
//        distinguish between them. So we use @Named annotations
        @BindsInstance
        Builder horsePower(@Named("horse power") int horsePower);

        @BindsInstance
        Builder engineCapacity(@Named("engine capacity") int engineCapacity);

        // Dagger will implement this
        CarComponent build();
    }
}
