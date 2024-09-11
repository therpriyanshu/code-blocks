package Assignment_in_coding_blocks.ARRAYLIST;
import java.util.*;

public class questionone {

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array");
        int size=sc.nextInt();

        int [] arr=new int[size];
        System.out.println("Enter the elements of an array");
        int sum=0;
       // Collections.sort(arr);
       for(int i=0;i<arr.length;i++){
        sum+=arr[i];
       }
       System.out.println(sum);
       System.out.println(arr.get(0));
       

    }
}    

