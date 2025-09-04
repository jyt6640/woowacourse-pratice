package main.java.bankaccountmanage.controller;

import main.java.bankaccountmanage.view.OutputView;

import java.util.Scanner;

public class ManageController {
    private final OutputView outputView;
    private final Scanner sc = new Scanner(System.in);

    public ManageController(OutputView outputView) {
        this.outputView = outputView;
    }

    public void run() {
        while (true) {
            outputView.displayMenu();
            String input = sc.nextLine();

            switch (input) {
                case "1":
                    outputView.showMessage("계좌 개설 기능을 선택하셨습니다.");
                    // 계좌 개설 로직 추가
                    break;
                case "2":
                    outputView.showMessage("계좌 조회 기능을 선택하셨습니다.");
                    // 계좌 조회 로직 추가
                    break;
                case "3":
                    outputView.showMessage("입금 기능을 선택하셨습니다.");
                    // 입금 로직 추가
                    break;
                case "4":
                    outputView.showMessage("출금 기능을 선택하셨습니다.");
                    // 출금 로직 추가
                    break;
                case "5ㅋ":
                    outputView.showMessage("프로그램을 종료합니다.");
                    return;
                default:
                    outputView.showMessage("잘못된 입력입니다. 다시 시도해주세요.");
            }
        }
    }
}
