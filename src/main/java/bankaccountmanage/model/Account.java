package main.java.bankaccountmanage.model;

public class Account {
    private String accountNumber;
    private String ownerName;
    private int balance;

    public Account(String accountNumber, String ownerName, int balance) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = balance;
    }

    public String getAccountNumber() { return accountNumber; }

    public int depositBalance(int amount) { return balance += amount; }

    @Override
    public int hashCode() { return accountNumber.hashCode(); }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return accountNumber.equals(account.accountNumber);
    }

    @Override
    public String toString() {
        return "계좌번호: " + accountNumber + ", 예금주: " + ownerName + ", 잔액: " + balance + "원";
    }
}
