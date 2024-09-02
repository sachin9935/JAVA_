import java.util.Arrays;

class copy{
    static void printArray(int arr[]){
        for(int i=0; i<arr.length; i++){
            
            System.out.print(arr[i]);

        }
    }
        public static void main(String args[]){
        int arr1[] = {1,2,3,4,5};
        int arr2[] = arr1.clone();
        int arr3[] = Arrays.copyOf(arr1,   4);
        
        printArray(arr1);

        System.out.println("New arrays!");
        printArray(arr2);
        System.out.println("New arrays copy !");
        printArray(arr3);


       

    }
}