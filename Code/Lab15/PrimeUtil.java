package com.huawei.classroom.student.h15;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PrimeUtil {
	private long start;
    private long end;

    public PrimeUtil() {
        
    }

    // 判断一个数是否为质数
    private boolean isPrime(long n) {
        if (n <= 1) {
            return false;
        }
        for (long i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }


    
    public List<Long> getPrimeList(long st, long en, int threadCount) {
    	start = st;
    	end = en;
        List<Long> primes = new ArrayList<>();
        // 用一个list存放所有线程 便于后续使用
        List<Thread> threads = new ArrayList<>();
        // 创建threadCount个线程 并行计算其各自范围内的质数
        for (int i = 0; i < threadCount; i++) {
            long threadStart = start + (end - start) / threadCount * i;
            long threadEnd = start + (end - start) / threadCount * (i + 1);
            
            // 用匿名类创建线程
            Thread thread = new Thread(new Runnable() {
                @Override
                public void run() {
                    for (long j = threadStart; j < threadEnd; j++) {
                        if (isPrime(j)) {
                        	// 防止多线程不安全 需要上锁
                            synchronized (primes) {
                                primes.add(j);
                            }
                        }
                    }
                }
            });

            // 存放所有线程
            threads.add(thread);
            thread.start();
        }
        
        // 顺序等待所有线程结束
        for (Thread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
       //  将所有质数排序
        Collections.sort(primes);
        return primes;
    }
}
