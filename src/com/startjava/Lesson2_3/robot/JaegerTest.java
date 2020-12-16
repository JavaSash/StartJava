package com.startjava.Lesson2_3.robot.JaegerTest;

public class JaegerTest {
    public static void main(String[] args) {
        Jaeger jaeger1 = new Jaeger("Gipsy Danger", "Mark-3", 79.25, 1.980, 7, 6);
        Jaeger jaeger2 = new Jaeger("Striker Eureka", "Mark-5", 76.2, 1.850, 10, 9);

        jaeger1.drift();
        jaeger1.move(7);
        jaeger1.scanKaiju();
        System.out.println(jaeger1);

        jaeger2.drift();
        jaeger2.move(10);
        jaeger2.attack();
        System.out.println(jaeger2);
    }
}