class bubble_short{
    public static void printArray(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]);
        }
    }

    public static void main(String[] args){
        // String arr[] = {"sachin mishra"};
        // int arr[] = {1,2,3,4,5};
        int arr[] = {7,8,3,2,1};
        for(int i=0; i<arr.length-1; i++){
            for(int j=0; j<arr.length-i-1; j++){
                if(arr[j]>arr[j+1]){
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        printArray(arr);

    }
}