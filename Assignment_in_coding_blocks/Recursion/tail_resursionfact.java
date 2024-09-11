package Assignment_in_coding_blocks.Recursion;

public class tail_resursionfact { 
    public static int fact(int n){
        int ans=1;
        for(int i=1;i<=n;i++){
            System.out.println(i);
            ans*=i;
        }
        return ans;
    }
    public static void main(String [] args){
        int n=5;
        int ab=fact(5); 
        System.out.println(ab);
    }
}   
