package com.company;

/**
 * Created by Serhii_Kobzar on 9/23/2016.
 */
public class TemplateMethodA extends C {
    void differ(){
        System.out.print("2");
    }

    @Override
    void differ2() {
        System.out.print("5");
    }
}
