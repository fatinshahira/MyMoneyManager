/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mymoneymanager;

import java.io.Serializable;

/**
 *
 * @author Ilham MMR <ilham.mmr@gmail.com>
 */
public class MoneyData implements Serializable {

    private static double BALANCE = 0;
    private String date;
    private String category;
    private String type;
    private double amount;

    public MoneyData(String type, String category, double amount, String date) {
        this.date = date;
        this.category = category;
        this.type = type;
        this.amount = amount;

        if (this.type.equalsIgnoreCase("expense")) {
            this.BALANCE = BALANCE - this.amount;
        } else {
            this.BALANCE = BALANCE + this.amount;
        }
    }

    public double substractBalance() {
        if (this.type.equalsIgnoreCase("Expense")) {
            return this.BALANCE = BALANCE + amount;
        } else {
            return this.BALANCE = BALANCE - amount;
        }

    }

    public static double getBALANCE() {
        return BALANCE;
    }

    public static void setBALANCE(double BALANCE) {
        MoneyData.BALANCE = BALANCE;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {

        if (this.type.equalsIgnoreCase("expense")) {
            double previousBalance = BALANCE + this.amount;
            System.out.println(previousBalance + "expense");
            this.amount = amount;
            BALANCE = previousBalance - amount;

        } else {
            double previousBalance = BALANCE - this.amount;
            System.out.println(previousBalance + "income");
            this.amount = amount;
            BALANCE = previousBalance + amount;
        }

    }

}
