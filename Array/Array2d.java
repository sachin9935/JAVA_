

import java.util.Scanner;

public class Array2d {

    // Method to print the 2D array
    static void PrintArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println(); // Move to the next line after printing each row
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows:");
        int row = sc.nextInt();
        System.out.println("Enter the number of columns:");
        int col = sc.nextInt();

        System.out.println("Enter " + (row * col) + " elements:");
        int arr2[][] = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr2[i][j] = sc.nextInt();
            }
        }

        System.out.println("The 2D array is:");
        PrintArray(arr2);

        sc.close(); // Close the scanner to prevent resource leaks
    }
}
