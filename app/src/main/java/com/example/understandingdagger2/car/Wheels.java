package com.example.understandingdagger2.car;

public class Wheels {
    // We do not own this class and cannot annotate with @Inject

    public Rims rims;
    public Tyre tyre;

    public Wheels(Rims rims, Tyre tyre){
        this.rims = rims;
        this.tyre = tyre;
    }
}
