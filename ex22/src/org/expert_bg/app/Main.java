package org.expert_bg.app;

import draw.*;

public class Main {
    
    public static void main(String[] args) {
        Shape s = new Point(10,20);
        
        s.redraw();
        s.moveTo(100, 30);
        s.redraw();
        
        s = new Rectangle(7,5,120,350);
        s.redraw();
        s.moveTo(10, 40);
        s.redraw();
        s.scale(60, 80);
        s.redraw();
        
        
    }

}
