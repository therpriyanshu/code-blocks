package Assignment_in_coding_blocks.Arrays;
public class checkitem {
    static void duplicate(int [] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    System.out.print(arr[i]);
                }
            }
        }
    }
    public static void main(String [] args){
        int [] arr={3,4,5,6,3};
        duplicate(arr);
    }
}
// this program is checking that duplicate element is on which index
