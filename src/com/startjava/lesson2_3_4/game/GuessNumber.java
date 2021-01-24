package com.startjava.lesson2_3_4.game;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    private Player player1;
    private Player player2;
    Random random = new Random();
    private int randomNumber;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
        randomNumber = random.nextInt(100) + 1;
    }

    public void start() {
        do {
            if (makeMove(player1)) {
                break;
            }
            limitAttempts(player1);
            if (makeMove(player2)) {
                break;
            }
        } while (!limitAttempts(player2));

        printAttempts(player1);
        printAttempts(player2);
    }

    private boolean makeMove(Player player) {
        enterNumber(player);
        return compareNumber(player);
    }

    private void enterNumber(Player player) {
        Scanner scan = new Scanner(System.in);
        System.out.print(player.getName() + " введите число: ");
        while (!scan.hasNextInt()) {
            scan.next();
            System.out.print(player.getName() + " введите число: ");
        }
        player.setAttempt(scan.nextInt());
        scan.nextLine();
    }

    private boolean compareNumber(Player player) {
        if (player.getAttempt() == randomNumber) {
            System.out.println(player.getName() + ", вы угадали, поздравляем!");
            System.out.println("Игрок " + player.getName() + " угадал число " + player.getAttempt() + " с " + player.getCount() + " попытки");
            return true;
        } else {
            String moreLess = player.getAttempt() > randomNumber ? " больше" : " меньше";
            System.out.println(player.getName() + ", введенное вами число " + player.getAttempt() + moreLess + " того, что загадал компьютер");
            return false;
        }
    }

    private boolean limitAttempts(Player player) {
        if (player.getCount() == 10) {
            System.out.println("У " + player.getName() + " закончились попытки.");
            return true;
        }
        return false;
    }

    private void printAttempts(Player player) {
        System.out.print(player.getName() + " предполагал, что компьютер загадал одно из чисел: [");
        for (int number : player.getAttempts()) {
            System.out.print(" " + number);
        }
        System.out.print(" ]\n");
    }
}