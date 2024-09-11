package Assignment_in_coding_blocks.OOPSs;

class node1{
    public class node{
        int data;
        node next;
    
        node(int d){
            this.data = d;
            this.next= null;
        }    
    }
    public class linkedL{
        node head;
        node tail;

        linkedL(){
            this.head = null;
            this.tail=null;
        }
        public void add(int data){
            node curr=new node(data);
            if(head==null){
                head=curr;
                tail=curr;
            }
            tail.next=curr;
            tail=curr;
        }
        public int remove(){
            node curr = tail;
            node gaurav = head;
            if(head == null) return -1;
            if(head.next==null){
                head= null;
                tail=null; 
            }
            while(gaurav.next.next != null){
                gaurav = gaurav.next;
            } 
            gaurav.next = null;
            tail=gaurav; 
            return curr.data; 
        }
        public int size(){
            int counter=0;
            if(head==null) return 0;
            node curr = head;
            while(curr==null){
                counter+=1;
                curr = curr.next;
            }
            return counter;
        }
        public void addFirst(int data){
            node front = new node(data);
            if(head==null){
                head=front;
                tail=front;
            }
            front.next = head;
            head = front;
        } 
        public void addLast(int data){
            node last = new node(data);
            if(tail==null){  
                head=last; 
                tail=last; 
            }
            last.next = tail;
            head = last;
        }
        public static void reverse(node head){
            if(head.next == null || head == null){
                return;   
            } 
            node prev;  
            node curr;
            node right; 

            prev=null;   
            curr=head;     
            right=head.next; 

            while(curr != null){ 
                curr.next = prev;
                prev = curr;
                curr = right; 
                right = curr.next; 
            }   
            head = curr;
        }
        public static int sum(){ 
            int sum=0;
            node curr=head;
            while(curr != null){
                sum+= curr.data;
                curr = curr.next;
            } 
            return sum;
        }
        public static int findl(int d){ 
            node curr=head;
            while(curr != null){
                if(curr.data == d) return 0;
                curr = curr.next;
            }
            return -1;
        }
    } 
    public static void main(String [] args){
        node1 ll = new node1();
        ll.addFirst(4);
        
    }   

}    

