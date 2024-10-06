class Bubble_sort {

    static void BubbleSort(int[] a) {
        int n = a.length;
        boolean swapped;  // Flag to track if a swap occurred

        for (int i = 0; i < n - 1; i++) {
            swapped = false;  // Initialize the flag as false at the start of each pass

            // Perform a pass through the unsorted portion of the array
            for (int j = 0; j < n - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    // Swap adjacent elements if they are in the wrong order
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;

                    swapped = true;  // Set the flag to true if a swap occurs
                }
            }

            // If no swaps were made, the array is already sorted, so exit early
            if (!swapped) {
                break;
            }
        }
    }

    public static void main(String args[]) {
        int[] a = {5, 3, 4, 2, 1};  // Example array
        // int[] a = {1,2,3,4};  // Example array


        BubbleSort(a);  // Sort the array

        // Print the sorted array
        for (int i : a) {
            System.out.print(i + " ");
        }
    }
}
