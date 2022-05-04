package com.pro.model;

public class Data {
    private double price;
    private Info info;

    public Data() {
    }

    public Data(double price, Info info) {
        this.price = price;
        this.info = info;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Info getInfo() {
        return info;
    }

    public void setInfo(Info info) {
        this.info = info;
    }

    @Override
    public String toString() {
        return "Data{" +
                "price=" + price +
                ", info=" + info +
                '}';
    }
}
