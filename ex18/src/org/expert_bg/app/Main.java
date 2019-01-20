package org.expert_bg.app;
 
public class Main {
    
    public Main(int a, int b, String txt){
        
    }
    public static void main(String[] args) {
       Person.show();
       Person.firstName = "Maria";
       Person.show();
       
       Person p1 = new Person();
       p1.show();
       p1.print();
       
       new Main(1,2,"Hello");
    }
    
}

class Person{
    public static String firstName = "Anna";
    public int age;
    
    public static void show(){
        System.out.println("Person:" + Person.firstName ); // + " age:" + age);
    }
    
    public void print(){
        Person.show();
    }
}
