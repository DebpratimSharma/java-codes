import java.util.*; // Importing the java.util package for utility classes like Scanner

public class Complement { // Declaring the class complement
    public static void main(String[] args ){ // Main method
        Scanner in= new Scanner(System.in); // Creating a Scanner object to read input from the console
        System.out.println("Enter a number "); // Prompting the user to enter a number
        int a= in.nextInt(); // Reading the entered number as an integer
        a=~a; // Calculating the bitwise complement of the entered number
        System.out.println("The complement of the number is "+a);// Printing the complement of the entered number
        in.close(); //closing the object in.
        
    }
}
