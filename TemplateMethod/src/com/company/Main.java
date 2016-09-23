package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        TemplateMethodA a = new TemplateMethodA();
        a.method();

        System.out.println();

        TemplateMethodB b = new TemplateMethodB();
        b.method();
    }
}
