package Star_Pattern;

public class left_facing_invertTra {
    public static void main(String [] args) {
        int n=5;

            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    if (i == j || j == n - i + 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
    
    }
    } //ctrl+k+c;
    

