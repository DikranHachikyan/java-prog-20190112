package org.expert_bg.app;
 
import draw.Point;

public class Main {

    public static void main(String[] args) {
        Point p1 = new Point(10,20);
        Point p2 = new Point(14,24);
        
        if( !p1.equals(p2)){
            System.out.println(p1 + "<>" + p2);
        }
       
    }
    
}

