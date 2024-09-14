import java.util.Scanner;

public class GCD_Euclids_Algo {
    static int IGCD(int x,int y){
        while(x%y!=0){
            int rem = x%y;
            x = y;
            y = rem;
        }
        return y;
    }

    static int GCD(int x,int y){
        if(y==0) return x;
        return GCD(y,x%y);
    }

      public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Disiver & divident");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        
        // System.out.println(IGCD(n1,n2));
        System.out.println(GCD(n1,n2));



        sc.close();
    }

}
