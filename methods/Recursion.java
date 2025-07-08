public class Recursion {
    static int sum(int n){
        if(n>0)
            return n+sum(n-1);
        else 
            return 0;
    }

    public static void main(String[] args) {
        int sumResult = sum(5);
        System.out.println("Sum of first 5 natural numbers is: " + sumResult);
        // The method sum is a recursive method that calculates the sum of the first n natural numbers
    }
}
