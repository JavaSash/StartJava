package com.startjava.lesson2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        String answer;
        do {
            Calculator calc = new Calculator();
            Scanner scan = new Scanner(System.in);

            System.out.print("Введите математическое выражение через пробел: ");
            String expression = scan.nextLine();

            if(calc.calculate(expression) != null){
                System.out.println(calc.calculate(expression));
            }

            System.out.println("Вы хотите продолжить? [y/n]");
            answer = scan.nextLine();

            while(!answer.equalsIgnoreCase("y") && !answer.equalsIgnoreCase("n")) {
                System.out.println("Введите [y/n]");
                answer = scan.nextLine();
            }
        } while(answer.equalsIgnoreCase("y"));
    }
}