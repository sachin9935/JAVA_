import java.util.Scanner;

public class CalculatingPower {
    static int pow(int p,int q){
        if(q==0) return 1;
        if(q%2==0){
            int smallpow = pow(p,q/2);
            return smallpow*smallpow;
        }

        int smallpow = pow(p,q/2);
        return p*smallpow*smallpow;
    }

     public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        

        System.out.println(pow(2,3));
        sc.close();
    }

}
