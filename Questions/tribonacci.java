import java.util.Scanner;
class tribonacci{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int a=0,b=1,c=2,d,temp;

        System.out.println("Enter term:");
        temp = sc.nextInt();
        
        for(int i=0; i<temp; i++){
            System.out.print(a+" ");
            d=a+b+c;
            a=b;
            b=c;
            c=d;
        }
    }
}