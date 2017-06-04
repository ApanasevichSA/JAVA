package com.company;

/**
 * Created by Admin on 01.06.17.
 */
public class Appliances {
    private String firma;
    private String name;
    private int price;

    public Appliances() {
    }

    public Appliances(String firma, String name, int price) {
        this.firma = firma;
        this.name = name;
        this.price = price;
    }

    public String getFirma() {
        return firma;
    }

       public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }


}
