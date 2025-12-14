public class TryCatchDemo {
    public static void handleException() throws Exception{
        throw new Exception("Exception Raised from handleException method");
    }
    public static void main(String[] args){
        System.out.print("Start");
        try {
            System.out.println("Inside Try Block");
            throw new Exception("Exception Raised");
        } catch (Exception e) {
            System.out.println("Inside Catch Block|| Caught an exception");
            System.out.println("Exception Message: "+ e.getMessage());
        }
        System.out.print("End of one try-catch demo");
        try {
            System.out.println("Inside second try block");
            handleException();
        } catch (Exception e) {
            System.out.println("Inside second catch block|| Caught an exception from handleException method");
            System.out.println("Exception message: "+ e.getMessage());
        }
        System.out.print("End of program");
    }
    
}
