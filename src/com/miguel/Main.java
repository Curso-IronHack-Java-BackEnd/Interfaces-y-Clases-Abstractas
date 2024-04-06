//Importamos paquetes y clases necesarios
package com.miguel;

import com.miguel.classes.Account;
import com.miguel.classes.PaymentList;
import com.miguel.classes.Transaction;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        //Creamos algunas Accounts y Transactions
        Account sellerAccount = new Account("Juan Pérez", "Calle Mayor 123", "ES1234567890", 1000.0);
        Account buyerAccount = new Account("Ana López", "Calle del Sol 456", "ES9876543210", 500.0);

        Transaction transaction = new Transaction(sellerAccount.getAccountNumber(), buyerAccount.getAccountNumber(), 200.0, LocalDate.now());
        Transaction transaction2 = new Transaction(sellerAccount.getAccountNumber(), buyerAccount.getAccountNumber(), 1300.0, LocalDate.now());

        //Modificamos algunos datos para comprobar que los setters funcionan
        sellerAccount.setName("Juan Ortiz");
        transaction2.setAmount(2200);

        //Metodo toString
        System.out.println(sellerAccount.toString());

        //Creamos una PaymentList y le añadimos las 2 transacciones creadas
        PaymentList paymentList = new PaymentList();
        paymentList.addTransaction(transaction);
        paymentList.addTransaction(transaction2);

        //Probamos los metodos getLastTransaction(), getTransactionByDate y getAllTransactions
        System.out.println("Última transacción: " + paymentList.getLastTransaction());

        Transaction foundTransaction = paymentList.getTransactionByDate(transaction2.getDate());
        if (foundTransaction != null) {
            System.out.println("Transacción encontrada: " + foundTransaction);
        } else {
            System.out.println("No se encontró ninguna transacción para la fecha indicada");
        }

        System.out.println("Todas las transacciones: \n" + paymentList.getAllTransactions());

    }
}