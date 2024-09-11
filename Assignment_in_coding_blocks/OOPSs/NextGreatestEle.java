import java.util.Stack;

public class NextGreatestEle {
    int[] rightNge(int arr[]){
        int [] right=new int [arr.length];
        Stack<Integer> stk = new Stack<>();
        
        for(int i=arr.length-1;i>=0;i--){
            if(stk.isEmpty()){
                right[i]=-1;
            while(!stk.isEmpty()&& stk.peek()<arr[i]){
                stk.pop();
            stk.push(arr[i]);    
            }    
            return right;  
            }

            }
        }
    public static void main(String [] args){
        int [] arr={8,2,7,3,}
    }
    }

