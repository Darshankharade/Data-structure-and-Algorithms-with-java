public class LinearSearch {

    // Method to perform linear search
    public static int linearSearch(int[] array, int key) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                return i; // Return the index of the key if found
            }
        }
        return -1; // Return -1 if key is not found in the array
    }

    // Main method to test the linear search
    public static void main(String[] args) {
        int[] array = {12, 45, 7, 23, 56, 89, 43};
        int key = 23;

        int index = linearSearch(array, key);

        if (index != -1) {
            System.out.println("Element " + key + " found at index " + index);
        } else {
            System.out.println("Element " + key + " not found in the array");
        }
    }
}
