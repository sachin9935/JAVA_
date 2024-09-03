import java.util.Scanner;

public class Array_2D
 {

    // Function to print a 2D array
    static void printArray2D(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Function to transpose a 2D array
    static int[][] transpose(int arr[][], int r, int c) {
        int ans[][] = new int[c][r]; // Create a new transposed matrix with flipped dimensions
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                ans[j][i] = arr[i][j]; // Logic for transposing
            }
        }
        return ans;
    }

    // Function to reverse a 1D array (used in 90-degree rotation)
    static void reverseArray(int arr[]) {
        int i = 0, j = arr.length - 1;
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    // Function to transpose a 2D array in place (no new array)
    static void transposeInPlace(int arr[][], int r, int c) {
        for (int i = 0; i < r; i++) {
            for (int j = i; j < c; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
    }

    // Function to rotate a matrix by 90 degrees
    static void rotate90(int arr[][], int n) {
        transposeInPlace(arr, n, n); // In-place transpose
        for (int i = 0; i < n; i++) {
            reverseArray(arr[i]); // Reverse each row to achieve the 90-degree rotation
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // Input the dimensions of the matrix
        System.out.println("Enter the number of rows:");
        int r = sc.nextInt();
        System.out.println("Enter the number of columns:");
        int c = sc.nextInt();

        int arr[][] = new int[r][c];
        System.out.println("Enter the " + r * c + " elements:");

        // Input the elements of the matrix
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        // Print the original matrix
        System.out.println("Original Matrix:");
        printArray2D(arr);

        // Transpose the matrix in place and print it
        System.out.println("Transposed Matrix (In-Place):");
        transposeInPlace(arr, r, c);
        printArray2D(arr);

        // Rotate the matrix by 90 degrees if it is square and print it
        if (r == c) {
            System.out.println("Matrix rotated by 90 degrees:");
            rotate90(arr, r);
            printArray2D(arr);
        } else {
            System.out.println("Rotation by 90 degrees is not possible for non-square matrices.");
        }

        sc.close(); // Close the scanner
    }
}
