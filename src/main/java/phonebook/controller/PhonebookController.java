package main.java.phonebook.controller;

import main.java.phonebook.model.Contact;
import main.java.phonebook.view.outputView;
import main.java.phonebook.view.inputView;
import main.java.phonebook.service.PhonebookService;

import java.util.Scanner;

public class PhonebookController {
    private final outputView outputview;
    private inputView inputview;
    private final Scanner sc = new Scanner(System.in);
    private final PhonebookService service = new PhonebookService();


    public PhonebookController(outputView outputview, inputView inputview) {
        this.outputview = outputview;
        this.inputview = inputview;
    }


    public void run() {
        while (true) {
            outputview.displayMenu();
            String input = sc.nextLine();

            switch (input) {
                case "1":
                    outputview.showMessage("연락처 추가 기능을 선택하셨습니다.");
                    addContact();
                    break;
                case "2":
                    outputview.showMessage("연락처 조회 기능을 선택하셨습니다.");
                    viewAllContacts();
                    break;
                case "3":
                    outputview.showMessage("연락처 검색 기능을 선택하셨습니다.");
                    foundContact();
                    break;
                case "4":
                    outputview.showMessage("연락처 삭제 기능을 선택하셨습니다.");
                    break;
                case "5":
                    {
                        outputview.showMessage("프로그램을 종료합니다.");
                    return;
                }
                default:
                    outputview.showMessage("잘못된 입력입니다. 다시 시도해주세요.");
            }
        }
    }

    private void addContact() {
        String name = inputview.promptForName();
        String phoneNumber = inputview.promptForPhoneNumber();
        String email = inputview.promptForEmail();
        Contact contact = new Contact(name, phoneNumber, email);

        boolean add = service.addContact(contact);
        if (add) {
            outputview.showMessage(name + "님의 연락처가 추가되었습니다.");
        } else {
            outputview.showMessage("이미 존재하는 연락처입니다.");
        }
    }

    private void viewAllContacts() {
        for (Contact contact : service.getAllContacts()) {
            outputview.showMessage(contact.toString());
        }
    }

    private void foundContact() {
        String name = inputview.promptForSearch();
        Contact foundContact = service.searchContact(name);
        outputview.showContact(foundContact);
    }


}
