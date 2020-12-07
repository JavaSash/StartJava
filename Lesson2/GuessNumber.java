/*Модифицируйте программу Угадай число:

реализуйте класс GuessNumber, Player и GuessNumberTest

создайте двух игроков, которые по очереди будут пытаться угадать число (вводя его с клавиатуры), загаданное компьютером

имена игроков вводите с клавиатуры перед запуском игры

поля объектов (Игроков, Игры) инициализируйте с помощью конструкторов


одержать победу может только один игрок

Назначение классов в игре Угадай число:

GuessNumber — отвечает за весь игровой процесс

Player — описывает игроков (один экземпляр класса соответствует одному игроку)

GuessNumberTest — отвечает за создание объектов, их инициализацию, запуск игры. Содержит метод main

Для завершения или продолжения работы программы Угадай число выводите сообщение:
"Хотите продолжить? [да/нет]:". Если пользователь ввел ни "да" ни "нет", а что-то другое — снова выведите сообщение `
"Хотите продолжить? [да/нет]:". (Реализуйте эту логику в Test-классах)
*/
import java.util.Random;

public class GuessNumber {
    Random random = new Random();
    private int compNumb = random.nextInt(100)+1;
    private int number;



    public boolean startGame(String name, int number) {
        boolean win = false;
        if(number == compNumb) {
            System.out.println(name + ", вы угадали, поздравляем!");
            win = true;
        } else if(number > compNumb) {
            System.out.println(name + ", введенное вами число " + number + " больше того, что загадал компьютер");
            win = false;
        } else if(number < compNumb) {
            System.out.println(name + ", введенное вами число " + number + " меньше того, что загадал компьютер");
            win = false;
        }
        return win;
    }
}