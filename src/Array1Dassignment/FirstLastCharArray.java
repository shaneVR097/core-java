package Array1Dassignment;

public class FirstLastCharArray {
    public static void firstLastChar(char[] arr) {
        if (arr == null || arr.length == 0) {
            System.out.println("Array is empty!");
            return;
        }
        System.out.println("First character: " + arr[0]);
        System.out.println("Last character: " + arr[arr.length - 1]);
    }
    
    public static void firstLastChar(int[] arr) {
        if (arr == null || arr.length == 0) {
            System.out.println("Array is empty!");
            return;
        }
        System.out.println("First element: " + arr[0]);
        System.out.println("Last element: " + arr[arr.length - 1]);
    }
    
    public static void main(String[] args) {
        char[] chars = {'A', 'B', 'C', 'D', 'E'};
        firstLastChar(chars);
        
        int[] nums = {1, 2, 3, 4, 5};
        firstLastChar(nums);
    }
}
