package com.company;

/**
 * Created by user on 07.06.2017.
 */
public class ATM {
    private int count20 = 10;
    private int count50 = 5;
    private int count100 = 2;

    private OnATMListener ui = null;

    public void setUi(OnATMListener ui) {
        this.ui = ui;
    }

    public void getMoney(int value){


        // прогресс - длительное ожидание
        ui.onGetMoney(value);


    }

    public void setMoney(int value){


        // прогресс - длительное ожидание
        ui.onSetMoney(false);

    }
}
