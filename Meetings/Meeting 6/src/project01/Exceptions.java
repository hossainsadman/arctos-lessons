package project01;

public class Exceptions {

    public static int divide(int a, int b) throws Exception{
        if(b == 0) {
            throw new RuntimeException("Cannot divide by 0");
        }
        if(a < 0) {
            throw new IllegalArgumentException("Invalid argument");
        }
        return a / b;
    }

    public static void foo() throws Exception {
        divide(0, 0);
    }

    public static void main(String[] args) throws Exception {
        // System.out.println(divide(7, 0));
        // foo();
        // System.out.println("This will not run.");

        /*
            If no error comes up in catch block, control flow
            of program will simply cotninue to after the catch block
        */

        try {
            divide(-7, 0);
        }
        catch(IllegalArgumentException e) {
            System.out.println("Illegal argument");
        }
        catch(RuntimeException e) {
            System.out.println("Error occured.");
            System.out.println(e.getMessage());

            /*
                B/c there is no try-catch block for the code below,
                the error does not get caught and crashes the program
            */
            divide(0, 0);
        }

        /*
            finally will always run regardless of whether or not the
            exception is caught or not; will also still run if an exception
            is raised or not; you can put finally as long as there is a try 
            block even if there is no catch block; useful for always 
            stopping resource leaks             
        */
        finally {
            System.out.println("Finally");
        }
        System.out.println("Program still running.");

        /*
            2 TYPES OF EXCEPTIONS (either-or):
            Checked: must be caught or thrown in function; use if catastrophic
            problems will occur if unwrapped in try-catch block
                e.g. IOException
            Unchecked: even if there is a possibility of error, the error
            itself does not need to be checked; used for something less common
                e.g. IllegalArgumentException
                     NullPointerException
                     ArrayIndexOutOfBoundsException

            All exceptions inherit from a base class; b/c all exceptions are classes,
            they inherit from java.lang.Object; anything that can be thrown inherits from
            java.lang.Throwable; 
                java.lang.Error: includes all unchecked errors; bc you would never try to 
                catch and error, errors are unchecked
                java.lang.Exception: includes all exceptions (checked & unchecked)
                    java.lang.RuntimeException: includes all unchecked exceptions
        */

        /*
            NullPointerException below should not be caught but should be dealt with using
            if statement that checks whether object is null & then does something 
        */
        // Object o = null;
        // o.toString();

        
    }
}