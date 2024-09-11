package Assignment_in_coding_blocks.Arrays;

public class findSumInRange {
    public static int sumrange(int[] arr, int start, int end) {
        int sum = 0;
      for (int i = start; i<end; i++) {
            sum += arr[i];
        }
        
        return sum;
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5, 6};
        //0 to n-1 
        int ab = sumrange(arr, 2, 4);
        System.out.println(ab);
    }
}
