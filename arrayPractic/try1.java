public class try1 {
    static void sum_of_pair(int arr[],int x/*thrget */){
        int count = 0;
        for(int i=0; i<arr.length; i++){       //row
            for(int j=i+1; j<arr.length; j++){    //col
                if(arr[i]+arr[j]==x){
                    count++; 
                }
            }
        }
        System.out.println(count);
    }+

    static void sum_pair_3(int arr[],int x){
        int count1 = 0;
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                for(int k=j+1; k<arr.length; k++){
                    if(arr[i]+arr[j]+arr[k]==x){
                        count1++;
                    }

                }
            }
        }
        System.out.println(count1);
    }

    public static void main(String args[]){
        int arr[] = {4,6,3,5,8,2};

        // sum_of_pair(arr,7);
        sum_pair_3(arr,12);


       
    }
}
