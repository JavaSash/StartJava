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
        return attempts[count];
    }

    public int getAttempt(int i) {
        return attempts[i];
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

    public void zeroing() {
        Arrays.fill(attempts, 0, count, 0);
    }
}