package Assignment_in_coding_blocks.Arrays;

public class operation {
    public int operation(String[] operations){
        int ans=0;
        for(int i=0;i<operations.length;i++){
            if(operations[i].equals("++X") || operations[i].equals("X++")){
                ans = ans+1;
            }else if(operations[i].equals("++X") || operations[i].equals("X++")){
                ans = ans-1;
            }
        }
        return ans;
    }
    public static void main(String [] args){
        
    }
}
