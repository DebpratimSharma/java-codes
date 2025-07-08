

public class MethodOverloading{
    static int sum(int a, int b){
        return a+b;

    }
    static double sum(double a, double b){
        return a+b;
    }
    
    public static void main(String[] args){
        int intSum = sum(5,7);
        double doubleSum = sum(5.5 , 7.3);
        System.out.println("Int Sum: "+ intSum);
        System.out.println("Double Sum: "+ doubleSum );
        int doubleToIntSum = (int) doubleSum; // Explicitly converting double to int
        System.out.println("Converted Double Sum to Int: " + doubleToIntSum);
        // The method sum is overloaded to handle both int and double types.
    }
}