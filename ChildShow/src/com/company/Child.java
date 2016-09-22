package com.company;

public class Child extends Base{
    int x =20;
    Child(){
        System.out.println("Childr");
        show();
    }
    void show(){
        System.out.println("Childshw " + x);
    }
}
