package com.miguel.classes;

import com.miguel.interfaces.TransactionList;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

//Implementamos TransactionList para usar los metodos alli declarados, aqui los definiremos
public class PaymentList implements TransactionList {
    private ArrayList<Transaction> transactions; //Creamos un arrayList donde guardaremos todas las transacciones

    //Construtor PaymentList, se crea vacio
    public PaymentList(){
        this.transactions=new ArrayList<>();
    }

    @Override
    public Transaction getLastTransaction() { //Devuelve la ultima transaccion
        return transactions.getLast();
    }

    //Metodo que comprueba que haya alguna transaccion que coincida con la fecha dada,
    // recorre el ArrayList y si hay alguna la devuelve y en caso contrario devuelve null
    @Override
    public Transaction getTransactionByDate(LocalDate date) {
        for (Transaction transaction : transactions) {
            if (transaction.getDate().equals(date)) {
                return transaction;
            }
        }
        return null;
    }

    @Override
    public ArrayList<Transaction> getAllTransactions() {//Devuelve todas las transacciones del ArrayList
        return transactions;
    }

    @Override
    public void addTransaction(Transaction transaction) {//Añade la transaccion actual al ArrayList
        transactions.add(transaction);

    }
}
