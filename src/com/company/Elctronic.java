package com.company;

public class Elctronic implements Payments, PrintMessage {
    int count;
    String name;
    double price;
    boolean delivary;

    public Elctronic(int count, String name, double price, boolean delivary) {
        this.count = count;
        this.name = name;
        this.price = price;
        this.delivary = delivary;
    }

    @Override
    public double getPayment() {
        if (delivary){
            return (price * count) + 2.0;
        }else {
            return (price * count);
        }
    }

    @Override
    public String printT() {
        return "مرحبا بك في قسم الالكترونات";
    }

    @Override
    public String toString() {
        return "Elctronic{" +
                "count=" + count +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", delivary=" + delivary +
                ", Payment='" + getPayment() + '\'' +
                '}';
    }
}
