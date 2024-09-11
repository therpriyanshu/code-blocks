package Assignment_in_coding_blocks.Arrays;

public class find_element { 
    public static int searchele(int [] arr,int item){//Access Modifier 
        for(int i=0;i<arr.length;i++){
            if(arr[i]==item){ 
                return i; // why arr[i] will not come,Here we are denoting i for index
            }else{
                continue;
            }   
        }
        return item;
    } 
    public static void main(String [] args){ 
        int [] arr={2,3,4,5};
        //searchele(arr,5);
        System.out.println(searchele(arr,3));

    }
}
