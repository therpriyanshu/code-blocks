package Assignment_in_coding_blocks.Recursion;

public class power {
    public static int powerfunction(int x,int p){
        int power=1;
        for(int i=1;i<=p;i++){
            power *=x;
        }    
        return power;
    }   
    public static void main(String [] args){
        powerfunction(2, 3);
        System.out.println(powerfunction(2, 3));
    }
}
