package Assignment_in_coding_blocks.Recursion;

public class bracket_pair {
    public static void gp(int n,int opening,int closing,String ans){
        if(opening == n && closing ==n){ 
            System.out.println(ans+" ");
            return;
        }
        if(opening>n||closing>opening){     
            return;  
        } 
        gp(n,opening+1,closing,ans+"(");  
        gp(n,opening,closing+1,ans+")");   
    }
    public static void main(String [] args){
        gp(3, 0, 0, " ");
    }

}


public void subsetsRec(int[] nums, List<Integer> current, List<List<Integer>> ans, int itr){
    //basse
    if(itr == nums.length){   
        ans.add(current);     
        return;
    }
    //go
    current.add(nums[itr])
    subsetsRec(nums,current,ans,itr+1);
    //not go
    current.remove(current.length - 1);
    subsetsRec(nums,current,ans,itr+1);
}
