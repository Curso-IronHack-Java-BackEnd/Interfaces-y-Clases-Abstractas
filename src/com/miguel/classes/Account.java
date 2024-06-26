package com.miguel.classes;

public class Account {
    private String name;
    public String address;
    private String accountNumber;
    private double balance;

    //Constructor Account
    public Account(String name, String address, String accountNumber, double balance) {
        this.name = name;
        this.address = address;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    //Getters y Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    //Metodo toString para devolver todos los datos de una cuenta
    @Override
    public String toString() {
        return "Account:" +
                "\nname='" + name + '\'' +
                "\naddress='" + address + '\'' +
                "\naccountNumber=" + accountNumber +
                "\nbalance=" + balance + "\n";
    }
}
