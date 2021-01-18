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
            if (makeMove(player1)) {
                if (makeMove(player2)) {
                } else {
                    break;
                }
            } else {
                break;
            }
        } while (player2.getCount() != 10);

        System.out.println(player1.getName() + " предполагал, что компьютер загадал одно из чисел: " + printAttempts(player1));
        System.out.println(player2.getName() + " предполагал, что компьютер загадал одно из чисел: " + printAttempts(player2));

        player1.zeroing();
        player2.zeroing();
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
        if (player.getAttempt() == compNumb) {
            System.out.println(player.getName() + ", вы угадали, поздравляем!");
            System.out.println("Игрок " + player.getName() + " угадал число " + player.getAttempt() + " с " + (player.getCount() + 1) + " попытки");
            return true;
        } else {
            System.out.println(player.getName() + ", введенное вами число " + player.getAttempt() + moreLess(player) + "того, что загадал компьютер");
            return false;
        }
    }

    private String moreLess(Player player) {
        String moreLess = null;
        if (player.getAttempt() > compNumb) {
            moreLess = " больше ";
        } else if (player.getAttempt() < compNumb) {
            moreLess = " меньше ";
        }
        return moreLess;
    }

    private boolean makeMove(Player player) {
        enterNumber(player);
        if (compareNumber(player)) { //if win -> true
            player.setCount(player.getCount() + 1);
            return false;
        } else {                    //if not win -> continue
            player.setCount(player.getCount() + 1);
            if (player.getCount() == 10) {
                System.out.println("У " + player.getName() + " закончились попытки.");
            }
            return true;
        }
    }

    private String printAttempts(Player player) {
        String s = "[ ";
        for (int i = 0; i <= player.getCount() - 1; i++) {
            s = s + player.getAttempt(i) + " ";
        }
        return s + "]";
    }
}