//Problem:- Page has divide into chapter String [] books=[10,20,30,40]

import java.util.Arrays;

public class SearchSpace {
    public static boolean check(int [] arr,int pages,int s){
        int currStudent=1;
        int cSum=0;
        for(int i:arr){
            if(cSum+i<=pages){ 
                cSum+=i; 
            }else{
                currStudent++;
                if(currStudent>s||i>pages){
                    return false;
                }
                cSum=i;
            }
        }
        return true;
    }
    public static int space(int [] book,int s){
        int sum=0;
        int i=0;
        int ans =-1;
        int j=Arrays.stream(book).sum();
        while(i<=j){ 
            int mid=i+(j-i)/2;
                if(check(book, mid, s)){
                    ans = mid;
                    j=mid-1;
                }else{
                    i=mid+1;
                }
        
            }
        return ans;
    }
    public static void main(String [] args){
        int [] arr={10,20,30,40};
        space(arr, 2);
        System.out.println(space(arr, 2));
    }
    
        
}
