package com.startjava.lesson2_3_4.game;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    private Player player1;
    private Player player2;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void start() {
        Random random = new Random();
        int compNumb = random.nextInt(100) + 1;
        player1.setCount(0);
        player2.setCount(0);
        boolean cycleCheck = true;

        do {
            enterNumber(player1);
            if (player1.getAttempts(player1.getCount() - 1) == compNumb) {
                System.out.println(player1.getName() + ", вы угадали, поздравляем!");
                System.out.println("Игрок " + player1.getName() + " угадал число " + player1.getAttempts(player1.getCount() - 1) + " с " + (player1.getCount()) + " попытки");
                break;
            } else if (player1.getAttempts(player1.getCount() - 1) > compNumb) {
                System.out.println(player1.getName() + ", введенное вами число " + player1.getAttempts(player1.getCount() - 1) + " больше того, что загадал компьютер");
                if (player1.getCount() >= 10) {
                    System.out.println("У " + player1.getName() + " закончились попытки.");
                    cycleCheck = false;
                }
            } else if (player1.getAttempts(player1.getCount() - 1) < compNumb) {
                System.out.println(player1.getName() + ", введенное вами число " + player1.getAttempts(player1.getCount() - 1) + " меньше того, что загадал компьютер");
                if (player1.getCount() >= 10) {
                    System.out.println("У " + player1.getName() + " закончились попытки.");
                    cycleCheck = false;
                }
            }

            enterNumber(player2);
            if (player2.getAttempts(player2.getCount() - 1) == compNumb) {
                System.out.println(player2.getName() + ", вы угадали, поздравляем!");
                System.out.println("Игрок " + player2.getName() + " угадал число " + player2.getAttempts(player2.getCount() - 1) + " с " + (player2.getCount()) + " попытки");
                break;
            } else if (player2.getAttempts(player2.getCount() - 1) > compNumb) {
                System.out.println(player2.getName() + ", введенное вами число " + player2.getAttempts(player2.getCount() - 1) + " больше того, что загадал компьютер");
                if (player2.getCount() >= 10) {
                    System.out.println("У " + player2.getName() + " закончились попытки.");
                    cycleCheck = false;
                }
            } else if (player2.getAttempts(player2.getCount() - 1) < compNumb) {
                System.out.println(player2.getName() + ", введенное вами число " + player2.getAttempts(player2.getCount() - 1) + " меньше того, что загадал компьютер");
                if (player2.getCount() >= 10) {
                    System.out.println("У " + player2.getName() + " закончились попытки.\n");
                    cycleCheck = false;
                }
            }

        } while (cycleCheck);

        System.out.println(player1.getName() + " предполагал, что компьютер загадал одно из чисел: " + player1.printArray());
        System.out.println(player2.getName() + " предполагал, что компьютер загадал одно из чисел: " + player2.printArray());

        player1.nullArray();
        player2.nullArray();
    }

    private void enterNumber(Player player) {
        Scanner scan = new Scanner(System.in);
        boolean checkInt;
        do {
            System.out.print(player.getName() + " введите число: ");
            checkInt = scan.hasNextInt();
            if (checkInt) {
                player.setAttempts(player.getCount(), scan.nextInt());
                player.setCount(player.getCount() + 1);
            } else {
                System.out.println("Вы ввели не число\n");
            }
            scan.nextLine();
        } while (!checkInt);
    }
}