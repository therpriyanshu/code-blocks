package Assignment_in_coding_blocks.Recursion;

public class reverseString {
    public static void reverse(String s,int i,String rev){
        if(i==s.length()){
            System.out.println(rev);
            return;
        }
        reverse(s, i+1, s.charAt(i)+rev);
    }
    public static void main(String [] args){
        reverse("Arpan",("Arpan").length()-1, " ");
    }
}
