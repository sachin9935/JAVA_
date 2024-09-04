import java.util.Scanner;
public class Sum_of_Rectangle {

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
        




        sc.close();
    }
    
}

    

