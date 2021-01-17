package com.startjava.lesson2_3_4.game;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    private Player player1;
    private Player player2;
    Random random = new Random();
    int compNumb = random.nextInt(100) + 1;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void start() {
        player1.setCount(0);
        player2.setCount(0);

        do {

            enterNumber(player1);
            if (compareNumber(player1)) { // if p1 win -> true & exit cycle
                limitAttempts(player1);
                break;
            } else {
                limitAttempts(player1);

                enterNumber(player2);
                if (compareNumber(player2)) { // if p2 win -> true & exit cycle
                    limitAttempts(player2);
                    break;
                } else {
                    if (limitAttempts(player2)) { // if attempts > 9 -> true & exit cycle
                        break;
                    }
                }
            }
        } while (true);

        System.out.println(player1.getName() + " предполагал, что компьютер загадал одно из чисел: " + player1.printArray());
        System.out.println(player2.getName() + " предполагал, что компьютер загадал одно из чисел: " + player2.printArray());

        player1.zeroingArray();
        player2.zeroingArray();
    }

    private void enterNumber(Player player) {
        Scanner scan = new Scanner(System.in);
        System.out.print(player.getName() + " введите число: ");
        if (scan.hasNextInt()) {
            player.setAttempt(scan.nextInt());
        } else {
            System.out.println("Вы ввели не число\n");
            while (!scan.hasNextInt()) {
                System.out.print(player.getName() + " введите число: ");
                scan.nextInt();
            }
        }
        scan.nextLine();
    }

    private boolean compareNumber(Player player) {
        if (player.getAttempt() == compNumb) {
            System.out.println(player.getName() + ", вы угадали, поздравляем!");
            System.out.println("Игрок " + player.getName() + " угадал число " + player.getAttempt() + " с " + (player.getCount() + 1) + " попытки");
            return true;
        } else if (player.getAttempt() > compNumb) {
            System.out.println(player.getName() + ", введенное вами число " + player.getAttempt() + " больше того, что загадал компьютер");
            return false;
        } else {
            System.out.println(player.getName() + ", введенное вами число " + player.getAttempt() + " меньше того, что загадал компьютер");
            return false;
        }
    }

    private boolean limitAttempts(Player player) {
        if (player.getCount() < 9) {
            player.setCount(player.getCount() + 1);
            return false;
        } else {
            player.setCount(player.getCount() + 1);
            System.out.println("У " + player.getName() + " закончились попытки.");
            return true;
        }
    }
}