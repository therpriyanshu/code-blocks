package Assignment_in_coding_blocks.Recursion;

public class hii { 
    public static int factorial(int n){ //recursion is a way of writing code 
        if(n==1) return 1;
        int fact = n*factorial(n-1);
        return fact;  
    }
    public static void main(String[] args){ 
        int n=5;
        System.out.print(factorial(5));
    }
}
