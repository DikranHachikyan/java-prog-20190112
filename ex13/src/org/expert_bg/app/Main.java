package org.expert_bg.app;
 

import java.io.IOException;
import text.ReadText;



public class Main {

    public static void main(String[] args) {
       String s = "";
       try(ReadText rt = new ReadText()){
            while(!(s = rt.get()).equals("quit")){
                System.out.println("Text:" + s);
            }
       }
       catch(Exception e){
           e.printStackTrace();
       }
       
    }
    
}

