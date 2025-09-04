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
}
