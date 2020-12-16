package com.startjava.Lesson1.MyFirstGame;

public class MyFirstGame {
    public static void main(String[] args) {
        int compNumb = 57;
        int number = 52;
        do {
            if(number > compNumb) {
                System.out.println("Введенное вами число " + number + " больше того, что загадал компьютер");
                number--;
            } else if(number < compNumb) {
                System.out.println("Введенное вами число " + number + " меньше того, что загадал компьютер");
                number++;
            }
        } while(number != compNumb);
        System.out.println("Вы угадали! компьютер загадал число " + number);
    }
}