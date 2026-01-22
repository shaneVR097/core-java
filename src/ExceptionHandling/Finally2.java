package ExceptionHandling;

import java.io.IOException;

public class Finally2 {
    // Method for Scenario 5
    public static String testReturnFinally() {
        try {
            System.out.println("In try block - returning 'from try'");
            return "from try";
        } catch(Exception e) {
            System.out.println("In catch block");
            return "from catch";
        } finally {
            System.out.println("Finally block executes before return!");
            // Note: If we uncomment the line below, it will override the return value
            // return "from finally";
        }
    }
    
    // Method for Scenario 6
    public static void testExitFinally() {
        try {
            System.out.println("In try block - calling System.exit(0)");
            // Uncomment to see that finally won't execute
            // System.exit(0);
        } catch(Exception e) {
            System.out.println("In catch block");
        } finally {
            System.out.println("Finally won't execute if System.exit() is called in try!");
        }
    }
    
    // Method for Scenario 7
    public static void testNestedFinally() {
        try {
            System.out.println("Outer try block");
            try {
                System.out.println("Inner try block");
                int[] arr = new int[3];
                System.out.println(arr[5]); // ArrayIndexOutOfBoundsException
            } catch(ArithmeticException e) {
                System.out.println("Inner catch - wrong exception type");
            } finally {
                System.out.println("Inner finally block executes!");
            }
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Outer catch caught the exception!");
        } finally {
            System.out.println("Outer finally block executes!");
        }
    }
    
    // Method for Scenario 8
    public static void testFinallyWithBreak() {
        for(int i = 1; i <= 3; i++) {
            try {
                System.out.println("Iteration " + i);
                if(i == 2) {
                    System.out.println("Breaking at iteration " + i);
                    break;
                }
            } finally {
                System.out.println("Finally executes even with break in iteration " + i);
            }
        }
    }
    
    // Method for Scenario 9
    public static void testFinallyWithContinue() {
        for(int i = 1; i <= 3; i++) {
            try {
                System.out.println("Iteration " + i + " - try block start");
                if(i == 2) {
                    System.out.println("Continuing at iteration " + i);
                    continue;
                }
                System.out.println("Iteration " + i + " - try block end");
            } finally {
                System.out.println("Finally executes even with continue in iteration " + i);
            }
        }
    }
    
    // Method for Scenario 10
    public static void testExceptionInFinally() {
        try {
            try {
                System.out.println("In inner try block");
                int result = 10 / 2;
                System.out.println("Result: " + result);
            } finally {
                System.out.println("In inner finally - throwing exception");
                throw new RuntimeException("Exception from finally block!");
            }
        } catch(RuntimeException e) {
            System.out.println("Caught exception: " + e.getMessage());
        }
    }
    
    // Additional scenario: Resources cleanup with finally
    public static void testResourceCleanup() {
        System.out.println("\n=== Resource Cleanup Example ===");
        java.io.FileReader reader = null;
        try {
            reader = new java.io.FileReader("test.txt");
            System.out.println("Reading file...");
            // Simulate file reading
            throw new IOException("Simulated IO error");
        } catch(java.io.IOException e) {
            System.out.println("IOException: " + e.getMessage());
        } finally {
            // Always close resources in finally block
            if(reader != null) {
                try {
                    reader.close();
                    System.out.println("FileReader closed successfully");
                } catch(java.io.IOException e) {
                    System.out.println("Error closing file: " + e.getMessage());
                }
            }
        }
    }
    
    // Additional scenario: try-with-resources (Java 7+)
    public static void testTryWithResources() {
        System.out.println("\n=== Try-with-Resources Example ===");
        try(java.io.FileReader reader = new java.io.FileReader("test.txt")) {
            System.out.println("Reading file with try-with-resources...");
            // Resources automatically closed
        } catch(java.io.IOException e) {
            System.out.println("IOException: " + e.getMessage());
        }
    }
    
    // Additional scenario: Multiple catch blocks with finally
    public static void testMultipleCatchFinally() {
        System.out.println("\n=== Multiple Catch with Finally ===");
        try {
            String str = null;
            System.out.println(str.length());
        } catch(ArithmeticException e) {
            System.out.println("ArithmeticException caught");
        } catch(NullPointerException e) {
            System.out.println("NullPointerException caught");
        } catch(Exception e) {
            System.out.println("Generic Exception caught");
        } finally {
            System.out.println("Finally block after multiple catch blocks");
        }
    }
    
    public static void main(String[] args) {
        // Scenario 1: try-catch-finally with exception caught
        System.out.println("=== Scenario 1: Exception Caught ===");
        try {
            System.out.println(9/0);
        } catch(ArithmeticException e) {
            System.out.println("Arithmetic exception caught !!");
        } finally {
            System.out.println("Finally block always executes when exception is caught !!");
        }
        
        // Scenario 2: try-catch-finally without exception
        System.out.println("\n=== Scenario 2: No Exception ===");
        try {
            System.out.println("Try block executing normally");
            System.out.println(9/3);
        } catch(ArithmeticException e) {
            System.out.println("This won't execute !!");
        } finally {
            System.out.println("Finally block always executes even without exception !!");
        }
        
        // Scenario 3: try-finally without catch
        System.out.println("\n=== Scenario 3: try-finally (no catch) ===");
        try {
            System.out.println("In try block");
            int result = 10 / 2;
            System.out.println("Result: " + result);
        } finally {
            System.out.println("Finally block executes even without catch !!");
        }
        
        // Scenario 4: Exception not caught - finally still executes
        System.out.println("\n=== Scenario 4: Exception Not Caught ===");
        try {
            System.out.println(9/0);
        } catch(NullPointerException e) {
            System.out.println("This won't execute - wrong exception type !!");
        } finally {
            System.out.println("Finally block executes even when exception is not caught !!");
        }
        
        // Scenario 5: Multiple return statements with finally
        System.out.println("\n=== Scenario 5: Return in try and finally ===");
        System.out.println("Method returned: " + testReturnFinally());
        
        // Scenario 6: System.exit() in try block
        System.out.println("\n=== Scenario 6: System.exit() in try ===");
        testExitFinally();
        
        // Scenario 7: Nested try-catch-finally
        System.out.println("\n=== Scenario 7: Nested try-catch-finally ===");
        testNestedFinally();
        
        // Scenario 8: Finally with break in loop
        System.out.println("\n=== Scenario 8: Finally with break ===");
        testFinallyWithBreak();
        
        // Scenario 9: Finally with continue in loop
        System.out.println("\n=== Scenario 9: Finally with continue ===");
        testFinallyWithContinue();
        
        // Scenario 10: Exception in finally block
        System.out.println("\n=== Scenario 10: Exception in Finally ===");
        testExceptionInFinally();
    }
}