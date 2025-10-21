package Linkedlist;

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
    //search in linkedList
    public int iterSearch(int key){
       Node temp=head;
       int i=0;
       while(temp!=null){
           if(temp.data==key){
               return i;
           }
           temp=temp.next;
           i++;
       }
       return -1;
    }
    //search recursively
    public int helper (Node head, int key){
       if(head==null){
           return -1;
       }
       if(head.data==key){
           return 0;
       }
       int idx=helper(head.next,key);
       if(idx==-1){
           return -1;
       }
       return idx+1;
    }
    public int recsearch(int key){
       return helper(head,key);
    }

    // Reverse a LinkedList
    public void reverse(){
       Node prev =null;
       Node curr=head;
       Node next;
       while (curr!=null){
           next=curr.next;
           curr.next=prev;
           prev=curr;
           curr=next;
       }
       head=prev;
    }
    //find and deleteNthNode from the end
    public void deleteNthNodefromEnd(int n){
       int sz=0;
       Node temp=head;
       while(temp!=null){
           temp=temp.next;
           sz++;
       }
       if(n==sz){
           head=head.next;
           return;
       }
       int i=1;
       int itoFind=sz-n;
       Node prev=head;
       while(i<itoFind){
            prev =prev.next;
            i++;
       }
       prev.next=prev.next.next;
    }
    //check if LL is palindrome
    public Node findMid(Node head){
       Node slow=head;
       Node fast=head;
       while(fast!=null&&fast.next!=null){
           slow=slow.next;
           fast=fast.next.next;
       }
       return slow;
    }
    public boolean checkpalindrome(){
       if(head==null||head.next==null){
           return true;
       }
       Node mid=findMid(head);
       //reverse 2nd half
        Node prev=null;
        Node curr=mid.next;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        Node right =prev;
        Node left=mid.next;
        boolean bool= true;
        while(right!=null){
            if(left.data!=right.data){
                bool=false;
                break;
            }
            left=left.next;
            right=right.next;
        }
        return true;



    }


    public static void main(String[] args) {
        LinkedListBasic  list = new LinkedListBasic();
        list.addFirst(10);
        list.addFirst(20);
        list.addLast(100);
        list.addLast(2);
        list.addLast(7);
        list.addLast(8);
        list.addLast(9);
        list.addLast(8);
        list.print();
        list.add(1,30);
        list.print();
        System.out.println(list.iterSearch(8));
        System.out.println(list.recsearch(8));
        list.reverse();
        list.print();
        list.deleteNthNodefromEnd(2);
        list.print();
        System.out.println(list.checkpalindrome());
        LinkedListBasic ll=new LinkedListBasic();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(2);
        ll.addLast(1);

        System.out.println(ll.checkpalindrome());

    }


}

