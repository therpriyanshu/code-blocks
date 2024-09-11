package Assignment_in_coding_blocks.Recursion;

public class checkcoins {
    public static void coinString(int n,String ans,chae prev){
        if(n==0){
            System.out.println(ans);
            return;
        }
        coinString(n-1, ans+"0", '0');
        if(prev!='1')(coinString(n-1, ans+"1", '1'));
    }
    
}
