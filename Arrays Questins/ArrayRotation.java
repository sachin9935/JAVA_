import java.util.Scanner;

public class ArrayRotation {

    // Method to print the array elements with spaces between them
    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(); // Move to the next line after printing the array
    }

    // Method to rotate the array by k positions
    static int[] rotateArray(int[] arr, int k) {
        int n = arr.length;
        if (n == 0) return arr; // Return empty array if input is empty
        k = k % n; // Handle cases where k is greater than the array length
        int[] rotatedArray = new int[n];

        // Copy the last k elements to the beginning of the rotated array
        int j = 0;
        for (int i = n - k; i < n; i++) {
            rotatedArray[j++] = arr[i];
        }

        // Copy the first n-k elements to the end of the rotated array
        for (int i = 0; i < n - k; i++) {
            rotatedArray[j++] = arr[i];
        }

        return rotatedArray;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Define an example array
        int[] arr = {1, 2, 3, 4, 5};

        // Rotate the array by 2 positions
        int[] rotatedArray = rotateArray(arr, 2);

        // Print the rotated array
        printArray(rotatedArray);

        sc.close();
    }
}
