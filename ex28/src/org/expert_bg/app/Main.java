package org.expert_bg.app;

public class Main {
    
    public static void main(String[] args) throws InterruptedException {
        Message message = new Message();
        Caller  c1      = new Caller(message, "First");
        Caller  c2      = new Caller(message, "Second");
        Caller  c3      = new Caller(message, "Third");
        
        c1.getCurrentThread().join();
        c2.getCurrentThread().join();
        c3.getCurrentThread().join();
        
        System.out.println("end of main thread");
        
    }
        
}

class Message {
    public void show(String message){
        System.out.print("[" + message);
        try{
            Thread.sleep(5);
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("]");
    }
    
}

class Caller implements Runnable {
    private Thread  thread;
    private Message message;
    private String  text;
    
    public Caller(Message message, String text){
        super();
        
        this.message = message;
        this.text    = text;
        
        thread = new Thread(this);
        thread.start();
    }
    
    @Override
    public void run(){
        for(int i = 0 ; i < 2;i++){
            System.out.println("async 1=>("+ text+") i=" +i);
            try{
                Thread.sleep(100);
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
        }
        synchronized(message){
            message.show(text);//sync
        }
        
        for(int i = 0 ; i < 4;i++){
            System.out.println("async 2=>("+ text+") i=" +i);
            try{
                Thread.sleep(200);
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