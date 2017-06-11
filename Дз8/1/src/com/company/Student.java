package com.company;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Admin on 08.06.17.
 */
public class Student {

    private String firstName; // имя
    private String lastName;  // фамилия
    private Date dateBirth; // дата рождения

    public Student(String lastName, String firstName, Date dateBirth) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.dateBirth = dateBirth;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Date getDateBirth() {
        return dateBirth;
    }

    @Override
    public String toString() {
        SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");
        return firstName + " " + lastName + " " + format.format(dateBirth);
    }
}
