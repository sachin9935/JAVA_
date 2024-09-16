import java.util.ArrayList;

public class Search_in_array {

    // Search the target element in array
    static boolean Search(int arr[], int n, int target, int idx) {
        if (idx >= n) return false;
        if (arr[idx] == target) return true;
        return Search(arr, n, target, idx + 1);
    }

    // Return the target element index, where you find the element
    static int FindIndex(int arr[], int n, int target, int idx) {
        if (idx >= n) return -1;
        if (arr[idx] == target) return idx;
        return FindIndex(arr, n, target, idx + 1);
    }

    // Find all the indices of the same element in array
    static void FindIndex_arr(int arr[], int n, int target, int idx) {
        if (idx >= n) return;
        if (arr[idx] == target) {
            System.out.println(idx);
        }
        FindIndex_arr(arr, n, target, idx + 1);
    }

    // Return all indices of the target element in array as an ArrayList
    static ArrayList<Integer> allindices(int arr[], int n, int target, int idx) {
        if (idx >= n) {
            return new ArrayList<>();
        }
        ArrayList<Integer> ans = new ArrayList<>();
        if (arr[idx] == target) {
            ans.add(idx);
        }
        ArrayList<Integer> smallAns = allindices(arr, n, target, idx + 1);
        ans.addAll(smallAns);
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 3};
        int target = 3;

        int n = arr.length;
        // Print all indices of the target element
        FindIndex_arr(arr, n, target, 0);

        // Example usage of allindices method
        ArrayList<Integer> indices = allindices(arr, n, target, 0);
        System.out.println("All indices: " + indices);

        // Uncomment to use Search or FindIndex functions
        // if (Search(arr, n, target, 0)) {
        //     System.out.println("Found");
        // } else {
        //     System.out.println("Not Found");
        // }

        // System.out.println("Index of element: " + FindIndex(arr, n, target, 0));
    }
}
