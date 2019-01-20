package org.expert_bg.app;

public class Main {
    
    public static void main(String[] args) throws InterruptedException {
        Q        numbers  = new Q();
        Sender   sender   = new Sender(numbers);
        Receiver receiver = new Receiver(numbers);
        
        sender.getCurrentThread().join();
        receiver.getCurrentThread().join();
        
        System.out.println("end of main thread");
        
    }
        
}


class Q {
    private int n;
    private boolean valueSet = false;
    
    public synchronized void put(int n){
        while( valueSet){
            try{
                wait();
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
        }//while
        this.n = n;
        valueSet = true;
        notify();
    }
    
    public synchronized int get(){
        while( !valueSet){
            try{
                wait();
            }
            catch( InterruptedException e){
                e.printStackTrace();
            }
            
        }//while
        valueSet = false;
        notify();
        return n;
    }
}

//=======================================
class Sender implements Runnable{
    
    private Q      numbers;
    private Thread thread;
    
    public Sender( Q numbers){
        super();
        this.numbers = numbers;
        thread = new Thread(this);
        thread.start();
    }
    
    @Override
    public void run(){
        int i = 0;
        while( i < 10 ){
            try{
                numbers.put(i);
                System.out.println("Sent i=" + i);
                Thread.sleep(1000);
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
            i++;
        }
    }
    public Thread getCurrentThread(){
        return thread;
    }
}
//=======================================
class Receiver implements Runnable{
   private Q      numbers;
   private Thread thread;
   
   public Receiver( Q numbers){
       this.numbers =  numbers;
       this.thread  =  thread;
       
       thread = new Thread(this);
       thread.start();
   }
   
   @Override
   public void run(){
       int i = 0;
       
       while(i < 9){
           try{
               i = numbers.get();
               System.out.println("Received: i=" + i);
               Thread.sleep(1000);
           }
           catch(InterruptedException e){
               e.printStackTrace();
           }
       }
   }
   
   public Thread getCurrentThread(){
       return thread;
   }
}