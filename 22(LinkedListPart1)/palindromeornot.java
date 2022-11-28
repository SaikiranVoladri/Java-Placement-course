public class palindromeornot {

    public class Node{
        int data;
        Node next;

        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    //head and tail creation
    public static Node head;
    public static Node tail;

    
    public static int size;

    //methods to add first or last
    public void addfirst(int data){
        Node newnode= new Node(data);
        size++;
        if(head==null){
            head=tail=newnode;
            return;
        }
        newnode.next=head;
        head=newnode;
    }

    public void addlast(int data){
        Node newnode= new Node(data);
        size++;
        if(head==null){
            head= tail= newnode;
            return;
        }
        tail.next=newnode;
       tail=newnode;
    }


    public static void print(){
        Node temp=head;
        if(head==null){
            System.out.println("empty");
            return;
        }
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }



public Node findmid(Node head){
    Node slow=head;
    Node fast=head;
    while(fast !=null && fast.next!=null){
        slow=slow.next;
        fast= fast.next.next;

    }
    return slow;

}
public boolean findpdrome(){
    if(head==null && head.next==null){
        return false;
    }
    //1 find mid
    Node mid=findmid(head);
    //2 reverse 2nd half
    Node prev=null;
    Node curr=mid;
    Node next;
    while(curr!=null){
        next=curr.next;
        curr.next=prev;
        prev=curr;
        curr=next;
    }
    Node right=prev;// 2nd half lastpart
    Node left=head;// 1st half firstpart

    //3 check 1st half==2nd half
    while(right!=null){
        if(left.data!=right.data){
            return false;
        }
        right=right.next;
        left=left.next;
    }
    return true;
}

public boolean isdprome(){
    if(head==null && head.next==null){
        return false;
    }
    //1 find mid
    Node mid=findmid(head);

    //2 rev 2nd half
    Node prev=null;
    Node curr=mid;
    Node next;
    while(curr!=null){
    next=curr.next;
    curr.next=prev;
    prev=curr;
    curr=next;}
    Node left=head;
    Node right=prev;
    //3 left=right
    
    while(right!=null){
        if(left.data!=right.data){
            return false;}
            left=left.next;
            right=right.next;
        
    }
    return true;
}
    //main
    public static void main(String[] args) {
       palindromeornot ll=new palindromeornot();
        ll.addfirst(2);       
        ll.addfirst(1);
        ll.addlast(2);        
        ll.addlast(1);        
        ll.print();
      System.out.println(ll.isdprome());
    }

}
