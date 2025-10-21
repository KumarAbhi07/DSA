package Linkedlist;

public class MergeSortInLinkedList {
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

    public void print(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"-->");
            temp=temp.next;
        }
        System.out.println("null");
    }


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
    private Node getMid(Node head){
        Node slow = head;
        Node fast =head.next;

        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    private Node merge(Node head1,Node head2){
        Node mergedLL=new Node(-1);
        Node temp=mergedLL;

        while(head1!=null && head2!=null){
            if(head1.data<=head2.data){
                temp.next=head1;
                head1=head1.next;
                temp=temp.next;
            }
            else{
                temp.next=head2;
                head2=head2.next;
                temp=temp.next;
            }
        }
        while(head1!=null){
            temp.next=head1;
            head1=head1.next;
            temp=temp.next;
        }
        while(head2!=null){
            temp.next=head2;
            head2=head2.next;
            temp=temp.next;
        }
        return mergedLL.next;
    }
    public Node mergesort(Node head){
        if(head==null||head.next==null){
            return head;
        }
        // find mid
        Node mid=getMid(head);

        //left & right mmergesort

        Node rightHead=mid.next;
        mid.next=null;

        Node newleft=mergesort(head);
        Node newright=mergesort(rightHead);

        return merge(newleft,newright);
    }

    public static void main(String[] args) {
        MergeSortInLinkedList ll=new MergeSortInLinkedList();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(9);
        ll.addFirst(7);
        ll.addFirst(4);
        ll.addFirst(5);
        ll.print();
        ll.head=ll.mergesort(ll.head);
        ll.print();
    }
}
