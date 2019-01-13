package org.expert_bg.app;
 
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

    public static void main(String[] args) {
       String s = "";
       try(BufferedReader bf = new BufferedReader(
                    new InputStreamReader(
                            System.in
                    ))){
            
        while( !(s = bf.readLine()).equals("quit") ){
            System.out.println("line:" + s);
        }
        
       }
       catch(IOException e){
           e.printStackTrace();
       }
       
    }
    
}

