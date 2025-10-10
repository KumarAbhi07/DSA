package LinkedlistPart1;

public class LinkedListBasic {
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
   public static int size;

   public void addFirst(int data){
       Node newnode =new Node(data);
       size++;
       if(head==null){
           head=tail=newnode;
           return;
       }
       newnode.next=head;
       head=newnode;
   }
   public void addLast(int data){
       Node newNode=new Node(data);
       size++;
       if(head==null){
           head=tail=newNode;
           return;
       }
       tail.next=newNode;
       tail=newNode;

   }
   public void print(){
       Node temp=head;
       while(temp!=null){
           System.out.print(temp.data+"-->");
           temp=temp.next;
       }
       System.out.println("null");
   }
   public void add(int idx,int data){
       Node newNode=new Node(data);
       size++;
       if(head==null){
           addFirst(data);
           return;
       }
       Node temp=head;
       int i=0;
       while(i<idx-1){
           temp=temp.next;
           i++;
       }

       newNode.next=temp.next;
       temp.next=newNode;


   }
   public int removeFirst(){
       if(size==0){
           System.out.println("ll is empty");
           return Integer.MIN_VALUE;
       }
       else if(size==1){
           int val = head.data;
           size=0;
           head=tail=null;
           return val;
       }
       int val=head.data;
       head=head.next;
       size--;
       return val;
   }
    public int removeLast(){
        if(size==0){
            System.out.println("ll is empty");
            return Integer.MIN_VALUE;
        }
        else if(size==1){
            int val = head.data;
            size=0;
            head=tail=null;
            return val;
        }
        Node prev = head;
        for(int i=0;i<size-2;i++){
            prev=prev.next;
        }
        int val=prev.next.data;
        prev.next=null;
        tail=prev;
        size--;
        return val;
    }

    public static void main(String[] args) {
        LinkedListBasic  list = new LinkedListBasic();
        list.addFirst(10);
        list.addFirst(20);
        list.addLast(100);
        list.print();
        list.add(1,30);
        list.print();

    }

}

