package com.huawei.classroom.student.h15;

public class MultiThreadingDemo {
    // 共享资源
    private int count = 0;
    
    public synchronized void increment() {
        count++;
    }
    
    public static void main(String[] args) {
        // 创建线程同步的对象
        MultiThreadingDemo demo = new MultiThreadingDemo();
        
        // 创建线程
        Thread thread1 = new Thread() {
            public void run() {
                for (int i = 0; i < 100; i++) {
                    demo.increment();
                }
            }
        };
        Thread thread2 = new Thread() {
            public void run() {
                for (int i = 0; i < 100; i++) {
                    demo.increment();
                }
            }
        };
        
        // 启动线程
        thread1.start();
        thread2.start();
        
        // 等待线程结束
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        // 输出结果
        System.out.println("Count is: " + demo.count);
    } 
}