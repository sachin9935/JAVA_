import java.util.Scanner;


public class Two_pointer {
    static void printArray(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }

    static void zeros_and_one(int arr[]){
        int n = arr.length;
        int count = 0;
        for(int i=0; i<n; i++){
            if(arr[i] == 0){
                count++;
            }
        }
        for(int i=0; i<n; i++){
            if(i<count){
                arr[i] = 0;
            }else{
                arr[i] = 1;
            }
        }
    }

    static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void reverse(int arr[]){
        int i=0,j=arr.length-1;
        while(i<j){
            swap(arr,i,j);
            i++;
            j--;
        }
    }

    static int[] sort_Squre(int arr[]){
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

    static void Zero_and_one_inPlace(int arr[]){
        int n = arr.length;
        int left = 0, right = n-1;
        while(left<right){
            if(arr[left] == 1 && arr[right] == 0){
                swap(arr,left,right);
                left++;
                right--;
            }
            if(arr[left] == 0){
                left++;
            }
            if(arr[right] == 1){
                right--;
            }
        }
    }


    static void Short_array_byParity(int arr[]){
        int n = arr.length;
        int left = 0, right = n-1;
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
   public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    
        // System.out.println("Enter the size of array!!!");
        // int n = sc.nextInt();

        int arr[] = {-10,-5,-2,1,4,9};
        int ans[] = sort_Squre(arr);
        
        // Zero_and_one_inPlace(arr);
        
        // Short_array_byParity(arr);
        
        printArray(ans);




        // System.out.println("Enter the totala elements:"+n);
        // for(int i=0; i<arr.length; i++){
        //     arr[i] = sc.nextInt();
        // }
        // 
        sc.close();
   }
}
