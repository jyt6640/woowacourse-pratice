package main.myPratice;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<Contact> contacts = new HashSet<>();
        while(true) {
            System.out.println("==================================================================");
            System.out.println("1. 연락처 추가 | 2. 연락처 조회 | 3. 연락처 검색 | 4. 연락처 삭제 | 5. 종료");
            System.out.println("==================================================================");
            System.out.print("메뉴를 선택하세요: ");
            int menu = Integer.parseInt(scanner.nextLine());

            if (menu == 1) {
                System.out.print("이름: ");
                String name = scanner.nextLine();
                System.out.print("전화번호: ");
                String phoneNumber = scanner.nextLine();
                System.out.print("이메일: ");
                String email = scanner.nextLine();
                contacts.add(new Contact(name,phoneNumber,email));
                System.out.println(name + "님의 연락처가 추가되었습니다.");
            } else if (menu == 2) {
                for (Contact c : contacts) {
                    System.out.println("이름: " + c.getName() + ", 전화번호: " + c.getPhoneNumber() + ", 이메일: " + c.getEmail());
                }
                System.out.println("연락처를 조회합니다.");
            } else if (menu == 3) {
                System.out.print("검색할 이름을 입력하세요: ");
                String searchName = scanner.nextLine();
                System.out.println(searchName + "님의 연락처를 검색합니다.");
                boolean found = false;
                if(contacts.isEmpty()){
                    System.out.println("검색 결과가 없습니다.");
                } else {
                    for (Contact c : contacts) {
                        if (c.getName().equals(searchName)) {
                            System.out.println("이름: " + c.getName() + ", 전화번호: " + c.getPhoneNumber() + ", 이메일: " + c.getEmail());
                            found = true;
                        }
                    } if (!found) { System.out.println("검색 결과가 없습니다."); }
                }
            } else if (menu == 4) {
                System.out.print("삭제할 이름을 입력하세요: ");
                String deleteName = scanner.nextLine();
                Iterator<Contact> iterator = contacts.iterator();
                boolean deleted = false;
                if(contacts.isEmpty()){
                    System.out.println("삭제할 연락처가 없습니다.");
                } else {
                    while (iterator.hasNext()) {
                        if(iterator.next().getName().equals(deleteName)) {
                            iterator.remove();
                            deleted = true;
                        }
                    }
                } if (!deleted) { System.out.println("삭제할 연락처가 없습니다."); continue; }
                System.out.println(deleteName + "님의 연락처가 삭제되었습니다.");
            } else if (menu == 5) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else {
                System.out.println("잘못된 메뉴입니다. 다시 선택하세요.");
            }
        }
    }
}
