package Assignment_in_coding_blocks.ARRAYLIST;

import java.util.ArrayList;
import java.util.Collections;

public class arraylist {
    public static void main(String [] args){
        //1.Syntax
        ArrayList<Integer> arr= new ArrayList<>(7);
        //Add an element
        arr.add(300);
        arr.add(0,40);
        //display element
        System.out.println(arr);
        //access an element
        int ab=arr.get(1);
        System.out.println(ab);
        //remove element
        int c=arr.remove(1);
        System.out.println(arr);
        arr.set(0,30);
        arr.set(0,arr.get(0)+10); //add a[0]+10 and again store into a[0]
        System.out.println(arr);
        //sorting
        Collections.sort(arr);



    }
}
