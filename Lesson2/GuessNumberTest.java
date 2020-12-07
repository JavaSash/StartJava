import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean win;
        String answer;

        do {
            System.out.println("\nПриветсвую тебя в игре \"Угадай число\"! \n\n Игра рассчитана на двух игроков. Компьютер загадывает число, а вы должны его угадать. \n Для начала введите свои имена.\n");

            System.out.println("Игрок 1, представься: ");
            Player player1 = new Player(scan.nextLine());

            System.out.println("Игрок 2, представься: ");
            Player player2 = new Player(scan.nextLine());

            do {
                GuessNumber game = new GuessNumber();
                player1.setPlayerNumber(enterNumber(player1.getPlayerName()));
                win = game.startGame(player1.getPlayerName(), player1.getPlayerNumber());
                if(win) {
                    continue;
                }
                player2.setPlayerNumber(enterNumber(player2.getPlayerName()));
                win = game.startGame(player2.getPlayerName(), player2.getPlayerNumber());
            } while(win == false);

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

    public static int enterNumber(String name) {
        Scanner scan = new Scanner(System.in);
        boolean checkInt;
        int number = 0;
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

}
