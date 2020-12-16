package com.startjava.Lesson2_3.calculator.Calculator;

public class Calculator {
    private int numb1;
    private int numb2;
    private int result;
    private char mathOperation;

    public void setNumb1(int numb1) {
        this.numb1 = numb1;
    }

    public void setMathOperation(char mathOperation) {
        this.mathOperation = mathOperation;
    }

    public void setNumb2(int numb2) {
        this.numb2 = numb2;
    }

    public int calculate() {
        switch(mathOperation) {
            case '+':
                result = numb1 + numb2;
                break;
            case '-':
                result = numb1 - numb2;
                break;
            case '*':
                result = numb1 * numb2;
                break;
            case '/':
                if(numb2 != 0) {
                    result = numb1 / numb2;
                } else {
                    System.out.println("На ноль делить нельзя");
                }
                break;
            case '%':
                result = numb1 % numb2;
                break;
            case '^':
                int degree = 1;
                result = numb1;
                while(degree < numb2) {
                    result *= numb1;
                    degree++;
                }
                break;
            default:
                System.out.println("Нет такой математической операции. Попробуйте ещё раз");
        }
        return result;
    }
}