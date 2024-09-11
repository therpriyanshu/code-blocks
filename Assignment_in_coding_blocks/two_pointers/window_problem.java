package Assignment_in_coding_blocks.two_pointers;

public class window_problem {
    int i=0,j =2;  
    while(j<arr.length){  
        int tempSum=findSum(arr,i,j);
        sum = Math.max(tempSum,sum);
        i++;j++;
    
    }
    System.out.println(sum)
}
