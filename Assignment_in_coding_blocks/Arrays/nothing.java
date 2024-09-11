package Assignment_in_coding_blocks.Arrays;

public class nothing {
    // Method to find the largest number in the specified range and return its value as the sum
    public static int sumOfLargestInRange(int[] arr, int start, int end) {
        // Ensure the start and end indices are within the array bounds
        if (start < 0 || end >= arr.length || start > end) {
            System.out.println("Invalid range");
            return 0;
        }

        int largest = arr[start];
        for (int i = start; i <= end; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        
        return largest;
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5, 6};
        int start = 2;
        int end = 4;

        // Find the sum of the largest number in the specified range
        int largestSum = sumOfLargestInRange(arr, start, end);
        System.out.println("Sum of the largest number in the range: " + largestSum);
    }
}
