package Assignment_in_coding_blocks.OOPSs;
import java.util.*;
public class node2 {
    class node{
        String data;
        node next;
        node(String data){
            this.data=data; //By default here we are storing data in place of data
            this.next=null;//suppose only one value is there thats why the next is null
        }
    }
    public void addFirst(String data){
        node newNode=new node(data); //storing the data into newNode
        if(head==null){
            head=newNode;
            return;
        }
        newNode.next=head;//here whatever value is in head that will go to next and head will store the value of new node
        head=newNode;

    }
    public static void main(String [] args){
        node2 List=new node2(); //creating the linkedlist

    }
}
