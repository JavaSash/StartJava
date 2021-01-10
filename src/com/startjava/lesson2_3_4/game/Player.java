package com.startjava.lesson2_3_4.game;

import java.util.Arrays;

public class Player {
    private String name;
    private int count;
    private int[] attempts = new int[10];
    int[] realAttempts;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAttempt() {
        return attempts[count];
    }

    public void setAttempt(int number) {
        attempts[count] = number;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int[] getRealAttempts() {
        int dimension = 0;
        for (count = 0; count < attempts.length; count++) {
            if (attempts[count] == 0) {
                dimension = count;
                break;
            } else {
                dimension = attempts.length;
            }
        }
        realAttempts = Arrays.copyOfRange(attempts, 0, dimension);
        return realAttempts;
    }

    public void zeroingArray() {
        Arrays.fill(realAttempts, 0);
        attempts = Arrays.copyOf(realAttempts, 10);
    }
}