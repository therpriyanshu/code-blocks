package Assignment_in_coding_blocks.Recursion;

public class leetcode34 {
    public static int [] searchable(int[] nums,int target){
        int left = findLeftBound(nums,target);
        int right = findRightBound(nums,target);

        return new int[] {left,right};
        
    }
    public static int findLeftBound (int [] nums,int target){
        int index = -1,low=0,high=nums.length-1; 

        while(low<=high){
            int mid=(low+high)/2; 
            if(nums[mid]==target){ 
                index = mid; 
                high=mid-1; 
            }
            else if(nums[mid]<target){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return index;
    }
    public static int findRightBound (int [] nums,int target){
        int index =-1,low=0,high=nums.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]==target){
                index=mid;
                low=mid+1;
            }else if(nums[mid]<target){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return index;
    }
    public static void main(String [] args){
        int [] nums={5,7,7,7,8,10};
        searchable(nums,7);
        System.out.println(searchable(nums,7));
        for(int i=0;i<nums.length;i++){
            System.out.println(nums);
        }
    }
}
