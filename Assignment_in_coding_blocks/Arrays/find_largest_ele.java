package Assignment_in_coding_blocks.Arrays;

public class find_largest_ele {
    public static int largestnum(int [] arr){
        int largest=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                largest=arr[i];
            }else{
                continue;
            }
        }
        return largest; //This line means whatever value we will get this line return the to the function.
    }
    public static void main(String [] args){
       int[]  arr2={2,3,4,19};
       largestnum(arr2);
        System.out.println(largestnum(arr2));

    }
}
