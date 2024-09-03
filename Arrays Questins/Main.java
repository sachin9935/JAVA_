import java.util.ArrayList;
import java.util.List;

class SparseMatrix { // Changed from 'public class Main'
    private List<int[]> sparseMatrix;

    // Constructor for SparseMatrix
    public SparseMatrix(int[][] matrix) {
        sparseMatrix = new ArrayList<>();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] != 0) {
                    sparseMatrix.add(new int[]{i, j, matrix[i][j]});
                }
            }
        }
    }

    // Method to print non-zero elements
    public void printNonZeroElements() {
        System.out.println("Sparse Matrix: Non-zero Elements");
        for (int[] element : sparseMatrix) {
            System.out.println("Row: " + element[0] + ", Column: " + element[1] + ", Value: " + element[2]);
        }
    }
}

public class Main { // This is the main class with the main method
    public static void main(String[] args) {
        int[][] matrix = {
            {0, 0, 3, 0},
            {22, 0, 0, 0},
            {0, 7, 0, 0},
            {0, 0, 0, 9}
        };

        // Create an object of SparseMatrix and print non-zero elements
        SparseMatrix sparseMatrix = new SparseMatrix(matrix);
        sparseMatrix.printNonZeroElements();
    }
}
