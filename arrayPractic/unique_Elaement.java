public class unique_Elaement {
    static void unique_Elaements(int arr[]){
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
               if(arr[i] == arr[j]){
                arr[i] = -1;
                arr[j] = -1;
               }
            }
        }
        int ans = -1;
        for(int i=0; i<arr.length; i++){
            if(arr[i] > 0){
                ans = arr[i];
            }
        }
        System.out.println("unique element "+ans);
    }

    

    static int max_value(int arr[]){
        int max = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            for(int j=i; j<arr.length; j++){
                if(arr[i]>max){
                    max = arr[i];
                }
            }
        }
        return max;
        // System.out.println(max);
    }

    static int large_element_2nd(int arr[]){
        int max = max_value(arr);
        for(int i=0; i<arr.length; i++){
            if(arr[i] == max){
                arr[i] = Integer.MIN_VALUE;
            }
        }
        int Secound_max = max_value(arr);
        return Secound_max;
    }

    static int Repeating(int arr[]){
        int h = arr.length;
        for(int i=0; i<h; i++){
            for(int j=i+1; j<h; j++){
                if(arr[i] == arr[j]){
                    return arr[i];
                   }
            }
        }
        return -1;        
    }

    


    public static void main(String args[]){
        // int arr[] = {1,2,8,3,2};
        int arr[] = {1,2,3,3,2,5};


        // unique_Elaements(arr);
        // int max1 = max_value(arr);
        
        // int sd = large_element_2nd(arr);
        //  System.out.println(sd);
        // int r = Secound_rep(arr);
        

    }
}
