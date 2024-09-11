package Assignment_in_coding_blocks.Recursion;

public class subsequence {
    public static void subseq(String s, String ans){
        if(s.isEmpty()){
            System.out.println(ans);
            return;  
        }
            char ch=s.charAt(0);
            subseq(s.substring(1),ans+ch); 
            subseq(s.substring(1), ans); 
    }
    public static void main(String [] args){
        int n=5;    
        subseq("CART"," ");
    }

}
