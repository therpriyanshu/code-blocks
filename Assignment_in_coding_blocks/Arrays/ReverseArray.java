package Assignment_in_coding_blocks.Arrays;

public class ReverseArray {
    public static void reverse(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            // Swap arr[start] and arr[end]
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            // Move the pointers
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] arr2 = {2, 3, 4, 19};
        reverse(arr2);
        // Print the reversed array
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
    }
}
