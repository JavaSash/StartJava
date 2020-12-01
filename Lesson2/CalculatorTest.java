import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        String answer;
        Calculator calc = new Calculator();
        Scanner scan = new Scanner(System.in);
        int numb1;
        int numb2;
        char mathOperation;
        boolean checkInt;

        do {
            do {
                System.out.println("Введите первое число");
                checkInt = scan.hasNextInt();
                if(checkInt) {
                    calc.setNumb1(scan.nextInt());
                } else {
                    scan.nextLine();
                }
            } while(!checkInt);

            System.out.println("Введите математическую операцию");
            scan.nextLine();
            calc.setMathOperation(scan.next().charAt(0));
            scan.nextLine();

            do {
                System.out.println("Введите второе число");
                checkInt = scan.hasNextInt();
                if(checkInt) {
                    calc.setNumb2(scan.nextInt());
                } else {
                    scan.nextLine();
                }
            } while(!checkInt);

            System.out.println(calc.calculate());

            System.out.println("Вы хотите продолжить? [y/n]");
            scan.nextLine();
            answer = scan.nextLine();

            while(answer != "y" && answer != "n") {
                switch(answer) {
                    case "y":
                        answer = "y";
                        break;
                    case "n":
                        answer = "n";
                        break;
                    default:
                        System.out.println("Введите [y/n]");
                        answer = scan.nextLine();
                }
            }
        } while(answer.equalsIgnoreCase("y"));
    }
}