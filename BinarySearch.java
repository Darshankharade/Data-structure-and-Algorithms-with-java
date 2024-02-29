public class BinarySearch {

    // Recursive binary search method
    static int binarySearch(int[] arr, int low, int high, int key) {
        if (high >= low) {
            int mid = low + (high - low) / 2;

            // If the element is present at the middle
            if (arr[mid] == key)
                return mid;

            // If the element is smaller than the middle, then it can only be present in the left subarray
            if (arr[mid] > key)
                return binarySearch(arr, low, mid - 1, key);

            // Else the element can only be present in the right subarray
            return binarySearch(arr, mid + 1, high, key);
        }

        // If the element is not present in the array
        return -1;
    }

    // Main method to test binary search
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        int key = 12;
        int n = arr.length;
        int result = binarySearch(arr, 0, n - 1, key);
        if (result == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at index " + result);
    }
}
