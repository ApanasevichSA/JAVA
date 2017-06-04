package com.company;

/**
 * Created by user on 02.06.2017.
 */
public class ATM extends Safe {
    private final int  pass = 12345;  // пароль для открытия сейфа банкомата
    private final int countNaminal = 3; // количество видов купюр
    private String bank;

    public ATM(int paper20, int paper50, int paper100, String bank) {
        super(paper20, paper50, paper100);
        this.bank = bank;
    }

    public void openSafe(int password, int p20, int p50, int p100){
        if(password == pass)
        {
            setPaper20(getPaper20() + p20);
            setPaper50(getPaper50() + p50);
            setPaper100(getPaper100() + p100);
            System.out.println("Деньги успешно добавлены в сейф!!!");
        }
        else{
            System.out.println("В доступе отказано!!!");
        }
    }
    // метод выводит сумму денег в банкомате
    public int getBalance(){
        return 20 * getPaper20() + 50 * getPaper50() + 100 * getPaper100();
    }

    // метод выдает количество всех купюр в банкомате (по наминалу)
    public void countPaper(){
        System.out.println("Доступна сумма: " + getBalance());
        System.out.println("Доступно 20: " + getPaper20());
        System.out.println("Доступно 50: " + getPaper50());
        System.out.println("Доступно 100: " + getPaper100());
    }

    // метод проверяет, можно ли выдать нужную сумму имеющимися купюрами (можно - true
    private boolean isMoney(int count){
        if (getPaper20() > 0 && count % 20 == 0){
            return true;
        }
        else if (getPaper50() > 0 && count % 50 == 0){
            return true;
        }
        else if (getPaper100() > 0 && count % 100 == 0){
            return true;
        }
        else {
            return false;
        }
    }
    /* // метод возвращает массив количества купюр различного наминала (в первой ячейке наибольшее значение)
     public int[] countBanknotes(){
         int[] getCountPaper = new int[countNaminal];
         getCountPaper[0] = getPaper100();
         getCountPaper[1] = getPaper50();
         getCountPaper[2] = getPaper20();
         return getCountPaper;
     }*/
    // метод подбирает купюри для выдачи суммы (возвращает массив - первая ячейка содержит количество 100, и т.д.)
    private int[] setPaper(int count){
        int[] money = new int[countNaminal];
        //int[] countManey =countBanknotes(); // массив хранит количество банкнот различного наминала
        // опеределяем количество 100
        if (count % 100 == 0) {
            money[0] = count / 100;
            if (money[0] <= getPaper100()) {
                setPaper100(getPaper100() - money[0]);
                count = 0;
            }
            else{
                money[0] = getPaper100();
                setPaper100(0);
                count -= money[0] * 100;
            }
        }
        // опеределяем количество 50
        if (count % 50 == 0) {
            money[1] = count / 50;
            if (money[1] <= getPaper50()) {
                setPaper50(getPaper50() - money[1]);
                count = 0;
            }
            else{
                money[1] = getPaper50();
                setPaper50(0);
                count -= money[0] * 50;
            }
        }
        // опеределяем количество 20
        if (count % 20 == 0) {
            money[2] = count / 20;
            if (money[2] <= getPaper20()) {
                setPaper20(getPaper20() - money[2]);
                count = 0;
            }
            else{
                money[2] = getPaper20();
                setPaper20(2);
                count -= money[2] * 20;
            }
        }
        if (count > 0){
            for(int i = 0; i < money.length; i++){
                money[i] = 0;
            }
        }
        return money;
    }
    private void printSum(int[] money){
        if (money[0] > 0){
            System.out.println("100 byn: " + money[0]);
        }
        if (money[1] > 0){
            System.out.println("50 byn: " + money[1]);
        }
        if (money[2] > 0){
            System.out.println("20 byn: " + money[2]);
        }
    }
    //метод снятия денег
    public boolean isTake(int count){
        if (getBalance() > count && isMoney(count)){  // достаточно ли денег в банкомате, можно ли выдать нужную сумму имеющимися купюрами
            int[] money = setPaper(count);
            if (money[0] + money[1] + money[2] > 0){
                printSum(money);
                return true;
            }
            else{
                return false;
            }
        }
        else{
            return false;
        }
    }
}
