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

        do {
            enterNumber(player1);
            if(player1.getNumber() == compNumb) {
                System.out.println(player1.getName() + ", вы угадали, поздравляем!");
                break;
            } else if(player1.getNumber() > compNumb) {
                System.out.println(player1.getName() + ", введенное вами число " + player1.getNumber() + " больше того, что загадал компьютер");
            } else if(player1.getNumber() < compNumb) {
                System.out.println(player1.getName() + ", введенное вами число " + player1.getNumber() + " меньше того, что загадал компьютер");
            }

            enterNumber(player2);
            if(player2.getNumber() == compNumb) {
                System.out.println(player2.getName() + ", вы угадали, поздравляем!");
                break;
            } else if(player2.getNumber() > compNumb) {
                System.out.println(player2.getName() + ", введенное вами число " + player2.getNumber() + " больше того, что загадал компьютер");
            } else if(player2.getNumber() < compNumb) {
                System.out.println(player2.getName() + ", введенное вами число " + player2.getNumber() + " меньше того, что загадал компьютер");
            }
        } while(true);
    }

    private void enterNumber(Player player) {
        Scanner scan = new Scanner(System.in);
        boolean checkInt;

        do {
            System.out.println(player.getName() + " введите число");
            checkInt = scan.hasNextInt();
            if(checkInt) {
                player.setNumber(scan.nextInt());
            } else {
                System.out.println("Вы ввели не число\n");
            }
            scan.nextLine();
        } while(!checkInt);
    }
}