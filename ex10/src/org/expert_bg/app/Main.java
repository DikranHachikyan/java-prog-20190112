package org.expert_bg.app;
 
import java.io.IOException;
import text.ReadText;

public class Main {

    public static void main(String[] args) {
       ReadText rt = new ReadText();
       String s = "";
       
       try{
        System.out.print("Input Text:");
        s = rt.get();   
       }
       catch(IOException e){
           e.printStackTrace();
       }
       System.out.println("Output Text:" + s);
    }
    
}

