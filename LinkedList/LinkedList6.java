public class LinkedList6 {

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
     
     public void print(){
        if(head == null){
            System.out.println("LL is empty");
            return;
        }
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }

        System.out.println("null");
     }
     

     public void add(int idx, int data){
        if(idx ==0){
            addFirst(data);
            return;
        }

        Node newNode = new Node(data);
        Node temp = head;

        int i = 0;

        while(i < idx-1){
            temp = temp.next;
            i++;
        }

        // i = idx-1 ;  temp -> prev

        newNode.next = temp.next;
        temp.next = newNode;
     }
     
     public static void main(String[] args){
             LinkedList6 ll = new LinkedList6();
            
            ll.addFirst(2);
          
            ll.addFirst(1);
      
            ll.addLast(3);
           
            ll.addLast(4);
            ll.add(2,9);

            ll.print();


     }
 }
 