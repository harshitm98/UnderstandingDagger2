package com.example.understandingdagger2.car;

import javax.inject.Inject;

public interface Engine {
    // Now since Engine is not a class but an interface, it will not have a constructor. So cannot
    // call inject annotation on the constructor, like previously
    void start();

//    @Inject
//    public Engine(){
//
//    }
}
