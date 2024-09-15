import java.util.Scanner;

public class Recurive_Arrays {
    static void Printarray(int []arr,int idx){
        if(idx==arr.length){
            return;
        }
        System.out.println(arr[idx]);
        Printarray(arr,idx+1);
    }

    static int MaxIntArray(int arr[],int idx){
        if(idx==arr.length-1){
            return arr[idx];
        }
        int smallans = MaxIntArray(arr, idx+1);
        return Math.max(smallans,arr[idx]);
    }

    static int SumOfArray(int arr[],int idx){
        if(idx==arr.length){
            return 0;
        }
        int smallans = SumOfArray(arr,idx+1);
        return smallans+arr[idx];
    }


     public static void main(String args[]){
        
        int arr[] = {1,12,3,4};
        // Printarray(arr,0);     //print arr

        // System.out.println(MaxIntArray(arr,0));   //MAX element in array

        System.out.println(SumOfArray(arr,0));


    }

}
