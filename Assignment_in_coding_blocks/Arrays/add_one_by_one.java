package Assignment_in_coding_blocks.Arrays;

public class add_one_by_one {
    public static int[] addt(int [] nums){
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i]; 
            int ans=sum; 
            System.out.print(ans+" ");
        } 
        return nums; 
    }     public static void main(String [] args){
        int [] nums={1,2,3,4}; 
        addt(nums);

    }
}
