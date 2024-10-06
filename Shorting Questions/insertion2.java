public class insertion2 {
    static void insertion_short(int arr[]){
        int n = arr.length;
        for(int i=1; i<n; i++){
            int j=i;
            while(j>0 && arr[j]<arr[j-1]){
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
            }
        }
    }
    public static void main(String[] args) {
        int array[] = {5,4,3,2,1};
        insertion_short(array);
        for(int val:array){
            System.out.println(val+" ");
        }
    }
}
