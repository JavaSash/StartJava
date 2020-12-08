import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String answer;

        do {
            System.out.println("\nПриветсвую тебя в игре \"Угадай число\"! \n\n Игра рассчитана на двух игроков. Компьютер загадывает число, а вы должны его угадать. \n Для начала введите свои имена.\n");

            System.out.println("Игрок 1, представься: ");
            Player player1 = new Player(scan.nextLine());

            System.out.println("Игрок 2, представься: ");
            Player player2 = new Player(scan.nextLine());

            GuessNumber game = new GuessNumber();
            game.startGame(player1.getPlayerName(), player2.getPlayerName());

            System.out.println("Вы хотите продолжить? [y/n]");
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
