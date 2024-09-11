package Assignment_in_coding_blocks.Arrays;

public class find_sum {
    public static float mean(int[] nums, int i) {
        if(i==0) return nums[i];

        return (mean(nums,i-1)*i+nums[i])/(float)(i+1);
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 1};
        System.out.println(nums,nums.length-1);  
    }
}
