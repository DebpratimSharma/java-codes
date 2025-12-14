public class UncheckedExceptions {
    public static void main(String[] args) {
        String str = "null";    //try by removing the quotations once to see the exception
        //System.out.println(str.length()); // This will throw NullPointerException directly
        try {   // Handling Unchecked Exception
            System.out.println(str.length());
        } catch (NullPointerException e) {
            System.out.println("Caught a NullPointerException: " + e.getMessage());
            System.out.println("Please ensure the string is not null before accessing its length.");
        }
    }
    
}
