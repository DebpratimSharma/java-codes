import java.io.*; // Importing the java.io package for input-output operations

public class Bufferdata { // Declaring the class bufferdata
    public static void main(String[] args ) throws IOException{ // Main method which throws IOException
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // Creating a BufferedReader object to read input from the console
        System.out.println("Enter roll "); // Prompting the user to enter roll number
        int roll = Integer.parseInt(br.readLine()); // Reading the roll number as a string and converting it to an integer
        System.out.println("Enter name "); // Prompting the user to enter name
        String name = br.readLine(); // Reading the name as a string
        System.out.println("Name is : "+name); // Printing the entered name
        System.out.println("Roll is : "+roll); // Printing the entered roll number
    }
}
