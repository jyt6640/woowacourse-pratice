package main.java.bankaccountmanage.model;

public class Account {
    private String acountNumber;
    private String ownerName;
    private int balance;

    public Account(String acountNumber, String ownerName, int balance) {
        this.acountNumber = acountNumber;
        this.ownerName = ownerName;
        this.balance = balance;
    }

    @Override
    public int hashCode() { return acountNumber.hashCode(); }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return acountNumber.equals(account.acountNumber);
    }

    @Override
    public String toString() {
        return "계좌번호: " + acountNumber + ", 예금주: " + ownerName + ", 잔액: " + balance + "원";
    }
}
