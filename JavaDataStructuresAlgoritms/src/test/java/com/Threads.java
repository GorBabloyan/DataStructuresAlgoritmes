package com;

import org.testng.annotations.Test;

public class Threads {


    volatile int a = 0;
//    synchronized int b = 0;

    @Test
    public void testThreadRunnable() {
        Runnable task1 = () -> {
            System.out.println("task1");
        };
        Runnable task2 = () -> {
            System.out.println("task2");
        };
        Runnable task3 = () -> {
            System.out.println("task3");
        };
        Runnable task4 = () -> {
            System.out.println("task4");
        };
        Runnable task5 = () -> {
            System.out.println("task5");
        };
        Runnable task6 = () -> {
            System.out.println("task6");
        };
        Runnable task7 = () -> {
            System.out.println("task7");
        };
        Runnable task8 = () -> {
            System.out.println("task8");
        };

        Thread tr1 = new Thread(task1);
        Thread tr2 = new Thread(task2);
        Thread tr3 = new Thread(task3);
        Thread tr4 = new Thread(task4);
        Thread tr5 = new Thread(task5);
        Thread tr6 = new Thread(task6);
        Thread tr7 = new Thread(task7);
        Thread tr8 = new Thread(task8);

        tr1.start();
        tr2.start();
        tr3.start();
        tr4.start();
        tr5.start();
        tr6.start();
        tr7.start();
        tr8.start();
    }


}
