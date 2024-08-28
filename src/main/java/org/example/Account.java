package org.example;

import java.math.BigDecimal;
import java.util.Objects;

public class Account {
    private String accountNumber;
    private BigDecimal balance;
    private ClientRecord client;

    public Account(String accountNumber, BigDecimal balance, ClientRecord client) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.client = client;
    }

    public void deposit(BigDecimal amount) {
        if (amount.compareTo(BigDecimal.ZERO) <= 0) {
            throw new IllegalArgumentException("Deposit amount must be positive");
        }
        this.balance = this.balance.add(amount);
    }

    public void withdraw(BigDecimal amount) {
    if (amount.compareTo(BigDecimal.ZERO) <= 0) {
        throw new IllegalArgumentException("Withdrawal amount must be positive");
    }
    if (this.balance.compareTo(amount) < 0) {
        throw new IllegalStateException("Insufficient funds");
    }
    this.balance = this.balance.subtract(amount);
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public ClientRecord getClient() {
        return client;
    }

    public void setClient(ClientRecord client) {
        this.client = client;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountNumber='" + accountNumber + '\'' +
                ", balance=" + balance +
                ", client=" + client +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return Objects.equals(accountNumber, account.accountNumber) && Objects.equals(balance, account.balance) && Objects.equals(client, account.client);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountNumber, balance, client);
    }
}
