package Assignment_in_coding_blocks.Arrays;

public class new_arr {
    public static void main(String[] args) {
        int [] nums={2,7,11,15};
        twoSum(nums,9);
        System.out.println(twoSum(nums,9));
        

    }
        public static int[] twoSum(int[] nums, int target) {
            int ans[] = new int[2];
    
            for(int i=0;i<nums.length;i++){
                for(int j=i+1;j<nums.length;j++){
                    if(nums[i]+nums[j]==target){
                        ans[0]=i; 
                        ans[1]=j; 
                        break;
                    }
                }
            
            }
            return ans;
       }
}


