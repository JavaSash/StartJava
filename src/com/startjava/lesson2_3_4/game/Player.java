package com.startjava.lesson2_3_4.game;

import java.util.Arrays;

public class Player {
    private String name;
    private int count;
    private int[] attempts = new int[10];

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAttempt() {
        return attempts[count - 1];
    }

    public int[] getAttempts() {
        return Arrays.copyOf(attempts, count);
    }

    public void setAttempt(int number) {
        attempts[count] = number;
        count++;
    }

    public int getCount() {
        return count;
    }
}