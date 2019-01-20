package org.expert_bg.app;
 

import java.io.IOException;
import text.ReadText;



public class Main {
 
    public static void main(String[] args) {
       Employee p = new Employee();
       
       p.showEmployee();
     
    }
    
}

class Person{
    public final void show(){
        System.out.println("Show Person");
    }
}

class Employee extends Person{
//    Error:
//    @Override 
//    public final void show(){
//     
//    }
    public void showEmployee(){
        super.show();
        System.out.println("Show Employee");
    }
}