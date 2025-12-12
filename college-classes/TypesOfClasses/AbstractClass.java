abstract class Parent{
    abstract void show(); //abstract method(no body)|| at least one abstract method makes the class abstract
    void display(){
        System.out.println("This is a concrete method in abstract class.");
    }
}

final class Child extends Parent{ //final class cannot be inherited
    void show(){
        System.out.println("This is an abstract class example.");
    }
}

public class AbstractClass {
    public static void main(String[] args) {
        Parent obj = new Child(); //Parent class reference and child class object
        Child obj1 = new Child(); //Child class reference and child class object
//        Child obj2 = new Parent(); //This will give error because abstract class cannot be instantiated
//        Parent obj2 = new Parent(); //This will give error because abstract class cannot be instantiated
        obj.show();
        obj.display();
    }
}
