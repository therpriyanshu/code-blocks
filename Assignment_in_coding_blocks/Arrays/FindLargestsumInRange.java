package Assignment_in_coding_blocks.Arrays;

public class FindLargestsumInRange {
    public static int largestsumrange(int [] arr,int start,int end){
        int largest=arr[0];
        int sum=0;
        for(int i=start;i<end;i++){
            if(arr[i]>largest){
                largest=arr[i];
                sum=sum+largest;
            }else{
                System.out.println("out of bound");
            }
        }
        return sum;
    }
    public static void main(String[]args){
        int[] arr={2,2,3,5,7,4,7};
        System.out.println(largestsumrange(arr,2,5));
        

    }
    
}
