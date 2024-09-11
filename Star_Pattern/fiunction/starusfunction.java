package Star_Pattern.fiunction;


public class starusfunction{
    public static void star(int n){
        int sum=0;
        for(int i=1;i<=n;i++){
            sum=i+1;
            System.out.println(sum);
        }
    }

    public static void main(String [] args){
        star(5);
    }
}
