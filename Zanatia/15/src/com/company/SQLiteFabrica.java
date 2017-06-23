package com.company;

/**
 * Created by user on 23.06.2017.
 */
public class SQLiteFabrica implements MyFabrica {
    @Override
    public DataBase getDataBase() {
        SQLiteDataBase dataBase = new SQLiteDataBase();
        // делаем все что нужно для инециализации
        dataBase.open();
        return dataBase;
    }
}
