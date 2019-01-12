package org.expert_bg.app;

import draw.*;//всички класове от draw 
//import java.awt.Point;//също води до конфликти

public class Main {

    public static void main(String[] args) {
        Point p; //Указател към Point (не е обект)
        
        p = new Point(10,20);
        
        p.draw();
    }
    
}

