package com.startjava.lesson1.calculator;

public class Calculator {
    public static void main(String[] args) {
        int a = 5, b = 4, result = 0;
        char sign = '^';
        if(sign == '+') {
            result = a + b;
            System.out.println("Сумма \"a\" и \"b\" равна " + result);
        } else if (sign == '-') {
            result = a - b;
            System.out.println("Разность \"a\" и \"b\" равна " + result);
        } else if (sign == '*') {
            result = a * b;
            System.out.println("Произведение \"a\" и \"b\" равно " + result);
        } else if (sign == '/') {
            if(b != 0) {
                result = a / b;
                System.out.println("Результат деления \"a\" на \"b\" равен " + result);
            } else if(b == 0) {
                System.out.println("На ноль никто не делит, это моветон");
            }
        } else if(sign == '%') {
            result = a % b;
            System.out.println("Остаток от деления \"a\" на \"b\" " + result);
        } else if(sign == '^') {
            int degree = 1;
            result = a;
            while(degree < b) {
                result *= a;
                degree++;
            }
            System.out.println("Результат возведения \"a\" в степень \"b\" " + result);
        }
    }
}