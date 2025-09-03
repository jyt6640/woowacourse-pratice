package main.java.phonebook.controller;

import main.java.phonebook.view.PhonebookView;

import java.util.Scanner;

public class PhonebookController {
    private final PhonebookView view;
    private final Scanner sc = new Scanner(System.in);

    public PhonebookController(PhonebookView view) {
        this.view = view;
    }

    public void run() {
        while (true) {
            view.displayMenu();
            String input = sc.nextLine();

            switch (input) {
                case "1":
                    view.showMessage("연락처 추가 기능을 선택하셨습니다.");
                case "2":
                    view.showMessage("연락처 조회 기능을 선택하셨습니다.");
                case "3":
                    view.showMessage("연락처 검색 기능을 선택하셨습니다.");
                case "4":
                    view.showMessage("연락처 삭제 기능을 선택하셨습니다.");
                case "5":
                    {
                    view.showMessage("프로그램을 종료합니다.");
                    return;
                }
                default:
                    view.showMessage("잘못된 입력입니다. 다시 시도해주세요.");
            }
        }
    }

}
