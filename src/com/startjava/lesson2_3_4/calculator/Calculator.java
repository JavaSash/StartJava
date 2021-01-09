package com.startjava.lesson2_3_4.calculator;

public class Calculator {
    private int numb1;
    private int numb2;
    private char mathOperation;

    public Integer calculate(String expression) {
        String[] exprArray;
        exprArray = expression.split(" ");
        numb1 = Integer.parseInt(exprArray[0]);
        mathOperation = exprArray[1].charAt(0);
        numb2 = Integer.parseInt(exprArray[2]);

        switch(mathOperation) {
            case '+':
                return numb1 + numb2;
            case '-':
                return numb1 - numb2;
            case '*':
                return numb1 * numb2;
            case '/':
                if(numb2 != 0) {
                    return numb1 / numb2;
                } else {
                    System.out.println("На ноль делить нельзя");
                    return null;
                }
            case '%':
                return numb1 % numb2;
            case '^':
                return (int) Math.pow(numb1, numb2);
            default:
                System.out.println("Нет такой математической операции. Попробуйте ещё раз");
                return null;
        }
    }
}