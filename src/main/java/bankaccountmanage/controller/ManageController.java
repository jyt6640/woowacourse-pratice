package main.java.bankaccountmanage.controller;

import main.java.bankaccountmanage.view.OutputView;
import main.java.bankaccountmanage.view.InputView;
import main.java.bankaccountmanage.model.Account;
import main.java.bankaccountmanage.service.ManageService;

import java.util.Scanner;

public class ManageController {
    private final OutputView outputView;
    private InputView inputView;
    private final ManageService service = new ManageService();
    private final Scanner sc = new Scanner(System.in);

    public ManageController(OutputView outputView, InputView inputView) {
        this.outputView = outputView;
        this.inputView = inputView;
    }

    public void run() {
        while (true) {
            outputView.displayMenu();
            String input = sc.nextLine();

            switch (input) {
                case "1":
                    outputView.showMessage("계좌 개설 기능을 선택하셨습니다.");
                    addAccount();
                    break;
                case "2":
                    outputView.showMessage("전체 계좌 조회 기능을 선택하셨습니다.");
                    ViewAllAccounts();
                    break;
                case "3":
                    outputView.showMessage("특정 계좌 조회 기능을 선택하셨습니다.");
                    // 특정 계좌 조회 로직 추가
                    break;
                case "4":
                    outputView.showMessage("입금 기능을 선택하셨습니다.");
                    // 입금 로직 추가
                    break;
                case "5":
                    outputView.showMessage("출금 기능을 선택하셨습니다.");
                    // 출금 로직 추가
                    break;
                case "6":
                    outputView.showMessage("프로그램을 종료합니다.");
                    return;
                default:
                    outputView.showMessage("잘못된 입력입니다. 다시 시도해주세요.");
            }
        }
    }

    public void addAccount() {
        String accountHolder = inputView.promptForAccountNumber();
        String accountNumber = inputView.promptForOwnerName();
        int accountBalance = inputView.pronptForAmount();
        Account account = new Account(accountHolder, accountNumber, accountBalance);

        boolean add = service.addService(account);
        if (add) {
            outputView.showMessage("계좌가 성공적으로 개설되었습니다.");
        } else {
            outputView.showMessage("이미 존재하는 계좌번호입니다. 다시 시도해주세요.");
        }
    }

    public void ViewAllAccounts() {
        for (Account account : service.getAllAccountsService()) {
            outputView.showMessage(account.toString());
        }
        if(service.getAllAccountsService().isEmpty()) {
            outputView.showMessage("등록된 계좌가 없습니다.");
        }
    }
}
