// This file is part of the Data Structures project.
import java.util.*;
public class MyArrays {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] array = new int[n];
        System.out.println("Enter "+n+" elements : ");
        for(int i = 0; i < n; i++)
            array[i] = sc.nextInt();
        //display the elements of the array
        System.out.println("Elements of the array are: ");

        for(int element : array){
            System.out.println(element +"\t");
        }
        sc.close(); // Closing the scanner to prevent resource leaks
    }
}
