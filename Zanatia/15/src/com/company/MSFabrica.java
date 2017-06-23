package com.company;

/**
 * Created by user on 23.06.2017.
 */
public class MSFabrica implements MyFabrica {
    @Override
    public DataBase getDataBase() {
        MSQLDataBase msDateBase = new MSQLDataBase();
        // делаем все что нужно для инециализации

        return msDateBase;
    }
}
