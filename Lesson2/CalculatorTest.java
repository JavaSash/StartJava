import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        //int numb1, numb2, result;
        //char mathOperation;

        Calculator numb1 = new Calculator();
        System.out.println("Введите число");
        Scanner scan1 = new Scanner(System.in);
        if(scan1.hasNextInt()) {
            numb1.setNumb1(scan1.nextInt());
        } else {
            System.out.println("Вы ввели не число");
        }

        Calculator mathOperation = new Calculator();
        System.out.println("Введите математическую операцию");
        Scanner scanMathOperation = new Scanner(System.in);
        mathOperation.setMathOperation(scanMathOperation.next().charAt(0));
        /*if(scanMathOperation.hasNextChar) {
            mathOperation.setMathOperation(scanMathOperation.next().charAt(0));
        } else {
            System.out.println("Вы ввели не математический знак");
        }*/

        Calculator numb2 = new Calculator();
        System.out.println("Введите второе число");
        Scanner scan2 = new Scanner(System.in);
        if(scan2.hasNextInt()) {
            numb2.setNumb2(scan2.nextInt());
        } else {
            System.out.println("Вы ввели не число");
        }

        Calculator result = new Calculator();
        result.getResult();
    }
}