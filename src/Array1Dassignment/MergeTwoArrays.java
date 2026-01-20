package Array1Dassignment;

public class MergeTwoArrays {
    public int[] mergeArrays(int[] a, int[] b) {
        int la = a.length;
        int lb = b.length;
        int[] merged = new int[la + lb];
        
        // Copy first array
        for(int i = 0; i < la; i++) {
            merged[i] = a[i];
        }
        
        // Copy second array
        for(int i = 0; i < lb; i++) {
            merged[la + i] = b[i];
        }
        
        return merged;
    }
    
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {4, 5, 6, 7};
        BasicArray ba=new BasicArray();
        ba.printarray(arr1);
        ba.printarray(arr2);
        MergeTwoArrays mt=new MergeTwoArrays();
        int[] merged = mt.mergeArrays(arr1, arr2);
        
        System.out.print("\n\nMerged array: ");
        ba.printarray(merged);
    }
}