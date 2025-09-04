package main.java.bankaccountmanage.view;

public class OutputView {
    public void displayMenu() {
        System.out.println("===========================================================================");
        System.out.println("1. 계좌 개설 | 2. 전체 계좌 조회 | 3. 특정 계좌 조회 | 4. 출금 | 5. 입금 | 6. 종료");
        System.out.println("===========================================================================");
        System.out.print("메뉴를 선택하세요: ");
    }

    public void showMessage(String message) { System.out.println(message); }
}
