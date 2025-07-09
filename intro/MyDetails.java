import java.util.*;

public class MyDetails{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        System.out.print("Enter your roll number: ");
        long rollNumber = sc.nextLong();

        //displaying the details
        System.out.println("Name: "+ name+ "\nAge: "+ age + "\nRoll Number: "+ rollNumber);
        sc.close(); // Closing the scanner to prevent resource leaks
    }
}