package Assignment_in_coding_blocks.Recursion;

public class fibonacci_series {
    static void generateFibonacci(int n) {
        if (n <= 0) {
            System.out.println("Please enter a positive integer.");
            return;
        }

        int a = 0, b = 1;
    
        System.out.print("Fibonacci Series: " + a);
        for (int i = 1; i < n; i++) {
            System.out.print(", " + b);  
            int next = a + b;  
            a = b;  
            b = next;  
        }

        System.out.println();
    }

    public static void main(String[] args) {
        int terms = 10;  
        generateFibonacci(terms);  
    }
}