package Assignment_in_coding_blocks.Recursion;

public class decending {
    public static void asc(int n){ 
        if(n==0) return;
        System.out.println(n);
        asc(n-1);
        

        //base case
        //if(i==n) return;
        //operation
        //System.out.println(i);
        //function call
        //asc(n, i+1);
          
    }

    public static void main(String [] args){
        asc(4);
        // System.out.println(asc(4, 0));
    }
}
