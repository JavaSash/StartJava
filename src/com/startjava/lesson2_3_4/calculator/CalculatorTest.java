package com.startjava.lesson2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        String answer;
        Calculator calc = new Calculator();
        Scanner scan = new Scanner(System.in);
        String expression;
        String[] exprArray;

        do {
            System.out.print("Введите математическое выражение через пробел: ");
            expression = scan.nextLine();
            exprArray = expression.split(" ");

            calc.setNumb1(Integer.parseInt(exprArray[0]));

            calc.setMathOperation(exprArray[1].charAt(0));

            calc.setNumb2(Integer.parseInt(exprArray[2]));

            System.out.println(calc.calculate());

            System.out.println("Вы хотите продолжить? [y/n]");
            answer = scan.nextLine();

            while(!answer.equalsIgnoreCase("y") && !answer.equalsIgnoreCase("n")) {
                System.out.println("Введите [y/n]");
                answer = scan.nextLine();
            }
        } while(answer.equalsIgnoreCase("y"));
    }
}