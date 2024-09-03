import java.util.Scanner;
public class Sprial_matrix {
    static void print_matrix(int Matrix[][],int r,int c){
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                System.out.print(Matrix[i][j]+" ");
            }
            System.out.println();
        }
    }

    static void Print_Sprial_Matrix(int Matrix[][],int r,int c){
        int Toprow = 0, Bottomrow = r-1, Leftcol = 0, Rightcol = c-1;
        int Total_elements = 0;
        
        while(Total_elements<r*c){
            //toprow -> leftcol to rightcol
            for(int i=Leftcol; i<=Rightcol && Total_elements<r*c; i++){
                System.out.print(Matrix[Toprow][i]+" ");
                Total_elements++;
            }
            Toprow++;

            //rightcol -> toprow to bottomrow
            for(int i=Toprow; i<=Bottomrow && Total_elements<r*c; i++){
                System.out.print(Matrix[i][Rightcol]+" ");
                Total_elements++;
            }
            Rightcol--;

            //bottomrow -> rightcol to leftcol
            for(int j=Rightcol; j>=Leftcol && Total_elements<r*c; j--){
                System.out.print(Matrix[Bottomrow][j]+" ");
                Total_elements++;
            }
            Bottomrow--;

            //leftcol ->bottomrow to toprow
            for(int i=Bottomrow; i>=Toprow && Total_elements<r*c; i--){
                System.out.print(Matrix[i][Leftcol]+" ");
                Total_elements++;
            }
            Leftcol++;
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Rows & Collmns");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int ar[][] = new int[r][c];
        System.out.println("Enter"+r*c+" elements:");
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                ar[i][j] = sc.nextInt();
            }
        }
        
        print_matrix(ar,r,c);
        System.out.println("Sprial Matrix!");
        Print_Sprial_Matrix(ar,r,c);

        sc.close();
    }
    
}
