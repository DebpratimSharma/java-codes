public class AnonymousClass {
    public static void main(String[] args) {
        Runnable r = new Runnable() {   // Anonymous class implementing Runnable interface
            @Override   // Overriding the run method
            public void run(){
                System.out.println("This is an anonymous class example."); // Printing a message
            }
        };
        // Execute the anonymous Runnable: either call run() directly or start a Thread.
        // Here we start a new Thread so the Runnable executes and prints the message.
        new Thread(r).start();
        Runnable r2 =()->{  // Lambda expression implementing Runnable interface
            System.out.println("This is a lambda expression example.");
        };
        r2.run();
    }
}
