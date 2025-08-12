//Jeremy Rocha
//200618875

package com.example.finalexam;

import java.util.Arrays;

public class Customer {
    private int id;
    private String firstName;
    private String lastName;
    private String phone;
    private Arrays[] products;

    public String getFirstName() {
        return firstName;
    }

    public int getId() {
        return id;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPhone() {
        return phone;
    }

    public Arrays[] getProducts() {
        return products;
    }

    public Double getTotalPurchases() {
        double total = 0.0;
        int i;
        for (i = 0; i < products.length; i++) {
            total++;
        }
        return total;
    }

    /*public Double getTotalSavings(){
        double total = 0.0;
        double savingPrice = 0.0;
        double regularPrice = 0.0;

        for(int i =0; i < products.length; i++){
            savingPrice += products.getValue("savingPrice");
            regularPrice += products.getValue("regularPrice");
        }
        total = regularPrice + savingPrice;
        return total;
    }*/

    public boolean savedFiveDollars(int total){
        if(total > 5){
            return true;
        }else {
            return false;
        }
    }
}
