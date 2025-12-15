class Parent{
    void display(){
        System.out.println("Inside Parent class's display method");
    }
}

class Child extends Parent{
    @Override
    void display(){
        System.out.println("Inside Child class's display method");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        Parent p = new Parent();
        p.display(); // Calls Parent's display method

        Child c = new Child();
        c.display(); // Calls Child's overridden display method

        Parent pc = new Child();
        pc.display(); // Calls Child's overridden display method due to runtime polymorphism

        Child cp = (Child) new Parent(); // This will compile but throw ClassCastException at runtime
        cp.display(); // This line will not be reached due to the exception
    }
    
}
