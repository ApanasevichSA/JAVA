package com.company;

/**
 * Created by user on 02.06.2017.
 */
public class Safe {

    private int paper20;
    private int paper50;
    private int paper100;

    public Safe() {
    }

    public Safe(int paper20, int paper50, int paper100) {
        this.paper20 = paper20;
        this.paper50 = paper50;
        this.paper100 = paper100;
    }

    public int getPaper20() {
        return paper20;
    }

    public void setPaper20(int paper20) {
        this.paper20 = paper20;
    }

    public int getPaper50() {
        return paper50;
    }

    public void setPaper50(int paper50) {
        this.paper50 = paper50;
    }

    public int getPaper100() {
        return paper100;
    }

    public void setPaper100(int paper100) {
        this.paper100 = paper100;
    }
}
