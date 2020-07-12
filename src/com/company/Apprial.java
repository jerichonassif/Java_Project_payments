package com.company;

public class Apprial implements Payments, PrintMessage {
    String name;
    double price;
    double distance;
    String tag;

    public Apprial(String name, double price, double distance, String tag) {
        this.name = name;
        this.price = price;
        this.distance = distance;
        this.tag = tag;
    }

    @Override
    public double getPayment() {
        if (tag.equals("otlite")){
            return (price - (price * distance));
        }else {
            return price;
        }
    }

    @Override
    public String printT() {
        return "مرحبا بك في قسم الملابس";
    }

    @Override
    public String toString() {
        return "Apprial{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", distance=" + distance +
                ", tag='" + tag + '\'' +
                ", Payment='" + getPayment() + '\'' +
                '}';
    }
}
