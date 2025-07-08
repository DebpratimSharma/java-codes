import java.util.*;
public class Intro 
{
    public static void main(String[] args ){
        try (Scanner in = new Scanner(System.in)) {
            System.out.println("Enter your name: ");
            // String name = in.next(); <----does not allow space
            String name = in.nextLine().trim().toUpperCase(); /* allow space but cannot take input of different types siumultaneously. */
            System.out.println("My name is "+name);
        }
    }
}
