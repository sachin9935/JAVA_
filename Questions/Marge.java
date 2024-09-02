

public class Marge {
    // Merge function to merge two halves
    void marge(int[] a, int l, int mid, int r) {
        int i = l;
        int j = mid + 1;
        int k = l;
        int[] b = new int[a.length]; // Temporary array to hold merged elements

        while (i <= mid && j <= r) {
            if (a[i] < a[j]) {
                b[k] = a[i];
                i++;
            } else {
                b[k] = a[j];
                j++;
            }
            k++;
        }

        if (i > mid) {
            while (j <= r) {
                b[k] = a[j];
                k++;
                j++;
            }
        } else {
            while (i <= mid) {
                b[k] = a[i];
                k++;
                i++;
            }
        }

        // Copy the merged elements back to the original array
        for (k = l; k <= r; k++) {
            a[k] = b[k];
        }
    }

    // MergeSort function to divide the array and call merge function
    void Marge_short(int[] arr, int l, int r) {
        if (l < r) {
            int mid = (l + r) / 2;
            Marge_short(arr, l, mid);
            Marge_short(arr, mid + 1, r);
            marge(arr, l, mid, r);
        }
    }

    public static void main(String args[]) {
        int[] arr = {1,9,8,5,3,2,4,6};
       
        Marge sorter = new Marge();
        sorter.Marge_short(arr,0, arr.length - 1);

        // Print the sorted array
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
