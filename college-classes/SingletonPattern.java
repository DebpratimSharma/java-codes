
class Singleton{
    private static Singleton instance; // static variable to hold single instance
    private Singleton(){ // private constructor
        System.out.println("Private constructor called");
    }

    public static Singleton getInstance(){ // static method to get the instance
        if(instance == null){
            instance = new Singleton();

        }
        return instance;
    }

    public void show(){
        System.out.println("Hello from Singleton insance");
    }
}

public class SingletonPattern {
    public static void main(String[] args){
//        Singleton obj = new Singleton(); // This line will cause a compile-time error
        
        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();

        obj1.show();

        if(obj1 == obj2){
            System.out.println("Both references point to the same instance.");
        } else {
            System.out.println("Different instances exist.");
        }

    }
}
