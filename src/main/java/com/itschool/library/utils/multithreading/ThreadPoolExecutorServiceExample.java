package com.itschool.library.utils.multithreading;

import org.apache.tomcat.util.threads.ThreadPoolExecutor;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

public class ThreadPoolExecutorServiceExample {

    public static void main(String[] args) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(
                2, // core pool size;
                4, //max pool size;
                60, //keep alive;
                TimeUnit.SECONDS,
                new LinkedBlockingQueue<>()
        );

        Runnable task1 = () -> System.out.println("Task1 in a custom thread pool");
        Runnable task2 = () -> System.out.println("Task2 in a custom thread pool");

        threadPoolExecutor.execute(task1);
        threadPoolExecutor.execute(task2);
        threadPoolExecutor.shutdown();
    }
}