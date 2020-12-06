import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        String answer;
        Calculator calc = new Calculator();
        Scanner scan = new Scanner(System.in);

        do {
            calc.setNumb1(enterNumber());

            System.out.println("Введите математическую операцию");
            calc.setMathOperation(scan.next().charAt(0));

            calc.setNumb2(enterNumber());

            System.out.println(calc.calculate());
            scan.nextLine();

            System.out.println("Вы хотите продолжить? [y/n]");
            answer = scan.nextLine();

            yesNoCycle: {
                while(answer != "y" && answer != "n") {
                    switch(answer) {
                        case "y":
                            break yesNoCycle;
                        case "n":
                            break yesNoCycle;
                        default:
                            System.out.println("Введите [y/n]");
                            answer = scan.nextLine();
                    }
                }
            }
        } while(answer.equalsIgnoreCase("y"));
    }

    public static int enterNumber() {
        Scanner scan = new Scanner(System.in);
        boolean checkInt;
        int number = 0;
        do {
            System.out.println("Введите число");
            checkInt = scan.hasNextInt();
            if(checkInt) {
                number = scan.nextInt();
            } else {
                System.out.println("Вы ввели не число\n");
            }
            scan.nextLine();
        } while(!checkInt);
        return number;
    }
}