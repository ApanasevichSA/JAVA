package com.company;

/**
 * Created by Admin on 06.06.17.
 */
public interface OnMoneyListener {

    public void onTake(int errorKod);
    public void onPut(boolean errorKod);
}
