package org.expert_bg.app;
 
public class Main {
    
    public Main(){
        System.out.println("Contructor Main");
    }
    
    public static void main(String[] args) {
       new Main();
       System.out.println("main method");
    }
    
    static {
        System.out.println("Static Section");
    }
}
