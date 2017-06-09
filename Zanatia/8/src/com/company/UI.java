package com.company;

/**
 * Created by user on 07.06.2017.
 */
public class UI /*implements OnATMListener*/{

    private OnATMListener listener = new OnATMListener() {
        @Override
        public void onGetMoney(int money) {
            if (money > 0) {
                System.out.println("Деньги получены");
            }
            else{
                System.out.println("Ошибка!!!");
            }
        }

        @Override
        public void onSetMoney(boolean isOK) {
            if (isOK) {
                System.out.println("Деньги добавлены");
            }
            else{
                System.out.println("Ошибка!!!");
            }
        }
    };

    public void startUI(){
        ATM atm = new ATM();

        atm.setUi(listener);


        atm.getMoney(222);



        atm.setMoney(100);


    }
//    @Override
//    public void onGetMoney(int money){
//        if (money > 0) {
//            System.out.println("Деньги получены");
//        }
//        else{
//            System.out.println("Ошибка!!!");
//        }
//    }
//    @Override
//    public void onSetMoney(boolean isOK){
//        if (isOK) {
//            System.out.println("Деньги добавлены");
//        }
//        else{
//            System.out.println("Ошибка!!!");
//        }
//    }


}
