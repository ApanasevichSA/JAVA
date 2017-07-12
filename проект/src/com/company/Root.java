package com.company;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by Admin on 11.07.17.
 */
public class Root  {
    private String bankName;
    private String bankLocation;
    private String date;
    private int baseCurrencyId;

    protected ArrayList<Manny> currency;

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getBankLocation() {
        return bankLocation;
    }

    public void setBankLocation(String bankLocation) {
        this.bankLocation = bankLocation;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getBaseCurrencyId() {
        return baseCurrencyId;
    }

    public void setBaseCurrencyId(int baseCurrencyId) {
        this.baseCurrencyId = baseCurrencyId;
    }

    public ArrayList<Manny> getCurrency() {
        return currency;
    }

    public void setCurrency(ArrayList<Manny> currency) {
        this.currency = currency;
    }

    @Override
    public String toString() {
        return "Bank: " + bankName + "; Location: " + bankLocation + "; date: " + date + "; baseCurrencyId: " + baseCurrencyId;
    }

}
