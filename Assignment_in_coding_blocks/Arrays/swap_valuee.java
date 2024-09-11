package Assignment_in_coding_blocks.Arrays;

import java.util.Scanner;

public class swap_valuee {
    public static int swap(int[] arr,int a,int b){
                int temp = arr[a];
                arr[a] = arr[b];
                return arr[b] = temp;

    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array");
        int size=sc.nextInt();

        int [] arr=new int[size];
        System.out.println("Enter the elements of an array");

        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        int ab=swap(arr,0,3);
        System.out.println("Array after printing");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }


    }
}
