package org.expert_bg.app;
 
import text.ReadText;

public class Main {

    public static void main(String[] args) {
       ReadText rt = new ReadText();
       String s;
       
       System.out.print("Input Text:");
       s = rt.get();
       
       System.out.println("Output Text:" + s);
    }
    
}

