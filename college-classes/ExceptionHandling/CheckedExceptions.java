import java.io.*;

public class CheckedExceptions {
    public static void readFile(String fileName) throws IOException {
        FileReader file = new FileReader(fileName);
        BufferedReader fileInput = new BufferedReader(file);
        System.out.println(fileInput.readLine());
        fileInput.close();
    }

    public static void main(String[] args) {
        try {
            //readFile("/home/debpratim/Desktop/java-codes/README.md");    // This will work if the file exists
            readFile("nonExistent.txt");    // This will throw FileNotFoundException
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
    
}
