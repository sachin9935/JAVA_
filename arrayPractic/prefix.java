import java.util.Scanner;
public class prefix{
    static void printarr(int arr[]){
        int n = arr.length;
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }

    static int[] prefix_sum(int arr[]){
        int n = arr.length;
        int pref[] = new int[n];
        pref[0] = arr[0];
        for(int i=1; i<n; i++){
            pref[i] = pref[i-1] + arr[i];
        }
        return pref;
    }

    static int findsumArray(int arr[]){
        int totalsum = 0;
        for(int i=0; i<arr.length; i++){
            totalsum+=arr[i];
        }
        return totalsum;
    }

    static boolean equal_sum_partion(int arr[]){
        int totalsum = findsumArray(arr);
        int prefixSum = 0;
        for(int i=0; i<arr.length; i++){
            prefixSum+=arr[i];
            int sufixSum = totalsum - prefixSum;
            if(sufixSum==prefixSum){
                return true;
            }
        }
        return false;
    }

    static int[] prefix_sum2(int arr[]){
       
        for(int i=1; i<arr.length; i++){
            arr[i]+=arr[i-1];
        }
        return arr;
    }


    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of arrary");
        int n = sc.nextInt();
        int arr[] = new int[n+1];
        System.out.println("Enter the elements no of= "+n);
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(equal_sum_partion(arr));

        
        // int prefsum[] = prefix_sum2(arr);

        // System.out.println("Enter the number of queris:");
        // int q = sc.nextInt();
        // while(q-->0){
        //     System.out.println("enter the range:");
        //     int l = sc.nextInt();
        //     int r = sc.nextInt();
        //     int sum =  prefsum[r] - prefsum[l-1]  ;
        //     System.out.println("sum"+sum);

        // }





        // System.out.println("your elements!!!");
        // printarr(arr);
        // System.out.println("prefix of array");

        // prefix_sum2(arr);
        // int ans[] = prefix_sum2(arr);
        // printarr(ans);
        sc.close();
    }
}