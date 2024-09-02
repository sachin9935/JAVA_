package Recursion;

public class Pnum {
    public static void main(String args[]){
        System.out.println("hekko");
        PrintNumber(1);
    }
    static void PrintNumber(int n){
        if(n==5){
            System.out.println(n);
            return;
        }
        System.out.println(n);
        PrintNumber(n+1);
    }
}
