package org.expert_bg.app;

import draw.*;

public class Main {
    
    public static void main(String[] args) {
        show( new Point(10,20));
        
        show( new Rectangle(10,20,300,360));
        
        show( new Person());
    }
       
    private static void show(Shape s){
        s.redraw();
    }
}

class Person implements Shape{
    
    @Override public void moveTo(int dx,int dy){}
    @Override public void redraw(){
        System.out.println("Show Person");
    }
    @Override public void scale(int w,int h){}
}