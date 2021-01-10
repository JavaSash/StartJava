package com.startjava.lesson2_3_4.game;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    private Player player1;
    private Player player2;
    Random random = new Random();
    int compNumb = random.nextInt(100) + 1;
    boolean cycleCheck = true;
    boolean winCheck = false;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void start() {
        player1.setCount(0);
        player2.setCount(0);

        do {
            enterNumber(player1);
            equalityTest(player1);

            if(!winCheck) {
                enterNumber(player2);
                equalityTest(player2);
            }

        } while (cycleCheck);

        System.out.println(player1.getName() + " предполагал, что компьютер загадал одно из чисел: " + Arrays.toString(player1.getRealAttempts()));
        System.out.println(player2.getName() + " предполагал, что компьютер загадал одно из чисел: " + Arrays.toString(player2.getRealAttempts()));

        player1.zeroingArray();
        player2.zeroingArray();
    }

    private void enterNumber(Player player) {
        Scanner scan = new Scanner(System.in);
        boolean checkInt;
        do {
            System.out.print(player.getName() + " введите число: ");
            checkInt = scan.hasNextInt();
            if (checkInt) {
                player.setAttempt(scan.nextInt());
            } else {
                System.out.println("Вы ввели не число\n");
            }
            scan.nextLine();
        } while (!checkInt);
    }

    private boolean equalityTest(Player player) {
        if (player.getAttempt() == compNumb) {
            System.out.println(player.getName() + ", вы угадали, поздравляем!");
            System.out.println("Игрок " + player.getName() + " угадал число " + player.getAttempt() + " с " + (player.getCount()+1) + " попытки");
            cycleCheck = false;
            winCheck = true;
        } else if (player.getAttempt() > compNumb) {
            System.out.println(player.getName() + ", введенное вами число " + player.getAttempt() + " больше того, что загадал компьютер");
            if (player.getCount() >= 10) {
                System.out.println("У " + player.getName() + " закончились попытки.");
                cycleCheck = false;
            }
        } else if (player.getAttempt() < compNumb) {
            System.out.println(player.getName() + ", введенное вами число " + player.getAttempt() + " меньше того, что загадал компьютер");
            if (player.getCount() >= 10) {
                System.out.println("У " + player.getName() + " закончились попытки.");
                cycleCheck = false;
            }
        }
        player.setCount(player.getCount() + 1);
        return cycleCheck;
    }
}