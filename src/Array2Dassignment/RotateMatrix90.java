package Array2Dassignment;

public class RotateMatrix90 {
    
    // Method 1: Create new rotated matrix (preserves original)
    public int[][] rotate90ClockwiseNew(int[][] matrix, char p) {
        if (matrix == null || matrix.length == 0) {
            System.out.println("Matrix is null or empty");
            return null;
        }
        
        // Check if square matrix
        int n = matrix.length;
        for (int i = 0; i < n; i++) {
            if (matrix[i].length != n) {
                System.out.println("Matrix must be square for rotation!");
                return null;
            }
        }
        
        // Create new matrix for rotated result
        int[][] rotated = new int[n][n];
        
        // Apply rotation: rotated[j][n-1-i] = matrix[i][j]
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                rotated[j][n - 1 - i] = matrix[i][j];
            }
        }
        
        if (p == 'p' || p == 'P') {
        	Create2dArray c=new Create2dArray();
            System.out.println("Original Matrix:");
            c.print2d(matrix);
            System.out.println("\nRotated 90° Clockwise:");
            c.print2d(rotated);
        }
        
        return rotated;
    }
    
    public static void main(String[] args) {
        RotateMatrix90 rotator = new RotateMatrix90();
        
        System.out.println("=== Test 1: 3x3 Matrix ===");
        int[][] matrix1 = {{1, 2, 3},{4, 5, 6},{7, 8, 9}};
        
        System.out.println("\n--- Method 1: New Matrix ---");
        rotator.rotate90ClockwiseNew(matrix1, 'p');
        
        System.out.println("\n=== Test 2: 4x4 Matrix ===");
        int[][] matrix2 = {{1, 2, 3, 4},{5, 6, 7, 8},{9, 10, 11, 12},{13, 14, 15, 16}};
        rotator.rotate90ClockwiseNew(matrix2, 'p');
    }
}