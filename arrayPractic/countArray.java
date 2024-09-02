public class countArray {
    static void Parr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]);
        }
    }

    public static void main(String args[]){
        int arr[] = {1,5,5,5,5};
        
        int x = 5;
        int count = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] == x){
                // System.out.println(arr[i]);
                count = count +1;
                
            }
        }
        System.out.println(count);

    }
    
}
