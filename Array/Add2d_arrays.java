

import java.util.Scanner;

public class Add2d_arrays {

    static void PrintArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void add(int[][] a, int r1, int c1, int[][] b, int r2, int c2) {
        if (r1 != r2 || c1 != c2) {
            System.out.println("Wrong input! Addition not possible!!");
            return;
        }
        int sum[][] = new int[r1][c1];
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                sum[i][j] = a[i][j] + b[i][j];
            }
        }
        System.out.println("Sum of matrices:");
        PrintArray(sum);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first matrix:");
        System.out.println("Enter the number of rows:");
        int r1 = sc.nextInt();
        System.out.println("Enter the number of columns:");
        int c1 = sc.nextInt();

        int a[][] = new int[r1][c1];
        System.out.println("Enter the elements of the first matrix:");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter the second matrix:");
        System.out.println("Enter the number of rows:");
        int r2 = sc.nextInt();
        System.out.println("Enter the number of columns:");
        int c2 = sc.nextInt();

        int b[][] = new int[r2][c2];
        System.out.println("Enter the elements of the second matrix:");
        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                b[i][j] = sc.nextInt();
            }
        }

        System.out.println("Matrix 1:");
        PrintArray(a);
        System.out.println("Matrix 2:");
        PrintArray(b);

        // Adding matrices
        add(a, r1, c1, b, r2, c2);

        sc.close(); // Close the scanner to prevent resource leaks
    }
}

