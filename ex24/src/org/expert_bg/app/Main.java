package org.expert_bg.app;

import draw.*;

public class Main {
    
    public static void main(String[] args) {
        Shape s = createShape(Shape.RECTANGLE);
        
        s.redraw();
    }
    
    private static Shape createShape(int type){
        switch(type){
            case 1: return new Rectangle();
        }
        
        return new Point();
    }
    
}

