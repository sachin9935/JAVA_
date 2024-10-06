class selectionSort {

    static void Selection_sort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int max_index = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[max_index]) {
                    max_index = j;
                }
            }
            // swap the elements
            int temp = arr[i];
            arr[i] = arr[max_index];
            arr[max_index] = temp;

        }
    }

    public static void main(String args[]) {
        int arr[] = { 5, 4, 3, 2, 1 };
        Selection_sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
    }
}