package com.company;

/**
 * Created by user on 02.06.2017.
 */
public class Rectangle extends Square {
    private int height;
    public Rectangle(int width, int height) {
        super(width);
        this.height = height;
        setName("Прямоугольник");
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        return getWidth() * height;
    }
}
