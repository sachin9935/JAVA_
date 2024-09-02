import java.util.Scanner;
public class newPractic {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the row no");
//        int row = sc.nextInt();
//        System.out.println("Enter the row no");
//        int col = sc.nextInt();
//
//        int arr[][] = new int[row][col];
//        for(int i=0; i<row; i++){
//            for(int j=0; j<col; j++){
//                arr[i][j] = sc.nextInt();
//            }
//        }
//        System.out.println("total elements!");
//        for(int i=0; i<row; i++){
//            for(int j=0; j<col; j++){
//                System.out.print(arr[i][j]);
//            }
//            System.out.println(" ");
//        }



//        int ar3[][] = new int[2][2];
//        ar3[0][0] = 1;
//        ar3[0][1] = 2;
//        ar3[1][0] = 3;
//        ar3[1][1] = 4;
//        for(int i=0; i<2; i++){
//            for(int j=0; j<2; j++){
//                System.out.print(ar3[i][j]+"");
//            }
//            System.out.println(" ");
//        }

        int arr[][] = {
                {1,2},
                {3,4},
                {5,6}
        };

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length-1; j++){
                if(i==0 || i==arr.length-1){
                    System.out.print(arr[i][j]+" ");
                }
                System.out.println(" ");
                }

                }

        }



    }

