package main.java.phonebook;

import main.java.phonebook.controller.PhonebookController;
import main.java.phonebook.view.InputView;
import main.java.phonebook.view.OutputView;

public class Main {
    public static void main(String[] args) {
        OutputView outputview = new OutputView();
        InputView inputview = new InputView();
        PhonebookController controller = new PhonebookController(outputview, inputview);
        controller.run();
    }
}