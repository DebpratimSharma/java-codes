public class MyMethod {
    static void display(){
        System.out.println("Hello, this is a method without parameters.");
    }
    static void display(String name){ //overloading method
        System.out.println("I am "+name);
    }

    public static void main(String[] args){
        display();
        display("Debpratim");
    }
    
}
