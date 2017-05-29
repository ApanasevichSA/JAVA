package Univer;

/**
 * Created by user on 29.05.2017.
 */
public class Student {
    public int age;
    public String name;
    public double ocenka;
    public boolean isZaoch;

    public static String nameUniver = "пвт";

    public Student(int age, String name, double ocenka, boolean isZaoch){
        this.age = age;
        this.name = name;
        this.ocenka = ocenka;
        this.isZaoch = isZaoch;
    }
    public int OcenkaInt(){
        return (int)ocenka;
    }

    public static String UniverRegistrV(){
        return nameUniver.toUpperCase();
    }

    public String toString(){
        return "Универ: " + nameUniver + "; Имя: " + name + "; Возраст: " + age + "; Средний балл: " + ocenka + "; Заочник: " + isZaoch;
    }
}
