package Assignment_in_coding_blocks.two_pointers;

public class rotate_array {                  //shift array by 2
    public static int shiftByOne(int [] arr){//(int [] arr,int d)
        int temp=arr[arr.length-1];          //int [] temp=new temp[d];
        for(int i=arr.length-1;i>0;i--){     //(for int i=0;i<d;i++)
            arr[i]=arr[i-1];                 //temp[i]=arr[i+(arr.length-d)]
        }                                    //for(int i=arr.length-1;i>=d;i++)
        return arr[0]=temp;
    }                                        //for(int i=0;i<d;i++)
    public static void main(String [] args){ //arr[i]=temp[i];  
        int [] arr={1,2,3,4,5};
        int ab=shiftByOne(arr);
        for(int num:arr){
            System.out.print(num + " ");
        }


    }
}
// This code belongs to shift by one 


