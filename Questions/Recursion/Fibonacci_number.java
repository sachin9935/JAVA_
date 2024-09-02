package Recursion;

public class Fibonacci_number {
    public static void main(String args[]){

        fibo(0,1);
    }
    static void fibo(int s,int e){       //0+1=1
        int n = s+e;
        System.out.println(n);
        fibo(n,e);
    }
}
