import java.util.*;
public class detectAcycle {
    public class Node{
        int data;
        Node next;

        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
   // public static Node head;
    //public static Node tail;
    //public void addfirst(int data){
        Node newnode= new Node(data);
        if(head==null){
            head=tail=newnode;
        }
        newnode.next=head;
        head=newnode;
       
    }
    
public static boolean iscyclic(){
    Node slow=head;
    Node fast=head;
    boolean flag=false;
    while(fast!=null&&fast.next!=null){
        slow=slow.next;
        fast=fast.next.next;
        if(slow==fast){
            flag=true;
            break;
        }

    }
    return flag;

}
public static  boolean removecycle(){
    Node slow=head;
    boolean flag=false;
    Node fast=head;
   
    while(fast!=null&&fast.next!=null){
        slow=slow.next;
        fast=fast.next.next;
        if(slow==fast){
            flag=true;
            break;
        }
    }
    if(flag==false){
        return false;
    }
    
    slow=head;
    Node prev=null;
    while(slow != fast){
        prev=fast;
        slow=slow.next;
        fast=fast.next;
    }
    prev.next=null;
  
return false;
    
}
public static void main(String[] args) {
    detectAcycle ll= new detectAcycle();
    ll.addfirst(3);
    ll.addfirst(2);
    ll.addfirst(3);
    ll.addfirst(1);
    ll.addfirst(0);
    ll.head.next.next.next=head.next;
    ll.iscyclic();
    System.out.println(ll.iscyclic()); 
    ll.removecycle();
    System.out.println(ll.removecycle());
   
  

}

}
