import java.util.Scanner;

public class Arrays2D {

    // Method to print a 2D array
    static void printArray(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Method to calculate the sum of two 2D arrays
    static void sumArray(int a[][], int b[][], int rows, int cols) {
        int sum[][] = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sum[i][j] = a[i][j] + b[i][j];
            }
        }

        System.out.println("Sum of matrices:");
        printArray(sum);
    }

    // Method to multiply two 2D arrays
    static void multiply(int a[][], int r1, int c1, int b[][], int r2, int c2) {
        if (c1 != r2) {
            System.out.println("Matrix multiplication is not possible due to dimension mismatch.");
            return;
        }
        int product[][] = new int[r1][c2];
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                for (int k = 0; k < c1; k++) {
                    product[i][j] += (a[i][k] * b[k][j]);
                }
            }
        }
        System.out.println("Resultant matrix after multiplication:");
        printArray(product);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // Input for the first matrix
        System.out.println("Enter the details for the first matrix:");
        System.out.print("Number of rows: ");
        int r1 = sc.nextInt();
        System.out.print("Number of columns: ");
        int c1 = sc.nextInt();

        // Input for the second matrix
        System.out.println("Enter the details for the second matrix:");
        System.out.print("Number of rows: ");
        int r2 = sc.nextInt();
        System.out.print("Number of columns: ");
        int c2 = sc.nextInt();

        int arr[][] = new int[r1][c1];
        int arr1[][] = new int[r2][c2];

        // Input elements for the first matrix
        System.out.println("Enter the " + r1 * c1 + " elements of the first matrix:");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        // Input elements for the second matrix
        System.out.println("Enter the " + r2 * c2 + " elements of the second matrix:");
        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }

        // Print the matrices
        System.out.println("First matrix:");
        printArray(arr);
        System.out.println("Second matrix:");
        printArray(arr1);

        // Perform and print the multiplication of the two matrices
        multiply(arr, r1, c1, arr1, r2, c2);
        sc.close();
    }
}
