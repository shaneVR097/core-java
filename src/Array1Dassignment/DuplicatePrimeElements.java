package Array1Dassignment;

public class DuplicatePrimeElements {
    public void duplicateprimes(int[] a) {
        if (a == null || a.length == 0) {
            System.out.println("Array is null or 0 elements !!");
            return;
        }
        
        PrimeElementsArray pea = new PrimeElementsArray();
        int[] primesOnly = new int[a.length];
        int primeCount = 0;
        
        for (int i = 0; i < a.length; i++) {
            if (pea.primechk(a[i])) {
                primesOnly[primeCount] = a[i];
                primeCount++;
            }
        }
        
        if (primeCount == 0) {
            System.out.println("No prime elements in array!");
            return;
        }
        
        int[] primeArray = new int[primeCount];
        for (int i = 0; i < primeCount; i++) {
            primeArray[i] = primesOnly[i];
        }
        
        System.out.println("\n\nDuplicate prime elements: ");
        
        int mx = primeArray[0];
        for (int i = 1; i < primeCount; i++) {
            if (primeArray[i] > mx)
                mx = primeArray[i];
        }
        
        int[] freq = new int[mx + 1];
        for (int i = 0; i < primeCount; i++) {
            freq[primeArray[i]]++;
        }
        
        boolean found = false;
        for (int i = 0; i <= mx; i++) {
            if (freq[i] > 1) {
                System.out.print(i + " ");
                found = true;
            }
        }
        
        if (!found) {
            System.out.print("None");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        BasicArray ba = new BasicArray();
        DuplicatePrimeElements dpe = new DuplicatePrimeElements();
        
        int[] a = {2, 2, 3, 4, 5, 7, 5, 9};
        System.out.print("Array: ");
        ba.printarray(a);
        dpe.duplicateprimes(a);
    }
}