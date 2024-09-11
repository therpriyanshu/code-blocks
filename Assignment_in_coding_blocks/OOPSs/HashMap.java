package Assignment_in_coding_blocks.OOPSs;
import java.util.Map;
public class HashMap {
    public static void main(String [] args){
        String arr[]={"Priyanshu","Hii","what"};

        //creating the hashmap for the above array
        Map<Integer,String> rollCall = new HashMap<>();

        for(int i=1;i<=arr.length;i++){
            rollCall.put(i,arr[i-1]);
        }
        System.out.println(arr);

        for(char i=0;i<arr.length;i++){
            rollCall.put((int)(97+i),arr[i]);
        }
}
}
