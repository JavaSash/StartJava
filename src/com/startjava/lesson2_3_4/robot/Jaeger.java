package com.startjava.lesson2_3_4.robot;

public class Jaeger {
    private String modelName;
    private String mark;
    private double height;
    private double weight;
    private int speed;
    private int armor;

    public Jaeger(String modelName, String mark, double height, double weight, int speed, int armor) {
        this.modelName = modelName;
        this.mark = mark;
        this.height = height;
        this.weight = weight;
        this.speed = speed;
        this. armor = armor;
    }

    boolean drift() {
        System.out.println("You are enter the drift \n");
        return true;
    }

    int move(int moveSpeed) {
        System.out.println("Jaeger " + modelName + " moves with speed " + moveSpeed + " km/h \n");
        return moveSpeed;
    }

    String scanKaiju() {
        return "nothing";
    }

    void attack() {
        System.out.println("Tra-ta-ta-ta-ta \n");
    }

    @Override
    public String toString() {
        return "\n ModelName: " + modelName + "\n Mark: " + mark + "\n Height: " + height + "metres" + "\n Weight: " + weight + " tons" + "\n Speed: " + speed + "\n Armor: " + armor + "\n";
    }
}