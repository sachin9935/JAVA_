import java.util.Scanner;

public class Multiples {
    static int mul(int n, int k) {
        if (k == 0) return 0;
        return n + mul(n, k - 1);
    }


    static void pmul(int n,int k){  //5 4
        if(k==1){
            System.out.println(n);
            return;
        }
        pmul(n,k-1);   //5 10 15
        System.out.println(n*k);  //20
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        System.out.print("Enter the multiplier: ");
        int k = sc.nextInt();

        // System.out.println("Result: " + mul(n, k));
        pmul(n,k);

        sc.close();
    }
}
