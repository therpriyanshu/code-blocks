package Assignment_in_coding_blocks.Arrays;

public class temp_array {
    public static void findLast(int [] arr,int key){
        int idx = -1;
        for(int i=0;i<arr.length;i++){
            if(key==arr[i]){
                idx = i;
            }
        }
        System.out.println(idx); 
        return;
    }
    public static void main(String [] args){ 
        int [] arr={2,3,4,5,3,8,3};
        System.out.println(findLast(arr,3));
    }
}
//print all index and 2.reverse number 3.find last index of given number
//fing sum 2.find number 3.find largest