import java.util.Scanner;
public class grnerateSpiral {
    static void print_matrix(int Matrix[][]){
        for(int i=0; i<Matrix.length; i++){
            for(int j=0; j<Matrix[i].length; j++){
                System.out.print(Matrix[i][j]+" ");
            }
            System.out.println();
        }
    }

    static int[][] genreateSpiralMatrix(int n){
        int matrix[][] = new int[n][n];
        int Toprow = 0, Bottomrow = n-1, Leftcol = 0, Rightcol = n-1;
        int count = 1;
        while(count<=n*n){
            //toprow -> leftcol to rightcol
            for(int i=Leftcol; i<=Rightcol && count<=n*n; i++){
                // System.out.print(Matrix[Toprow][i]+" ");
                matrix[Toprow][i] = count;
                count++;
            }
            Toprow++;

            //rightcol -> toprow to bottomrow
            for(int i=Toprow; i<=Bottomrow && count<=n*n; i++){
                // System.out.print(Matrix[i][Rightcol]+" ");
                matrix[i][Rightcol] = count;
                count++;           
             }
            Rightcol--;

            //bottomrow -> rightcol to leftcol
            for(int j=Rightcol; j>=Leftcol && count<=n*n; j--){
                // System.out.print(Matrix[Bottomrow][j]+" ");
                matrix[Bottomrow][j] = count;
                count++;            
            }
            Bottomrow--;

            //leftcol ->bottomrow to toprow
            for(int i=Bottomrow; i>=Toprow && count<=n*n; i--){
                // System.out.print(Matrix[i][Leftcol]+" ");
                matrix[i][Leftcol] = count;
                count++;
            }
            Leftcol++;
        }
        return matrix;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter number");
        int n = sc.nextInt();
        int Matrix[][] = genreateSpiralMatrix(n);
        print_matrix(Matrix);
        
        

        sc.close();
    }
    
}
