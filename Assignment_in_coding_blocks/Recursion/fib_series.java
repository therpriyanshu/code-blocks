package Assignment_in_coding_blocks.Recursion;

public class fib_series {
    public static int fibnacci(int n){  
        if(n==0 || n==1) return n;
        return fibnacci(n-1) + fibnacci(n-2);
    } 
    public static void  main(String [] args){      
        System.out.println(fibnacci(4));      
    } 
} 
