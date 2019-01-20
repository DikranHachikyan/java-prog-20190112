package org.expert_bg.app;

public class Main {
    
    public static void main(String[] args) throws InterruptedException {
        InheritsThread it = new InheritsThread();
        ImplRunnable   ir = new ImplRunnable();
        Thread.sleep(100);//не е решение на проблема със синхронизацията
        it.join();
        ir.getCurrentThread().join();
        System.out.println("end of main thread");
        
    }
        
}
class ImplRunnable implements Runnable {
    private Thread thread;
    public ImplRunnable(){
        super();
        thread = new Thread(this);
        thread.start();
    }
    
    @Override
    public void run(){
        for(int i = 0; i < 5 ; i++ ){
            System.out.println("[R] child thread: i=" + i);
            try{
                Thread.sleep(1000);
            }
            catch( InterruptedException ex){
                ex.printStackTrace();
            }
        }//for
        System.out.println("[R] end of child thread");
    }
    
    public Thread getCurrentThread(){
        return thread;
    }
} 
class InheritsThread extends Thread{
    public InheritsThread(){
        super();
        start();
    }
    
    @Override
    public void run(){
        for( int i=0; i < 5; i++ ){
            System.out.println("[T] child thread: i=" + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }//for
        System.out.println("[T] end of child thread");
    }
}