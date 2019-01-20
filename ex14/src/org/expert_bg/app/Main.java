package org.expert_bg.app;
 

import java.io.IOException;
import text.ReadText;



public class Main {
    public  final int PORT;
    public  final String HOST;
    
    public Main(int port,String host){
        PORT = port;
        HOST = host;
    }
    
    public void show(){
        System.out.println("Port:" + PORT + " Host:" + HOST);
    }
    
    public static void main(String[] args) {
       
        (new Main(1400,"web-dev.com")).show();
    }
    
}

