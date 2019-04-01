package com.gmail3070799pp;

public class Calculator {
    public static int getInt(){
        System.out.println("Введите число(0-10):");
        int value = Integer.parseInt(Operation.readConsoleValue());
        if (value >= 0 && value <=10){
            return value;
        }else {
            System.out.println("Некоректрый ввод, попробуйте еще раз");
            value = getInt();
        }
        return value;
    }
    public static char getOperation(){
        System.out.println("Введите операцию (+,-,*,/):");
        char value = Operation.readConsoleValue().charAt(0);
        if (value == '+' || value == '-' || value == '*' || value == '/'){
            return value;
        }else{
            System.out.println("Некоректрый ввод, попробуйте еще раз");
            value = getOperation();
        }
        return value;
    }

    public static int calc(int a, int b, char operation){
        int result = 0;
        if(operation == '+'){
            result = a+b;
        }else if(operation == '-'){
            result = a-b;
        }else if(operation == '/'){
            result = a/b;
        }else if(operation == '*'){
            result = a*b;
        }

        return result;
    }
}
