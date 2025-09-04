package main.java.bankaccountmanage.view;


import java.util.Scanner;

public class InputView {
    Scanner sc = new Scanner(System.in);

    public String promptForOwnerName() {
        System.out.print("예금주 이름을 입력하세요: ");
        return sc.nextLine();
    }

    public String promptForAccountNumber() {
        System.out.print("계좌 번호를 입력하세요: ");
        return sc.nextLine();
    }

    public int promptForAmount() {
        System.out.print("금액을 입력하세요: ");
        return Integer.parseInt(sc.nextLine());
    }

    public String promptForSearchAccount() {
        System.out.print("조회할 계좌 번호를 입력하세요: ");
        return sc.nextLine();
    }

    public String promptForDepositAccount() {
        System.out.print("입금할 계좌 번호를 입력하세요: ");
        return sc.nextLine();
    }

    public int promptForDepositAmount() {
        System.out.print("입금할 금액을 입력하세요: ");
        return Integer.parseInt(sc.nextLine());
    }
}
