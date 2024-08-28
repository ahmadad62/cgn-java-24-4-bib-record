package org.example;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class BankService {
    private Map<String,Account> accounts;
    private SimpleAccountNumberGenerator accountNumberGenerator;
    public BankService() {
        accounts = new HashMap<>();
        accountNumberGenerator = new SimpleAccountNumberGenerator();
    }

    public String TransferService(String fromAccount, String toAccount, BigDecimal amount) {
              Account from = accounts.get(fromAccount);
              Account to = accounts.get(toAccount);
              from.withdraw(amount);
              to.deposit(amount);
              return "from "
                      +accounts.get(fromAccount).getAccountNumber()
                      +" to "+accounts.get(toAccount).getAccountNumber()+ " "+amount+ "was transferred.";

    }

    public String openAccount(ClientRecord client) {
        String accountNumber=accountNumberGenerator.generateAccountNumber();
        Account newAccount=new Account(accountNumber, BigDecimal.ZERO, client);
        accounts.put(accountNumber,newAccount);
        return accountNumber;
    }
    private interface AccountNumberGenerator {
        String generateAccountNumber();
    }

    private class SimpleAccountNumberGenerator implements AccountNumberGenerator {
        @Override
        public String generateAccountNumber() {
            return UUID.randomUUID().toString().substring(0, 8);
        }
    }

}
