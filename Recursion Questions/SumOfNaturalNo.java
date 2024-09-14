import java.util.Scanner;

public class SumOfNaturalNo {
    static int SumOfNo(int n){
        if(n==0) return 0;
        return SumOfNo(n-1)+n;
    }


     public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(SumOfNo(n));


        sc.close();
    }

}
