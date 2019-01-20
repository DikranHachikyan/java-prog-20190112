package org.expert_bg.app;
 
public class Main {
 
    public static void main(String[] args) throws Exception{
       Person p1 = new Person("Anna", 25);
       
       p1.show();
       
       //Person p2 = new Person("Maria", 30);
     
    }
    
}

class Person{
    public String firstName;
    public int age;
    private static int refCount = 0;
    
    public Person(String firstName, int age) throws Exception{
        if( (Person.refCount+ 1) >1 ) throw new Exception("Person Is Singleton");
        Person.refCount++;
        this.firstName = firstName;
        this.age = age;
    }
    
    public void show(){
        System.out.println("Show Person:" + this.firstName + " age:" + this.age);
    }
}
