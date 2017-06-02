package com.company;

/**
 * Created by user on 31.05.2017.
 */
public class Doctor extends People {
    private int kab;
    private String special;
    public int getKab() {
        return kab;
    }

    public void setKab(int kab) {
        this.kab = kab;
    }

    public String getSpecial() {
        return special;
    }

    public void setSpecial(String special) {
        this.special = special;
    }

    @Override
    public void myTest() {
        System.out.println("Class Doctor");
    }
}
