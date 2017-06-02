package com.company;

/**
 * Created by user on 02.06.2017.
 */
public class Square extends Figura{
    private int width;

    public Square(int width) {
        this.width = width;
        setName("Квадрат");
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public double getArea() {
        return width * width;
    }
}
