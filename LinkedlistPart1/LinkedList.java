package LinkedlistPart1;

public class LinkedList {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;
     // add element to first

    public void addFirst(int data){
        Node newNode=new Node(data);
        if(head==null) {
            head=tail=null;
        }

        newNode.next=head;
        head=newNode;
    }
    // add last
    public void addLast(in)


    public static void main(String[] args) {
        LinkedList ll=new LinkedList();
        ll.addFirst(1);
        ll.addFirst(34);


    }
}
