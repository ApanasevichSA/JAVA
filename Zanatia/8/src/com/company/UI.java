package com.company;

/**
 * Created by user on 07.06.2017.
 */
public class UI implements OnATMListener{

    public void startUI(){
        ATM atm = new ATM();

        atm.setUi(new OnATMListener() {
            @Override
            public void onGetMoney(int money) {

            }

            @Override
            public void onSetMoney(boolean isOK) {

            }
        });


        atm.getMoney(222);



        atm.setMoney(100);


    }
    @Override
    public void onGetMoney(int money){
        if (money > 0) {
            System.out.println("Деньги получены");
        }
        else{
            System.out.println("Ошибка!!!");
        }
    }
    @Override
    public void onSetMoney(boolean isOK){
        if (isOK) {
            System.out.println("Деньги добавлены");
        }
        else{
            System.out.println("Ошибка!!!");
        }
    }


}
