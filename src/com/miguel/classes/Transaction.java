package com.miguel.classes;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Transaction {
    private String sellerAccountNumber;
    private String buyerAccountNumber;
    private double amount;
    private LocalDate date;

    //DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
    //String dateFormatted = date.format(dateFormatter);

//Constructor Transaction
    public Transaction(String sellerAccountNumber, String buyerAccountNumber, double amount, LocalDate date) {
        this.sellerAccountNumber = sellerAccountNumber;
        this.buyerAccountNumber = buyerAccountNumber;
        this.amount = amount;
        this.date = date;
    }
//Getters y Setters
    public String getSellerAccountNumber() {
        return sellerAccountNumber;
    }

    public void setSellerAccountNumber(String sellerAccountNumber) {
        this.sellerAccountNumber = sellerAccountNumber;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
//ToString para devolver todos los datos de una transaccion
    @Override
    public String toString() {
        return "Transaction: || " +
                "sellerAccountNumber=" + sellerAccountNumber +
                " || buyerAccountNumber=" + buyerAccountNumber +
                " || amount=" + amount +
                " || date=" + date + "\n";
    }
}
