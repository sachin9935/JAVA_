package Recursion;

public class Pn {
    public static void main(String args[]){
        printN(1);
    }
    static void printN(int n){
        System.out.println(n);
        print2(2);
    }
    static void print2(int n){
        System.out.println(n);
        print3(3);
    }
    static void print3(int n){
        System.out.println(n);
        print4(4);
    }
    static void print4(int n){
        System.out.println(n);
    }
}
