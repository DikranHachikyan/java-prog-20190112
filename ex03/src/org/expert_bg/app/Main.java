package org.expert_bg.app;

import draw.Point; 
//import java.awt.Point; //това е грешка

public class Main {

    public static void main(String[] args) {
        Point p; //Указател към Point (не е обект)
        
        p = new Point(10,20);
        
        p.draw();
    }
    
}

