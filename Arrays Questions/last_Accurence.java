import java.util.Scanner;
import java.util.Arrays;

public class last_Accurence {
    static void printArr(int arr[]){
        System.out.println("Enterd Elements!!!");
        for(int i=0; i<arr.length; i++){
            
            System.out.println(arr[i]);
        }
    }


    static void check(int arr[],int x){
        int count = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] == x){
                count++;
            }
        }
        System.out.print("your element repeat up to " +count+" tiems");
        // System.out.println(count);
    }

    static void last_accurence(int arr[],int x){
        
        int idx = -1;
        for(int i=0; i<arr.length; i++){
             if(arr[i] == x){
                // i = idx;
                idx = i+idx;
            }
        }
        System.out.print("last index of element:"+ idx);
    }

    static void is_shorted(int arr[]){
        int ith1 = -1;
        int ith2 = 0;
        for(int i=0; i<arr.length; i++){
            arr[i] = ith2;
            if(ith2>ith1){
                System.out.println("Array is not shorted!!!");
            }
         
        }
    }

    static boolean sArray(int arr[]){
        boolean check = true;
        for(int i=1; i<arr.length; i++){
            if(arr[i]<arr[i-1]){
                check = false;
                break;
            }
        }
        System.out.println(check);
        return check;
        
    }


    static int[] smallest_and_lergest(int arr[]){
        Arrays.sort(arr);
        printArr(arr);
        int ans[] = {arr[0], arr.length-1};
        return ans;
        
    }







    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array!");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter the element");
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        sc.close();
        int ans[] = smallest_and_lergest(arr);
        System.out.println(ans[0]);
        System.out.println(ans[1]);
        // sandl(arr);

        // sArray(arr);
        // is_shorted(arr);
        // last_accurence(arr,2);
        // check(arr,3);
        // printArr(arr);

    }
    
}


