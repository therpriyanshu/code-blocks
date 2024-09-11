package Assignment_in_coding_blocks.Arrays;

public class chech_item {
    public static int searchRoll(int[] roll,int r){
        for(int i=0;i<roll.length;i++){
            if(roll[i]==r) return i;
        }
        return -1;
    }
    public static void main(String[] args){
        int[] rollNumbers = {1,2,3,4,5};
        searchRoll(rollNumbers,5);
        System.out.println(searchRoll(rollNumbers,1));
    }
    
}
