package com.gmail3070799pp;

public class Menu {

    public static void mainMenu(){
        System.out.println("Для работы с арабскими числами введите:1");
        System.out.println("Для работы с римскими числами введите:2");

        int value = Integer.parseInt(Operation.readConsoleValue());

        if(value == 1){
            arabic();
        }else if (value == 2){
            roman();
        }else{
            System.out.println("Некоректрый ввод, попробуйте еще раз");
            mainMenu();
        }
    }

    public static void roman (){
        System.out.println("Введите число(I-X):");
        String s1 = Operation.readConsoleValue();
        System.out.println("Введите операцию (+,-,*,/):");
        char operation = Calculator.getOperation();
        System.out.println("Введите число(I-X):");
        String s2 = Operation.readConsoleValue();
        int a = RomanFormat.romanToInt(s1);
        int b = RomanFormat.romanToInt(s2);
        String result = RomanFormat.intToRoman(Calculator.calc(a, b, operation));
        System.out.println("----------------------------------");
        System.out.println("Результат: " + s1 + operation + s2 + '=' + result);
        System.out.println("----------------------------------");
    }

    public static void arabic (){
        int a = Calculator.getInt();
        char operation = Calculator.getOperation();
        int b = Calculator.getInt();
        int result = Calculator.calc(a, b, operation);
        System.out.println("----------------------------------");
        System.out.println("Результат: " + a + operation + b + '=' + result);
        System.out.println("----------------------------------");
    }
}
