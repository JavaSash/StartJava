import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        String yesNo;
        do {
            Calculator calc = new Calculator();
            System.out.println("Введите число");
            Scanner scan1 = new Scanner(System.in);
            if(scan1.hasNextInt()) {
                calc.setNumb1(scan1.nextInt());
            } else {
                System.out.println("Вы ввели не число");
            }

            System.out.println("Введите математическую операцию");
            Scanner scanMathOperation = new Scanner(System.in);
            calc.setMathOperation(scanMathOperation.next().charAt(0));

            System.out.println("Введите второе число");
            Scanner scan2 = new Scanner(System.in);
            if(scan2.hasNextInt()) {
                calc.setNumb2(scan2.nextInt());
            } else {
                System.out.println("Вы ввели не число");
            }

            calc.getResult();

            System.out.println("Хотите продолжить? [y/n]");
            Scanner exit = new Scanner(System.in);
            yesNo = exit.nextLine();
        } while (yesNo.equalsIgnoreCase("y"));
    }
}