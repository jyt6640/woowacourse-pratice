package main.java.bankaccountmanage;

import main.java.bankaccountmanage.view.InputView;
import main.java.bankaccountmanage.view.OutputView;
import main.java.bankaccountmanage.controller.ManageController;

public class Main {
    public static void main(String[] args) {
        OutputView outputView = new OutputView();
        InputView inputView = new InputView();

        ManageController controller = new ManageController(outputView, inputView);
        controller.run();
    }
}
