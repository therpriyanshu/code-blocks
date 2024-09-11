package Assignment_in_coding_blocks.Sorting;

import java.util.*;
class sort{
    public static void main(String [] args){
        int[] arr = {5, 3, 8, 4, 2};
        Arrays.sort(arr);
        int  smallestElement=arr[0];
        System.out.println("The smallest element is: " + smallestElement);
    }
}


//O(n)>O(log n)>O(n)>O(n log n)>O(n^2)>O(n^3)