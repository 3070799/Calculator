package com.gmail3070799pp;

public class Main {
    public static void main(String[] args) {


        boolean checkExit = true;
        while (checkExit) {
            Menu.mainMenu();
            checkExit = Operation.checkExit();
        }

    }
}
