package main.java.phonebook;

import main.java.phonebook.controller.PhonebookController;
import main.java.phonebook.view.PhonebookView;

public class Main {
    public static void main(String[] args) {
        PhonebookView view = new PhonebookView();
        PhonebookController controller = new PhonebookController(view);
        controller.run();
    }
}