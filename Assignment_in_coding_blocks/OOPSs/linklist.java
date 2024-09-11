package Assignment_in_coding_blocks.OOPSs;
import java.util.*;
public class linklist {
    public static void main(String [] args){ 
        LinkedList<Integer> ll = new LinkedList<>(); 
        ll.add(10);
        ll.add(11);
        ll.add(0,30);
        ll.addFirst(20);
        ll.remove(); //it remove first element of an linkedlist
        ll.add(10);
        ll.removeLast();

        //get first,get last

        System.out.println(ll.getFirst());
        System.out.println(ll.getLast());
        System.out.println(ll);
        ll.add(1,45);
        //ll.clear(); 
        //contain means value is present or not
        System.out.println(ll.contains(10));
        System.out.println(ll);
        System.out.println(ll.get(2)); //it give lement from index 2
        System.out.println(ll.indexOf(45)); //in which index this value is present
        System.out.println(ll.size());0
    }
}
