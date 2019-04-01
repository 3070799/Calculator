package com.gmail3070799pp;

import java.util.Scanner;

public class Operation {



    public static boolean checkExit(){
        System.out.println("Чтобы выполниль еще одну операцию введите: 1");
        System.out.println("чтобы закрыть програму введите: 2");
        int value = Integer.parseInt(readConsoleValue());
        if (value == 1){
            return true;
        }else if (value == 2){
            return  false;
        }else {
            System.out.println("Некоректрый ввод, попробуйте еще раз");
            checkExit();
        }
        return true;
    }

    public static String readConsoleValue(){
        Scanner sc = new Scanner(System.in);
        String value = sc.nextLine();
        return value;
    }
}
