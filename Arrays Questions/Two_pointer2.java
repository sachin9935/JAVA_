import java.util.Scanner;
public class Two_pointer2 {
    static void printa(int arr[]){
        int n = arr.length;
        for(int i=0; i<n; i++){
            System.out.println(arr[i]);
        }
    }
    static void reverse(int arr[]){
        int i=0,j=arr.length-1;
        while(i<j){
            swap(arr,i,j);
            i++;
            j--;
        }
    }

    // static int[] zeroand_one(int arr[]){
    //     int n = arr.length;
    //     int ans[] = new int[n];
    //     int k = 0;
    //     for(int i=0; i<n; i++){
    //         if(arr[i] == 0){
    //             arr[i] = ans[k];
    //             k++;
    //         }
    //     }
    //     for(int i=0; i<n; i++){
    //         ans[k] = arr[i];
    //     }
    //     return ans;
    // }
    // static void zeroand_one(int arr[]){
    //     int n = arr.length;
    //     int zero = 0;
    //     for(int i=0; i<n; i++){
    //         if(arr[i] == 0){
    //             zero++;
    //         }
    //     }
    //     for(int i=0; i<n; i++){
    //         if(i<zero){
    //             arr[i] = 0;
    //         }
    //         else{
    //             arr[i] = 1;
    //         }
    //     }
        
    // }

    static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


    static void zeroand_one(int arr[]){
        int n = arr.length;
        int left = 0, right = n-1;
        while(left<right){
            if(arr[left] == 1 && arr[right] == 0){
                swap(arr, left,right);
                left++;
                right--;
            }
            if(arr[left]==0){
                left++;
            }
            if(arr[right]==1){
                right--;
            }
        }
    }

    static void Odd_even(int arr[]){
        int n = arr.length;
        int left = 0,right = n-1;
        
        while(left<right){
            if(arr[left]%2 == 1 && arr[right]%2 == 0){
                swap(arr,left,right);
                left++;
                right--;
            }
            if(arr[left]%2 == 0){
                left++;
            }
            if(arr[right]%2 == 1){
                right--;
            }
        }
    }

    static void odd_even2(int arr[]){
        int n = arr.length;
        int left = 0,Right = n-1;
        while(left<Right){
            
            if(arr[left]%2 == 1 && arr[Right]%2 == 0){
                swap(arr,left,Right);
                left++;
                Right--;
            }
            if(arr[left]%2 == 0){
                left++;
            }
            if(arr[Right]%2 == 1){
                Right--;
            }
        }
        reverse(arr);
    }


    static int[] non_decresing(int arr[]){
        int n = arr.length;
        int left = 0,right = n-1;
        int ans[] = new int[n];
        int k = 0;
        while(left<=right){
            if(Math.abs(arr[left])>Math.abs(arr[right])){
                ans[k++] = arr[left]*arr[left];
                left++;
            }
            else{
                ans[k++] = arr[right]*arr[right];
                right--;
            }
        }
        reverse(ans);
        return ans;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        // System.out.println("Enter the size of array!");
        // int n = sc.nextInt();

        int arr[] = {-10,-3,-2,1,4,5};

        // System.out.println("Enter the total elements"+n);
        // for(int i=0; i<n; i++){
        //     arr[i] = sc.nextInt();
        // }

        int ans[] = non_decresing(arr);
        // odd_even2(arr);
        // zeroand_one(arr);

        printa(ans);
        sc.close();
    }
    
}
