package Assignment_in_coding_blocks.Sorting;

public class bubblesort {
    public static void swap(int [] arr,int i,int j){  
        int temp=arr[i]; 
        arr[i]=arr[j];  
        arr[j]=temp;   
    }  
    public static void bubblesort1(int [] arr){
        for(int turn=1;turn<arr.length;turn++){
            for(int i=0;i<arr.length-turn;i++){
                if(arr[i]>arr[i+1]){
                    swap(arr,i,i+1);
                }
            }
        }
    }
    public static void main(String [] args){
        int [] arr={2,6,3,8,7,4};
        bubblesort1(arr);
        for(int num:arr){
            System.out.print(num + " ");
        }    
    }
}
