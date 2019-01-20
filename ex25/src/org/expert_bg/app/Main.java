package org.expert_bg.app;


public class Main {
    
    public static void main(String[] args) throws InterruptedException {
        Thread t = Thread.currentThread();
        
        System.out.println("Main Thread:" + t);
        t.setPriority( Thread.MIN_PRIORITY);
        t.setName("My Thread");
        System.out.println("Main Thread:" + t);
        
        for(int i = 0; i < 10; i++){
            System.out.println("i=" + i);
            Thread.sleep(1000);
        }
    }
        
}

