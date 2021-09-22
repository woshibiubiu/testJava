package code;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Author biubiu
 * @Date 2021/9/1 14:13
 */
public class CurrentThread {
    public static int i = 1;
    public volatile static int j = 1;
    public volatile static boolean flag = false;
    public static int count = 0;

    public static Lock lock = new ReentrantLock();
    public static Condition conditionA = lock.newCondition();
    public static Condition conditionB = lock.newCondition();

    private static CountDownLatch latch = new CountDownLatch(2);
    private static AtomicInteger numA = new AtomicInteger();
    private static AtomicInteger numB = new AtomicInteger();

    private static byte[] block = new byte[0];
    static Object o =new Object();
    public static void main(String[] args) {
        new Thread(()->{
            try {
                lock.lock();
                while (i < 10){
                    if(flag){
                        try {
                            conditionA.await();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    System.out.println(Thread.currentThread().getName()+(i++));
                    flag =true;
                    conditionB.signal();
                }
            }finally {
                lock.unlock();
            }

        },"A").start();

        new Thread(()->{
            try {
                lock.lock();
                while (i < 10){
                    if(!flag){
                        try {
                            conditionB.await();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    System.out.println(Thread.currentThread().getName()+(i++));
                    flag =false;
                    conditionA.signal();
                }
            }finally {
                lock.unlock();
            }

        },"B").start();
}
}
