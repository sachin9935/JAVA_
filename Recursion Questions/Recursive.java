import java.util.*;

class Recursive{
    static int SumOf_naturalNo(int n){
        if(n==0) return 0;
        return SumOf_naturalNo(n-1)+n;
    }


    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(SumOf_naturalNo(n));

        sc.close(); 
    }
}