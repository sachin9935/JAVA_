import java.util.*;
public class PrintFiboNumber {
   
    static void printNumber(int n){
        if(n==5){
            System.out.println(n);
            return;
        }
        System.out.println(n);
        printNumber(n+1);
    }
    
    static int Fibo(int n){
        if(n==0 || n==1) return n;
        return Fibo(n-1)+Fibo(n-2);
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        printNumber(1);
        System.out.println(Fibo(4));


        sc.close();

    }
}


