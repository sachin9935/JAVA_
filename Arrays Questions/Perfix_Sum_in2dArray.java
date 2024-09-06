import java.util.Scanner;

public class Perfix_Sum_in2dArray {
    static void peintArray(int arr[][],int r,int c){
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    static int findsum(int matrix[][],int l1,int r1,int l2,int r2){
        int sum = 0;
        for(int i=l1; i<=l2; i++){
            for(int j=r1; j<=r2; j++){
                sum += matrix[i][j];
            }
        }
        return sum;
    }
    static void finx_PrefixSum_matrix(int matrix[][]){
        int r = matrix.length;
        int c = matrix[0].length;
        
        //travers horizontly to calculate row - wise prefix sum
        for(int i=0; i<r; i++){
            for(int j=1; j<c; j++){
                matrix[i][j] += matrix[i][j-1];
            }
        }
        // travers vertically to calulate colunm - wise sum
        for(int j=0; j<c; j++){
            for(int i=1; i<r; i++){
                matrix[i][j] += matrix[i-1][j];
            }
        }
    }

    static int findsum_2nd(int matrix[][],int l1,int r1,int l2,int r2){
            int sum = 0;
            finx_PrefixSum_matrix(matrix);
            for(int i=l1; i<=l2; i++){
                if(r1>=1){
                    sum += matrix[i][r2]-matrix[i][r1-1];
                }
                else{
                    sum += matrix[i][r2];
                }
            }
            return sum;
    }


    static int findsum_3rd(int matrix[][],int l1,int r1,int l2,int r2){
        int ans = 0, sum = 0, up = 0, left = 0, leftup = 0;
        finx_PrefixSum_matrix(matrix);
        
        sum = matrix[l2][r2];
        if(r1>=1){
            left = matrix[l2][r1-1];
        }
        if(l1>=1){
            up = matrix[l1-1][r2];
        }
        if(l1>=1 && r1>=1){
            leftup = matrix[l1-1][r1-1];
        }
        ans = sum - up - left - leftup;

        return ans;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Matrix n*m");
        int r = sc.nextInt();
        int c = sc.nextInt();

        int arr[][] = new int[r][c];
        System.out.println("Enter the "+r*c+" elements:");
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        

        peintArray(arr,r,c);
        System.out.println("Enter the boundaries: l1,r1,l2,r2");
        int l1 = sc.nextInt();
        int r1 = sc.nextInt();
        int l2 = sc.nextInt();
        int r2 = sc.nextInt();

        System.out.println("Rectangle sum "+findsum(arr,l1,r1,l2,r2));
        System.out.println("Rectangle sum "+findsum_3rd(arr,l1,r1,l2,r2));
        




        sc.close();
    }
    
}
