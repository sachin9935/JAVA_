import java.util.Scanner;

public class reacp {
    static void printarray(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]);
        }
    }
    static int[] rota(int arr[],int k){
        int n = arr.length;
        k = k%n;
        int ans[] = new int[n];
        int j = 0;
        for(int i=n-k; i<n; i++){
            ans[j++] = arr[i];
        }
        for(int i=0; i<n-k; i++){
            ans[j++] = arr[i];
        }
        return ans;
    }


    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int arr[] = {1,2,3,4,5};

         int n[] = rota(arr,2);
        printarray(n);

        sc.close();
    }
    
}
