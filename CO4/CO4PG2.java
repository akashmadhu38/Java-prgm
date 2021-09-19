package src.CO4;

import java.util.*;
class Hi extends Thread {
    public synchronized void run(){
        for(int i=0;i<10;i++){
            System.out.println("Hi");
            try {
                Thread.sleep(1000);
            }catch (Exception e){}
        }
    }
}
class Hello implements Runnable{
    public synchronized void run(){
        for(int i=0;i<10;i++){
            System.out.println("Hello");
            try {
                Thread.sleep(1000);
            }catch (Exception e){}
        }
    }
}
public class CO4PG1 {
    public static void main(String ...a){
        Hi t = new Hi();
        Hello r = new Hello();
        Thread t1 = new Thread(r);
        t.start();
        try {
            Thread.sleep(1000);
        }catch (Exception e){}
        t1.start();
        try {
            t.join();
            t1.join();
        }catch (Exception e){}
    }
}
