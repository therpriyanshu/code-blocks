class test{
    public static void main(String args[]){
        stack stk= new stack();
        System.out.println(stk.isEmpty());

        stk.insert(1);
        stk.insert(2);
        stk.insert(3);
        stk.remove();
        stk.insert(4);
        
        System.out.println(stk.peek());
        stk.insert(5);
        // stk.insert(1);        
        stk.display();
        System.out.println(stk.size());
        System.out.println(stk.isEmpty());
    }
}

class Solution {
    public boolean isValid(String s) {
        Stack<Character> gaurav = new Stack<>();
        int lgth = s.length();
        for(int i=0;i<lgth;i++){
            char current = s.charAt(i);
            if(current == '(' || current == '{'||current == '['){
                gaurav.push(current);
            }
            else{
                    if(gaurav.isEmpty())return false; //for edge case "}"
                    char compliment = gaurav.pop(); 
                    if(current == '('){
                        if(compliment == ')') continue;
                        else return false;
                    }
                    else if(current == '{'){
                        if(compliment == '}') continue;
                        else return false;
                        }
                    else if(current == '['){
                        if(compliment == ']') continue;
                        else return false;
                    }
                }
            }
        if(!gaurav.isEmpty()) return false; //for edge case "{"
        return true;
    }
}
