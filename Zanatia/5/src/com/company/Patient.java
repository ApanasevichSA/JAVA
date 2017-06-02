package com.company;

/**
 * Created by user on 31.05.2017.
 */
public class Patient extends People {
    // поля
    private String diagnosis;  // диагноз больного
    private boolean isIll; // true - болеет; false - здоров

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public boolean isIll() {
        return isIll;
    }

    public void setIll(boolean ill) {
        isIll = ill;
    }

    @Override
    public String toString() {
        return "Имя: " + getName() + "; Возраст: " + getAge();
    }

    @Override
    public void myTest() {
        System.out.println("Class Patient");
    }
}
