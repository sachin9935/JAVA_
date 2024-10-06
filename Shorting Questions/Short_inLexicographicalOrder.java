public class Short_inLexicographicalOrder {

    static void Short_Fruits(String[] arr) {
        int size = arr.length;
        for (int i = 0; i < size - 1; i++) {
            int max_indix = i;
            for (int j = i + 1; j < size; j++) {
                if (arr[j].compareTo(arr[max_indix]) < 0) {
                    max_indix = j;
                }
            }
            String temp = arr[i];
            arr[i] = arr[max_indix];
            arr[max_indix] = temp;
        }
    }

    public static void main(String args[]) {
        String arr[] = { "papaya", "lime", "watermelon", "apple", "mango" };
        Short_Fruits(arr);
        for(String val: arr){
            System.out.print(val +" ");
        }
    }
}
