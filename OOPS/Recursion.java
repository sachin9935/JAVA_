import java.util.*;
public class Recursion {

    static void printNumber(int n) {
        if (n == 1 ){
            System.out.println(n);
            return;
        }
        printNumber(n - 1);
        System.out.println(n);
    }

    static void PrintNatural_no(int n){
        if(n==1){
            System.out.println(1);
            return;
        }
        System.out.println(n);
        PrintNatural_no(n-1);
    }

    static int factorial2(int n){
        if(n==0) return 1;
        return n*factorial2(n-1);
    }

    static int Fib(int n){
        if(n ==0 || n==1)
            return n;
        return Fib(n-1)+Fib(n-2);

//        int prev = Fib(n-1);
//        int PrevisPer = Fib(n-2);
//        return prev+PrevisPer;
    }


    static int Sum_digit(int n){
        if(n>=0 && n<=9) return n;
        return Sum_digit(n/10)+n%10;
    }

    static int pow(int p,int q){     //TC = o(q)
        if(q==0) return 1;
        return pow(p,q-1)*p;
    }

    static int pow2(int p,int q){   //TC = o(logq)
        if(q==0) return 1;
        int SmallPow2 = pow2(p,q/2);
        if(q%2==0)
            return SmallPow2*SmallPow2;
        return p*SmallPow2*SmallPow2;
    }





    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
        System.out.println(pow2(2,5));






        }
}
