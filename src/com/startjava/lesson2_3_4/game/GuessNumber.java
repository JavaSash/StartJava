package com.startjava.lesson2_3_4.game;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    private Player player1;
    private Player player2;
    Random random = new Random();
    private int randomNumb = random.nextInt(100) + 1;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void start() {
        player1.setCount(0);
        player2.setCount(0);

        do {
            if (makeMove(player1)) {
                break;
            }
            if (makeMove(player2)) {
                break;
            }

        } while (true);

        printAttempts(player1);
        printAttempts(player2);

        player1.zeroing();
        player2.zeroing();
    }

    private boolean makeMove(Player player) {
        enterNumber(player);
        if (compareNumber(player)) { //if win -> true
            return true;
        }
        if (player.getCount() == 10) {
            System.out.println("У " + player.getName() + " закончились попытки.");
        }
        if (player2.getCount() == 10) {
            return true;
        }
        return false;
    }

    private void enterNumber(Player player) {
        Scanner scan = new Scanner(System.in);
        System.out.print(player.getName() + " введите число: ");
        while (!scan.hasNextInt()) {
            scan.next();
            System.out.print(player.getName() + " введите число: ");
        }
        player.setAttempt(scan.nextInt());
        player.setCount(player.getCount() + 1);
        scan.nextLine();
    }

    private boolean compareNumber(Player player) {
        if (player.getAttempt() == randomNumb) {
            System.out.println(player.getName() + ", вы угадали, поздравляем!");
            System.out.println("Игрок " + player.getName() + " угадал число " + player.getAttempt() + " с " + player.getCount() + " попытки");
            return true;
        } else {
            System.out.println(player.getName() + ", введенное вами число " + player.getAttempt() + moreLess(player) + "того, что загадал компьютер");
            return false;
        }
    }

    private String moreLess(Player player) {
        String moreLess = null;
        if (player.getAttempt() > randomNumb) {
            moreLess = " больше ";
        } else if (player.getAttempt() < randomNumb) {
            moreLess = " меньше ";
        }
        return moreLess;
    }

    private void printAttempts(Player player) {
        System.out.print(player.getName() + " предполагал, что компьютер загадал одно из чисел: [");
        for (int numb : player.getAttempts()) {
            if (numb == 0) {
                break;
            }
            System.out.print(" " + numb);
        }
        System.out.print(" ]\n");
    }
}