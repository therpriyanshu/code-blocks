import java.util.Arrays;

    public class BinarySearch {
        public static int search(int [] arr,int target){
            int i=0,j=arr.length-1;
            while(i<=j){
                int mid=(i+j)/2;
                if(arr[mid]==target){
                    return mid;
                }else if(arr[mid]>target){
                    j=mid-1;
                }else{
                    i=mid+1;
                }
        
            }
            return -1;
        }
    }
//lowerbound
    public static int lowerbound(int [] arr,int target){
        int i=0,j=arr.length-1;
        int ans = arr.length;
        while(i<=j){ 
            int mid=(i+j)/2; 
            if(arr[mid]<=target){  
                ans=mid;
                i=mid+1;
            }else{
                j=mid-1;
            }
        }
        return ans;
    }//upperbound
    public static int upperbound(int [] arr,int target){
        int i=0,j=arr.length-1;
        int ans = arr.length;
        while(i<=j){
            int mid=(i+j)/2;
            if(arr[mid]>target){
                ans=mid;
                j=mid-1;
            }else{
                i=mid+1;
            }
        }
        return ans;

    }
    public static void main(String [] args){
        int [] arr={1,3,9,11,3,6,12,16,9,7,6,20,8,16};
        Arrays.sort(arr);
        int ab=lowerbound(arr,5);
        int bc=upperbound(arr, 3);
        System.out.println(ab);
        System.out.println(bc);
        
    }
}
