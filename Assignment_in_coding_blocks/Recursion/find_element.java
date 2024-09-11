package Assignment_in_coding_blocks.Recursion;

public class find_element {
    public static int searchable(int [] rollList,int roll,int i){
        if(i==rollList.length) return -1;
        if(rollList[i]==roll) return i;
        return searchable(rollList, roll, i+1);

    }
}
