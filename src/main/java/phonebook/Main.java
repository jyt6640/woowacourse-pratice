package main.java.phonebook;

import main.java.phonebook.controller.PhonebookController;
import main.java.phonebook.view.inputView;
import main.java.phonebook.view.outputView;

public class Main {
    public static void main(String[] args) {
        outputView outputview = new outputView();
        inputView inputview = new inputView();
        PhonebookController controller = new PhonebookController(outputview, inputview);
        controller.run();
    }
}