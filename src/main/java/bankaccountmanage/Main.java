package main.java.bankaccountmanage;

import main.java.bankaccountmanage.view.OutputView;
import main.java.bankaccountmanage.controller.ManageController;

public class Main {
    public static void main(String[] args) {
        OutputView outputView = new OutputView();

        ManageController controller = new ManageController(outputView);
        controller.run();
    }
}
