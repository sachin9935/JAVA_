import java.util.Scanner;

public class Array_manipulation {
    static void printArray(int arr[]){
        int n = arr.length;
        System.out.println("Entered Elements:");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }

    static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void reverse_arr(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n / 2; i++) {
            swap(arr, i, n - i - 1);
        }
        printArray(arr);
    }

    static void reverse_without_arr(int arr[]) {
        int n = arr.length;
        System.out.println("Reversed array (without new array):");
        for (int i = n - 1; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }

    static int[] rotate(int arr[], int k) {
        int n = arr.length;
        k = k % n;  // Handle cases where k > n
        int ans[] = new int[n];
        int j = 0;
        
        // Shift elements
        for (int i = n - k; i < n; i++) {
            ans[j++] = arr[i];
        }
        for (int i = 0; i < n - k; i++) {
            ans[j++] = arr[i];
        }
        
        return ans;
    }
    
    static void reverse(int arr[], int i, int j) {
        while(i < j) {
            swap(arr, i, j);
            i++;
            j--;
        }
    }

    static void without_exterspace(int arr[], int k) {
        int n = arr.length;
        k = k % n;

        reverse(arr, 0, n - k - 1);
        reverse(arr, n - k, n - 1);
        reverse(arr, 0, n - 1);
    }

    static int[] makefreqence(int arr[]){
        int freq[] = new int[100005];
        for(int i=0; i<arr.length; i++){
            freq[arr[i]]++;
        }
        return freq;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int arr[] = {1, 2, 3, 4, 5, 6, 7};

        System.out.println("Original Array:");
        printArray(arr);
        int freq[] = makefreqence(arr);
        System.out.println("Enter number of query");
        int q = sc.nextInt();
        while(q>0){
            System.out.println("Enter no. to be serched:");
            int x = sc.nextInt();
            if(freq[x]>0){
                System.out.println("yes");
            }
            else{
                System.out.println("no");
            }
            q--;
        }
        

        // Rotating array by 1 position without using extra space
        // without_exterspace(arr, 1);
        // System.out.println("Array after rotating by 1 position:");
        // printArray(arr);

        sc.close();
    }
}
