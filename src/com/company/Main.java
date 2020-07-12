package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Apprial a1 = new Apprial("bag", 100 , 0.25, "otlite");
        Apprial a2 = new Apprial("teshert", 100 , 0.25, "new");

        Elctronic e1 = new Elctronic(12 , "glass", 50, true);
        Elctronic e2 = new Elctronic(10 , "glass", 100, false);


        System.out.println(a1.printT());
        System.out.println(a1.toString());
        System.out.println(a2.toString());

        System.out.println(e1.printT());
        System.out.println(e1.toString());
        System.out.println(e2.toString());
    }
}
