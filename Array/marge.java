import java.util.Scanner;
public class marge {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int aSize,bSize;
        System.out.println("Enter the size of 1st array!");
        aSize = sc.nextInt();
        System.out.println("Enter the size of 2nd array!");
        bSize = sc.nextInt();
        int arr1[] = new int[aSize];
        int arr2[] = new int[bSize];

        int marge[] = new int[aSize+bSize];
        for(int i=0; i<arr1.length; i++){
            System.out.println("Enter the element of array 1st!");
            arr1[i] = sc.nextInt();                             //scan
            marge[i] = arr1[i];
        }
        for(int i=0; i<arr2.length; i++){
            System.out.println("Enter the element of array 2nd!");
            arr2[i] = sc.nextInt();                                  //scan
            marge[arr1.length+i] = arr2[i];
        }

        for(int i=0; i<aSize+bSize; i++){
            System.out.println(marge[i]);
        }
        sc.close();
    }
}
