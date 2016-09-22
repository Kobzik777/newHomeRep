package com.company;

/**
 * Created by Serhii_Kobzar on 9/13/2016.
 */
public class ArihtmeticOperation {
    public double add (double value1, double value2){
        return value1 + value2;
    }

    public double deduct(double value1, double value2){
        return value1 - value2;
    }

    public double mult(double value1, double value2){
        return value1 * value2;
    }

    public double div(double value1, double value2){
        if (value2 == 0)  throw new ArithmeticException();
        return  value1 / value2;
    }
}
