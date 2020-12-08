import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    static int number;

    public static int enterNumber(String name) {
        Scanner scan = new Scanner(System.in);
        boolean checkInt;
        do {
            System.out.println(name + " введите число");
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

    public void startGame(String name1, String name2) {
        Random random = new Random();
        int compNumb = random.nextInt(100)+1;

        boolean win = false;

        do{
            enterNumber(name1);
            if(number == compNumb) {
                System.out.println(name1 + ", вы угадали, поздравляем!");
                win = true;
                continue;
            } else if(number > compNumb) {
                System.out.println(name1 + ", введенное вами число " + number + " больше того, что загадал компьютер");
                //win = false;
            } else if(number < compNumb) {
                System.out.println(name1 + ", введенное вами число " + number + " меньше того, что загадал компьютер");
                //win = false;
            }

            enterNumber(name2);
            if(number == compNumb) {
                System.out.println(name2 + ", вы угадали, поздравляем!");
                win = true;
            } else if(number > compNumb) {
                System.out.println(name2 + ", введенное вами число " + number + " больше того, что загадал компьютер");
                //win = false;
            } else if(number < compNumb) {
                System.out.println(name2 + ", введенное вами число " + number + " меньше того, что загадал компьютер");
                //win = false;
            }
        } while(win == false);
    }
}