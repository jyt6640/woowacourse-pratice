package main.java.bankaccountmanage.service;

import main.java.bankaccountmanage.model.Account;

import java.util.HashSet;
import java.util.Set;

public class ManageService {
    private final Set<Account> accountSet = new HashSet<>();

    public boolean addService(Account account) {
        if (accountSet.contains(account)) {
            return false; // 이미 존재하는 계좌
        }
        return accountSet.add(account);
    }

    public Set<Account> getAllAccountsService() {
        return accountSet;
    }

    public Account searchService(String accountNumber) {
        for (Account a : accountSet) {
            if (a.getAccountNumber().equals(accountNumber)) {
                return a;
            }
        }
        return null;
    }

    public Account depositService(String accountNumber, int amount) {
        for (Account a : accountSet ) {
            if (a.getAccountNumber().equals(accountNumber)) {
                a.depositBalance(amount);
                return a;
            }
        }
        return null;
    }

    public Account withdrawService(String accountNumber, int amount) {
        for (Account a : accountSet ) {
            if (a.getAccountNumber().equals(accountNumber)) {
                if(a.getBalance() < amount) {
                    return null;
                }
                a.WithdrawBalance(amount);
                return a;
            }
        }
        return null;
    }

}
