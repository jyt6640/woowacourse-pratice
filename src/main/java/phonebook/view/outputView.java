package main.java.phonebook.view;

import main.java.phonebook.model.Contact;

public class outputView {
    public void displayMenu() {
        System.out.println("==================================================================");
        System.out.println("1. 연락처 추가 | 2. 연락처 조회 | 3. 연락처 검색 | 4. 연락처 삭제 | 5. 종료");
        System.out.println("==================================================================");
        System.out.print("메뉴를 선택하세요: ");
    }

    public void showMessage(String message) {
        System.out.println(message);
    }

    public void showContact(Contact c) {
        if (c == null) {
            System.out.println("검색 결과가 없습니다.");
        } else {
            System.out.println(c.toString());
        }
    }
}
