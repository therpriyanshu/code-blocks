package Assignment_in_coding_blocks.OOPSs;

import java.util.Map;

public class Hashcount_frequency {
    public static void count(int [] arr){
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }else{
                map.put(arr[i],1);
            }
        }
    }
    public static void display(Map<Integer,Integer> map){
        map.forEach(key,value)->{
            System.out.println(key+" "+value);
        }
    }
}
