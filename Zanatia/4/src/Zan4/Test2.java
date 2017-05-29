package Zan4;

import JAVA.Test.Test1;

/**
 * Created by user on 29.05.2017.
 */
public class Test2 {
    public static void Publ(){
        System.out.println("Public");
        Priv();

    }
    private static void Priv(){
        System.out.println("private");
    }
    protected static void Pro(){
        System.out.println("protected");
    }
    static void Prost(){
        System.out.println("bez");
    }
}
