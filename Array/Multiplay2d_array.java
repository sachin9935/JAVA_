//
//import java.util.Scanner;
//
//public class Multiplay2d_array {
//
//    static void PrintMatrix(int[][] arr) {
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                System.out.print(arr[i][j] + " ");
//            }
//            System.out.println();
//        }
//    }
//
//    static void multiply(int[][] a, int r1, int c1, int[][] b, int r2, int c2) {
//        if (c1 != r2) {
//            System.out.println("Multiplication of matrices is not possible.");
//            return;
//        }
//        int mul[][] = new int[r1][c2];
//        for (int i = 0; i < r1; i++) {
//            for (int j = 0; j < c2; j++) {
//                for (int k = 0; k < c1; k++) {
//                    mul[i][j] += a[i][k] * b[k][j];
//                }
//            }
//        }
//
//        System.out.println("Resultant Matrix:");
//        PrintMatrix(mul);
//    }
//
//    public static void main(String args[]) {
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Enter the first matrix:");
//        System.out.println("Enter the number of rows:");
//        int r1 = sc.nextInt();
//        System.out.println("Enter the number of columns:");
//        int c1 = sc.nextInt();
//
//        int a[][] = new int[r1][c1];
//        System.out.println("Enter the elements of the first matrix:");
//        for (int i = 0; i < r1; i++) {
//            for (int j = 0; j < c1; j++) {
//                a[i][j] = sc.nextInt();
//            }
//        }
//
//        System.out.println("Enter the second matrix:");
//        System.out.println("Enter the number of rows:");
//        int r2 = sc.nextInt();
//        System.out.println("Enter the number of columns:");
//        int c2 = sc.nextInt();
//
//        int b[][] = new int[r2][c2];
//        System.out.println("Enter the elements of the second matrix:");
//        for (int i = 0; i < r2; i++) {
//            for (int j = 0; j < c2; j++) {
//                b[i][j] = sc.nextInt();
//            }
//        }
//
//        System.out.println("Matrix 1:");
//        PrintMatrix(a);
//        System.out.println("Matrix 2:");
//        PrintMatrix(b);
//
//        // Multiply matrices
//        multiply(a, r1, c1, b, r2, c2);
//    }
//}
//

//}