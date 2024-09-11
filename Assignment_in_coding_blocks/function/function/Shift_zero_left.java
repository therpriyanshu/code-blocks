package Assignment_in_coding_blocks.function.function;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Shift_zero_left {
    public static void main(String[] args) {
        int[] input = {6, 0, 8, 2, 3, 0, 4, 0, 1};
        int[] output = rearrangeArray(input);
        
        System.out.println(Arrays.toString(output));
    }

    public static int[] rearrangeArray(int[] input) {
        List<Integer> nonZeroList = new ArrayList<>();
        List<Integer> zeroList = new ArrayList<>();

        // Separate non-zero and zero elements
        for (int num : input) {
            if (num != 0) {
                nonZeroList.add(num);
            } else {
                zeroList.add(num);
            }
        }

        // Combine the lists
        nonZeroList.addAll(zeroList);

        // Convert the result to an array
        int[] result = new int[nonZeroList.size()];
        for (int i = 0; i < nonZeroList.size(); i++) {
            result[i] = nonZeroList.get(i);
        }

        return result;
    }
}
