package com.company;

import java.util.HashMap;

/**
 * Created by Admin on 12.07.17.
 */
public class Manny implements Comparable<Manny> {

    private int id;
    private String name;
    private int code;
    private double rate;
    private boolean visible;
    public static HashMap<String, String> nameCurrency;

    public Manny() {
        nameCurrency = new HashMap<>();
        nameCurrency.put("USD","Доллар США");
        nameCurrency.put("EUR", "Евро" );
        nameCurrency.put( "CZK", "Чешская крона");
        nameCurrency.put("HUF", "Венгерский форинт");
        nameCurrency.put( "CAD","Канадский доллар");
        nameCurrency.put("ILS","Новый израильский шекель");
    }

    public Manny(int id, String name, int code, double rate, boolean visible) {
        this.id = id;
        this.name = name;
        this.code = code;
        this.rate = rate;
        this.visible = visible;

        nameCurrency = new HashMap<>();
        nameCurrency.put("USD","Доллар США");
        nameCurrency.put("EUR", "Евро" );
        nameCurrency.put( "CZK", "Чешская крона");
        nameCurrency.put("HUF", "Венгерский форинт");
        nameCurrency.put( "CAD","Канадский доллар");
        nameCurrency.put("ILS","Новый израильский шекель");

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public boolean isVisible() {
        return visible;
    }

    public void setVisible(boolean visible) {
        this.visible = visible;
    }

    @Override
    public String toString() {
        return "Currency{" + " id: " + id + "; name: " + nameCurrency.get(name) + "; code: " + code +
                "; rete: " + rate + "; visable: " + visible + "}\n";
    }

    // сравниваем названия названия валют для сортировки
    @Override
    public int compareTo(Manny o) {
        return this.getName().compareTo(o.getName());
    }
}
