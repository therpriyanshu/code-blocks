package Assignment_in_coding_blocks.Sorting;

public class selection_sort {
    public static void main(String [] args){
        int [] arr={2,3,4,8,6,1};
        selectionSort(arr);
        for(int num:arr){
            System.out.print(num + " ");
        }
    }
    public static void swap(int [] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void selectionSort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            int idx=minIdx(arr, i);
            swap(arr,i,idx); 
        }
    }
    public static int minIdx(int [] arr,int i){
        int minIndex = i;
        for(int j=i+1;j<arr.length;j++){
            if(arr[j]<arr[minIndex]){
                minIndex=j;
            }   
        }
        return minIndex;
    }
}
