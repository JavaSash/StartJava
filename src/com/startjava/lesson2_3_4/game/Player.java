package com.startjava.lesson2_3_4.game;

import java.util.Arrays;

public class Player {
    private String name;
    private int number;
    private int count;
    private int[] attempts = new int[10];

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAttempts(int count) {
        return attempts[count];
    }

    public void setAttempts(int count, int number) {
        this.attempts[count] = number;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String printArray() {
        int dimension = 0;
        for (count = 0; count < attempts.length; count++) {
            if (attempts[count] == 0) {
                dimension = count;
                break;
            } else {
                dimension = attempts.length;
            }
        }
        int[] realAttempts = Arrays.copyOfRange(attempts, 0, dimension);
        String print = Arrays.toString(realAttempts);
        return print;
    }

    public void nullArray() {
        Arrays.fill(attempts, 0);
    }
}