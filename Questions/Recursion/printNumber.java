package Recursion;


class printNumber {
    public void Num(int n){
        if(n == 10){
            return;
        }
        System.out.println(n);
        Num(n+1);
    }
    public static void main(String args[]){
        printNumber nm = new printNumber();
        nm.Num(1);
    }
}












