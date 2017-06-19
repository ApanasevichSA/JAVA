package com.company;

/**
 * Created by admin on 19.06.2017.
 */
public class Piople {
    private String name;
    private String ochestvo;
    private String familia;

    public Piople(String name, String ochestvo, String familia) {
        this.name = name;
        this.ochestvo = ochestvo;
        this.familia = familia;
    }

//    public Piople(Piople piople) {
//        this.name = piople.name;
//        this.ochestvo = piople.ochestvo;
//        this.familia = piople.familia;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOchestvo() {
        return ochestvo;
    }

    public void setOchestvo(String ochestvo) {
        this.ochestvo = ochestvo;
    }

    public String getFamilia() {
        return familia;
    }

    public void setFamilia(String familia) {
        this.familia = familia;
    }

    @Override
    public String toString() {
        return getName() + " " + getOchestvo() + " " + getFamilia();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
