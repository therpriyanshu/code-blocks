import java.util.Arrays;

public class Aggressive_cow {
        public static int space(int [] arr,int cow){
        int maxValue=0;
        int i=1;
        int ans=-1;
        int j=Arrays.stream(arr).sum();
        while(i<=j){ 
            int mid=i+(j-i)/2;
                if(check(mid)){ 
                    ans = mid;
                    j=mid-1;
                }else{
                    i=mid+1;
                }
            }
        return ans;
    }
}
