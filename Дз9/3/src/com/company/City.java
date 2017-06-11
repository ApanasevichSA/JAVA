package com.company;

import javax.swing.plaf.basic.BasicButtonUI;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


import static java.lang.System.*;

/**
 * Created by Admin on 11.06.17.
 */
public class City {
    Avenue[] avenueName;
    Street[] streetName;
    Place[] placeName;

    public City(int avenue, int street, int place) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        avenueName = new Avenue[avenue];
        streetName = new Street[street];
        placeName = new Place[place];

        for (int i = 0; i < avenueName.length; i++){
            out.println("Введите название проспекта № " + i);
            avenueName[i] = new Avenue(reader.readLine());
        }
        for (int i = 0; i < streetName.length; i++){
            out.println("Введите название улицы № " + i);
            streetName[i] = new Street(reader.readLine());
        }
        for (int i = 0; i < placeName.length; i++){
            out.println("Введите название площади № " + i);
            placeName[i] = new Place(reader.readLine());
        }
    }

    public class Avenue{
        String name;

        public Avenue(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    public class Street{
        String name;

        public Street(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    public class Place{
        String name;

        public Place(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

}
