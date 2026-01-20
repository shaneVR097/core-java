package Array1Dassignment;

public class PairSum {
    public static void findPairsWithSum(int[] arr, int target) {
        if (arr == null || arr.length < 2) {
            System.out.println("Array doesn't have enough elements!");
            return;
        }
        
        System.out.println("Pairs with sum " + target + ":");
        boolean found = false;
        
        for(int i = 0; i < arr.length; i++) {
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[i] + arr[j] == target) {
                    System.out.println("(" + arr[i] + ", " + arr[j] + ")");
                    found = true;
                }
            }
        }
        
        if(!found) {
            System.out.println("No pairs found!");
        }
    }
    
    // Using frequency array approach (more efficient for positive integers)
    public static void findPairsWithSumFreq(int[] arr, int target) {
        if (arr == null || arr.length < 2) {
            System.out.println("Array doesn't have enough elements!");
            return;
        }
        
        // Find max value
        int max = arr[0];
        for(int num : arr) {
            if(num > max) max = num;
        }
        
        if(target > 2 * max) {
            System.out.println("Target too large, no pairs possible!");
            return;
        }
        
        int[] freq = new int[max + 1];
        for(int num : arr) {
            freq[num]++;
        }
        
        System.out.println("Pairs with sum " + target + " (frequency method):");
        boolean found = false;
        
        for(int i = 0; i < freq.length; i++) {
            if(freq[i] > 0) {
                int complement = target - i;
                if(complement >= 0 && complement < freq.length && freq[complement] > 0) {
                    // Handle same element pairs (i == complement)
                    if(i == complement && freq[i] >= 2) {
                        System.out.println("(" + i + ", " + complement + ")");
                        found = true;
                    } else if(i < complement) { // Avoid duplicate pairs
                        System.out.println("(" + i + ", " + complement + ")");
                        found = true;
                    }
                }
            }
        }
        
        if(!found) {
            System.out.println("No pairs found!");
        }
    }
    
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int target = 9;
        
        System.out.print("Array: ");
        for(int num : arr) System.out.print(num + " ");
        System.out.println("\nTarget sum: " + target);
        
        findPairsWithSum(arr, target);
        System.out.println();
        findPairsWithSumFreq(arr, target);
        
        // Test case 2
        System.out.println("\n\nTest case 2:");
        int[] arr2 = {3, 5, 7, 2, 8, 1};
        int target2 = 10;
        findPairsWithSum(arr2, target2);
    }
}