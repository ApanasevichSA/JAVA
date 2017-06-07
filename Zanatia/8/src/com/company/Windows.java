package com.company;

/**
 * Created by user on 07.06.2017.
 */
public class Windows implements OnATMListener {

    public void startUi(){

        ATM atm = new ATM();

        atm.setUi(this);
    }

    @Override
    public void onGetMoney(int money) {
        if (money > 0) {
            System.out.println("Деньги получены (windows)");
        }
        else{
            System.out.println("Ошибка!!! (windows)");
        }
    }

    @Override
    public void onSetMoney(boolean isOK) {
        if (isOK) {
            System.out.println("Деньги добавлены (windows)");
        }
        else{
            System.out.println("Ошибка!!! (windows)");
        }
    }
}
