package org.expert_bg.app;
 
//import java.awt.Point;//няма конфликт с draw.Point

public class Main {

    public static void main(String[] args) {
        draw.Point p; //Указател към Point (не е обект)
        
        p = new draw.Point(10,20);
        
        p.draw();
    }
    
}

