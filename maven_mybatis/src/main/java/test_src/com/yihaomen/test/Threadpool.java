package com.yihaomen.test;

/**
 * Created by Administrator on 2017/6/23.
 */
public class Threadpool extends Thread {
    public static void main(String[] args) {
        for (int i = 0; i < 1000; i++) {
            new Thread(new Pool(i)).start();
            System.out.println("创建了第" + i + "个线程");
        }
    }
}

class Pool extends Thread {
    int i;
    public Pool(int i) {
        this.i = i;
    }

    Test test = new Test();

    @Override
    public void run() {
        System.out.println("第" + i + "个线程创建完成");
        for (int x= 0; x < 100; x++) {
            test.addUser();
        }
        System.out.println("第" + i + "个线程插入完成");
    }
}