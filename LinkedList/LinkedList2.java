public class LinkedList2 {

    public static class Node {
             int data;
             Node next;
 
             public Node(int data){
                 this.data = data;
                 this.next = null;
             }
     }

     public static Node head;
     public static Node tail;
     public static void main(String[] args){
             LinkedList2 ll = new LinkedList2();
             ll.head = new Node(1);
             ll.head.next = new Node(2);



     }
 }
 