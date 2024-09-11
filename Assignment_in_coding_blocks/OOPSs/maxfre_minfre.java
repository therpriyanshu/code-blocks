package Assignment_in_coding_blocks.OOPSs;

import java.util.HashMap;
import java.util.Map;
import java.util.*;

public class maxfre_minfre {
    static void countFrequency(int []arr){
        Map <Integer, Integer> map= new HashMap<>();
        for(int i=0; i<arr.length; i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }
            else{
                map.put(arr[i],1);
            }
        }
           System.out.println(map);
           int maxFreq = Integer.MIN_VALUE;
           int minFreq = Integer.MAX_VALUE;
           int maxFreqElement = -1; 
           int minFreqElement = -1; 
   
           
           for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
               int element = entry.getKey(); 
               int frequency = entry.getValue();
               if (frequency > maxFreq) {
                   maxFreq = frequency;
                   maxFreqElement = element;
               }
               if (frequency < minFreq) {
                   minFreq = frequency;
                   minFreqElement = element;
               } 
           }
           System.out.println("Element with maximum frequency: " + maxFreqElement + " (Frequency: " + maxFreq + ")");
           System.out.println("Element with minimum frequency: " + minFreqElement + " (Frequency: " + minFreq + ")");
    }
    public static void main(String[] args) {
        int myArr[]={1,2,1,3,2,2,4,4,5,5,5,2};
        countFrequency(myArr);    
    }
    
}