package org.expert_bg.app;
 
public class Main {
 
    public static void main(String[] args) {
       Person.firstName = "Anna";
       System.out.println("Name:" + Person.firstName);
       
       Person p = new Person();
       p.age = 25;
       System.out.println("Name:" + p.firstName + " age:" + p.age);
       
       p.firstName = "Maria";
       System.out.println("Name:" + Person.firstName);
        
     
    }
    
}

class Person{
    public static String firstName;
    public int age;
    
    public void show(){
        System.out.println("Show Person");
    }
}
