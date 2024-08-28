package org.example;

import java.math.BigDecimal;


public class Main {
    public static void main(String[] args) {
    StudentRecord studentRecord=new StudentRecord("1a12","Thomas","Bauer",23);
    System.out.println(studentRecord.age());


    ClientRecord client1=new ClientRecord("Ahmad","Alinaghian","1");
    ClientRecord client2=new ClientRecord("Marlene","Anton","2");
    ClientRecord client3=new ClientRecord("Ahmed","God","3");
    ClientRecord client4=new ClientRecord("Ferdinand","Speer","4");

//    Account account1=new Account("a123",new BigDecimal("123.333"),client1);
//        System.out.println(account1.getBalance());
//        System.out.println(account1);
//
//
//    Account account2=new Account("a123",new BigDecimal("123.333"),client2);
//        System.out.println(account2.getBalance());
//        System.out.println(account2);
//}

    BankService bankService=new BankService();

        String account1 = bankService.openAccount(client1);
        String account2 = bankService.openAccount(client2);
        String account3 = bankService.openAccount(client3);
        String account4 = bankService.openAccount(client4);



        // Step 4: Attempt to transfer money (this will likely fail due to insufficient funds)
        try {
            String result = bankService.TransferService(account1, account2, BigDecimal.valueOf(100));
            System.out.println("Transfer result: " + result);
        } catch (Exception e) {
            System.out.println("Transfer failed: " + e.getMessage());
        }


}}