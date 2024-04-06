package com.miguel.interfaces;

import com.miguel.classes.Transaction;

import java.time.LocalDate;
import java.util.ArrayList;

//Interfaz con los metodos que usaremos para operar con transacciones
public interface TransactionList {
    Transaction getLastTransaction(); //Devuelve la ultima transaccion realizada
    void addTransaction(Transaction transaction); //Añade una transaccion al ArrayList de transacciones
    Transaction getTransactionByDate(LocalDate date); //Devuelve las transacciones que coincidan con la fecha dada
    ArrayList<Transaction> getAllTransactions(); //Devuelve una lista con todas las transacciones

}
