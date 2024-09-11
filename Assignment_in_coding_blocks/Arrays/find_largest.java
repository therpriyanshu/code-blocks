package Assignment_in_coding_blocks.Arrays;

public class find_largest {
    public static int largest(int[] roll){
        int largest=roll[0];
        int sum=0;
        for(int i=0;i<roll.length;i++){ 
            if(roll[i]>largest){
                largest = roll[i];
                sum+=roll[i];
                System.out.println(sum);
            }
            else{
                continue;
            }
        }
        return largest;
    }
    public static void main(String [] args){
        int [] largest1={2,1,4,5};
        largest(largest1);
        System.out.println(largest(largest1));


    }  //Pass by value  
      // Swap value usinng user inputn
}
