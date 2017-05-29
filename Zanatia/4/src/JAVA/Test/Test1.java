package JAVA.Test;

import Zan4.Test2;

/**
 * Created by user on 29.05.2017.
 */
public class Test1 {
    // поля
    public int a;
    private int b = 3;

    public static int c = 8;
    // конструктор
    public Test1(int a){
        this.a = a;
        c ++;
    }

    // методы
    public void PrintA(){
        System.out.println(a);
    }

    public String toString(){
        return "a (public) = " + a + " b (private) = " + b + " c (static) = " + c;
    }

}
