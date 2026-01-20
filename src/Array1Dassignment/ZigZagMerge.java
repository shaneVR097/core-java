package Array1Dassignment;

public class ZigZagMerge {
    public int[] zigzagMerge(int[] a, int[] b) {
        int la = a.length;
        int lb = b.length;
        int[] result = new int[la + lb];
        
        int i = 0, j = 0, k = 0;
        
        // Alternate between arrays
        while(i < la && j < lb) {
            result[k++] = a[i++];
            result[k++] = b[j++];
        }
        
        // Add remaining elements from a
        while(i < la) {
            result[k++] = a[i++];
        }
        
        // Add remaining elements from b
        while(j < lb) {
            result[k++] = b[j++];
        }
        
        return result;
    }
    
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 7};
        int[] arr2 = {2, 4, 6, 8, 10, 12};
        BasicArray ba=new BasicArray();
        ba.printarray(arr1);
        ba.printarray(arr2);
        ZigZagMerge zm=new ZigZagMerge();
        int[] zigzag = zm.zigzagMerge(arr1, arr2);
        System.out.print("\n\nZig-zag merged: ");
        ba.printarray(zigzag);
    }
}