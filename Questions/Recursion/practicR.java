package Recursion;

public class practicR {
    static void Pnum(int n){
        if(n==10){
            System.out.println(n);
            return;
        }
        System.out.println(n);
        Pnum(n+1);
    }
    public static void main(String args[]){
        Pnum(1);

    }
}
