package Assignment_in_coding_blocks.STRING;

public class reverse_string {
    public static void main(String[] args) {
        String input = "is sky of blue color";
        String[] words = input.split(" ");
        if (words.length != 5) {
            System.out.println("Input does not have exactly 5 words.");
            return;
        }
        String output = words[3] + " " + words[4] + " " + words[2] + " " + words[1] + " " + words[0];
        System.out.println(output);
    }
}
public static void reverse(String s){ 
    s.trim();
    String[] arr=s.split("\s+");
    String ans = " ";
    for(int i=arr.length-1;i>=0;i--){
        ans+=arr[i]+" ";
    }
    return ans.trim();

}
public static void main(String[] args){
    String [] s=["The class is very sleepy"];
    System.out.println(reverse(s));
}

/////
public class ReverseString { 
    public static void main(String[] args) {
        String original = "Hello, World!";
        char[] charArray = original.toCharArray();
        int left = 0, right = charArray.length - 1;
        while (left < right) {
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;
            left++;
            right--;
        }
        String reversed = new String(charArray);
        System.out.println("Reversed: " + reversed);
    }
}


