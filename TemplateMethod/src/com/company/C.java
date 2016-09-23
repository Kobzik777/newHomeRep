package com.company;

/**
 * Created by Serhii_Kobzar on 9/23/2016.
 */
public abstract class C {
    void method(){
        System.out.print("1");
        differ();
        System.out.print("3");
        differ2();
    }
    abstract void differ();
    abstract void differ2();
}
