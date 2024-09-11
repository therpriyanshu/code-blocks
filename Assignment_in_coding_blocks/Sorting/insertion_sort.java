package Assignment_in_coding_blocks.Sorting;

public class insertion_sort {
    public static void insertion_sort1(int [] arr){
        int n=arr.length;
        for(int i=1;i<n;i++){
            int key = arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>key){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }
    }
    public static void main(String [] args){
        int [] arr={5,3,2,8,1};
        insertion_sort1(arr);
        for(int num:arr){
            System.out.print(num + " ");
        }
    }
}
