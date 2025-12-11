import java.util.*;
class Student{
    String name;

    //copy constructor 
    Student(Student s){
        this.name = s.name;
    }

    //normal constructor
    Student(String name){
        this.name = name;
    }

    void display(){
        System.out.println("Name: " + name);
    }
}

public class CopyCons {
    public static void main(String[] args){
        Student obj1 = new Student("Alice");
        Student obj2 = new Student(obj1); // calling copy constructor

        obj1.display();
        obj2.display();

        Student obj3 = obj2;
        obj3.name = "Bob";
        obj2.display(); // will reflect the change made through obj3
        obj3.display();

        System.out.println("Let's change the value inside obj2");
        obj2.name = "Charlie";
        obj1.display();
        obj2.display();
        obj3.display(); // will reflect the change made through obj2

    }    
}
