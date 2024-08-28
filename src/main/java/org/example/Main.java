package org.example;

import java.math.BigDecimal;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    StudentRecord studentRecord=new StudentRecord("1a12","Thomas","Bauer",23);
    System.out.println(studentRecord.age());


    ClientRecord client1=new ClientRecord("Ahmad","Alinaghian","1");
    ClientRecord client2=new ClientRecord("Marlene","Anton","2");
    ClientRecord client3=new ClientRecord("Ahmed","God","3");
    ClientRecord client4=new ClientRecord("Ferdinand","Speer","4");

    Account account=new Account("a123",new BigDecimal("123.333"),client1);
        System.out.println(account.getBalance());
        System.out.println(account);
    }
}