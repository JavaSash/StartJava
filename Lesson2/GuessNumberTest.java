import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String answer;

        do {
            System.out.println("\nПриветсвую тебя в игре \"Угадай число\"! \n");
            System.out.print("Игра рассчитана на двух игроков.");
            System.out.println("Компьютер загадывает число, а вы должны его угадать.");
            System.out.println("Для начала введите свои имена.\n");

            System.out.println("Игрок 1, представься: ");
            Player player1 = new Player(scan.nextLine());

            System.out.println("Игрок 2, представься: ");
            Player player2 = new Player(scan.nextLine());

            GuessNumber game = new GuessNumber(player1, player2);
            game.start();

            System.out.println("Вы хотите продолжить? [y/n]");
            answer = scan.nextLine();

            while(!answer.equalsIgnoreCase("y") && !answer.equalsIgnoreCase("n")) {
                switch(answer) {
                    default:
                        System.out.println("Введите [y/n]");
                        answer = scan.nextLine();
                }
            }
        } while(answer.equalsIgnoreCase("y"));
    }
}