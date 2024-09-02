import java.util.Scanner;

public class Array1d {
    public static void main(String args[]){
//        int ar[] = {5,6,7,8,9};
//        for(int i=0; i<ar.length; i++){
//            System.out.println(ar[i]);
//        }
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array!");
        int size = sc.nextInt();
        int marks[] = new int[size];
        for(int i=0; i<marks.length; i++){
            System.out.println("Enter the marks");
              marks[i] = sc.nextInt();
        }
        for(int i=0; i<marks.length; i++){
            System.out.println(marks[i]);
        }



    }
}
