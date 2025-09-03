package main.java.phonebook.view;

import java.util.Scanner;

public class inputView {
    Scanner sc = new Scanner(System.in);

    public String promptForName() {
        System.out.print("이름을 입력하세요: ");
        return sc.nextLine();
    }

    public String promptForPhoneNumber() {
        System.out.print("전화번호를 입력하세요: ");
        return sc.nextLine();
    }

    public String promptForEmail() {
        System.out.print("이메일을 입력하세요: ");
        return sc.nextLine();
    }

}
