package code;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Author biubiu
 * @Date 2021/9/15 22:42
 */
public class Test {
    public static void main(String[] args) {
        Lock lock =new ReentrantLock();
        Condition condition1 = lock.newCondition();
        Condition condition2 = lock.newCondition();
        Condition condition3 = lock.newCondition();
        AtomicInteger flag= new AtomicInteger(1);
        Thread thread1 =new Thread(()->{
            lock.lock();
            try{
                if(flag.get() != 1){
                    condition1.await();
                }
                for(int i=1;i<3;i++){
                    System.out.println("AAA");
                    flag.set(2);
                    condition2.signal();
                    condition1.await();
                }


            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }

        });
        Thread thread2 =new Thread(()->{
            lock.lock();
            try{
                if(flag.get() != 2){
                    condition2.await();
                }
                for(int i=1;i<3;i++){
                    System.out.println("BBB");
                    flag.set(3);
                    condition3.signal();
                    condition2.await();
                }


            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }

        });
        Thread thread3 =new Thread(()->{
            lock.lock();
            try{
                if(flag.get() != 3){
                    condition3.await();
                }
                for(int i=1;i<3;i++){
                    System.out.println("CCC");
                    flag.set(1);
                    condition1.signal();
                    condition3.await();
                }


            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }

        });
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
