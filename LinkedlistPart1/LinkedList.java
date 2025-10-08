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
            head=tail=newNode;
            return;
        }

        newNode.next=head;
        head=newNode;
    }
    // add last
    public void addLast(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=tail=newNode;
            return;
        }
        tail.next=newNode;
        tail=newNode;

    }
    //print linkedlist
    public void print(){
        if(head==null){
            System.out.println("ll is empty");
            return;
        }
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }


    public static void main(String[] args) {
        LinkedList ll=new LinkedList();
        ll.print();
        ll.addFirst(1);
        ll.print();
        ll.addFirst(34);
        ll.print();
        ll.addLast(5);
        ll.addLast(45);
        ll.print();



    }
}

