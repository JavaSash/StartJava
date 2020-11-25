import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        String answer;

        do {
            boolean yesNo = true;

            Calculator calc = new Calculator();
            System.out.println("Введите число");
            Scanner scan = new Scanner(System.in);
            if(scan.hasNextInt()) {
                calc.setNumb1(scan.nextInt());
            } else {
                System.out.println("Вы ввели не число");
            }

            System.out.println("Введите математическую операцию");
            calc.setMathOperation(scan.next().charAt(0));

            System.out.println("Введите второе число");
            if(scan.hasNextInt()) {
                calc.setNumb2(scan.nextInt());
            } else {
                System.out.println("Вы ввели не число");
            }

            calc.calculate();

            System.out.println("Вы хотите продолжить? [y/n]");
            Scanner exit = new Scanner(System.in);
            answer = exit.nextLine();

            while(yesNo) {
                switch(answer) {
                    case "y":
                        yesNo = false;
                        break;
                    case "n":
                        yesNo = false;
                        break;
                    default:
                        yesNo = true;
                        System.out.println("Введите [y/n]");
                        answer = exit.nextLine();
                }
            }
        } while (answer.equalsIgnoreCase("y"));
    }
}