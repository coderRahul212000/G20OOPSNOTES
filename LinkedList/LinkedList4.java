public class LinkedList4 {

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

     public void addFirst(int data){
        //step1 -> create new node
        Node newNode = new Node(data);
        if(head == null){
            //case when linked list is empty
            head = tail = newNode;
            return;
        }

        // step2 
        newNode.next = head;
        head = newNode;
     }
     
     public void addLast(int data){
        Node newNode = new Node(data);

        if(head == null){
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        tail = newNode;
     }
     
     
     
     
     public static void main(String[] args){
             LinkedList4 ll = new LinkedList4();
            //  ll.head = new Node(1);
            //  ll.head.next = new Node(2);

            ll.addFirst(2);
            ll.addFirst(1);
            ll.addLast(3);
            ll.addLast(4);



     }
 }
 