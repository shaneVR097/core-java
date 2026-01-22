package ExceptionHandling;

public class ExceptionHandlingCncpt  {
    public void arithexcptn(int a,int b) {
        try {
            System.out.println(a/b);    
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic exception: / by 0 !!");
        }
    }
    public void stringidxoutofboundexcptn(String s) {
        try {
            System.out.println(s.charAt(5));
        } catch (StringIndexOutOfBoundsException e2) {
            System.out.println("String Index Out Of Bounds Exception !!");
        }
    }
    public void arrayidxoutofboundexcptn(int[] arr) {
        try {
            System.out.println(arr[4]);
        } catch (ArrayIndexOutOfBoundsException e3) {
            System.out.println("Array Index Out Of Bounds Exception !!");
        }
    }
    public void nullptrexcptn(String s) {
        try {
            System.out.println(s.toLowerCase());
        } catch (NullPointerException e3) {
            System.out.println("Null pointer Exception !!");
        }
    }
    
    public void clscstexcptn(ExceptionHandlingCncpt e) {
        try {
            // Attempt to cast to ChildExcptnClss2
            ChildExcptnClss2 c2 = (ChildExcptnClss2) e;
            System.out.println("Cast successful: " + c2.getClass().getSimpleName());
        } catch (ClassCastException ex) {
            System.out.println("ClassCastException occurred!");
            System.out.println("Cannot cast " + e.getClass().getSimpleName() + " to ChildExcptnClss2");
        }
    }
    
    public static void main(String[] args) {
        int a=9,b=0;
        String s="abc";
        int[] arr= {1,2,3};
        
        ExceptionHandlingCncpt ex=new ExceptionHandlingCncpt();
        ex.arithexcptn(a, b);
        ex.arrayidxoutofboundexcptn(arr);
        ex.stringidxoutofboundexcptn(s);
        s=null;
        ex.nullptrexcptn(s);
        
        ChildExcptnClss1 c1=new ChildExcptnClss1();
        ChildExcptnClss2 c2=new ChildExcptnClss2();
        
        // Test 1: Valid cast (should succeed)
        System.out.println("\nTest 1 - Valid cast:");
        ExceptionHandlingCncpt ex2 = c2;  // Upcasting
        ex.clscstexcptn(ex2);  // Should succeed
        
        // Test 2: Invalid cast (should throw ClassCastException)
        System.out.println("\nTest 2 - Invalid cast:");
        ExceptionHandlingCncpt ex1 = c1;  // Upcasting ChildExcptnClss1
        ex.clscstexcptn(ex1);  // Should fail - cannot cast ChildExcptnClss1 to ChildExcptnClss2
    }
}

class ChildExcptnClss1 extends ExceptionHandlingCncpt{
    
}

class ChildExcptnClss2 extends ExceptionHandlingCncpt{
    
}