public class zigzaginll {
    public class Node{
        int data;
        Node next;
        public Node( int data){
            this.next=null;
            this.data=data;
        }
    }
    public static Node head;
    public static Node tail;

    public void addlast(int data){
        Node newnode= new Node(data);
        if(head==null&& tail==null){
            head=tail=newnode;
            return;
        }
        tail.next=newnode;
        tail=newnode;
    }
    public void print(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
            
        }
        System.out.println();

    }
    public void zigzag(){
        // mid
        Node slow=head;
        Node fast=head.next;
        while(fast!=null&& fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        Node mid=slow;
        Node curr=mid.next;
        mid.next=null;
        Node prev=null;
        Node next;
        //reverse
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        Node left=head;
        Node right=prev;
        Node nextL,nextR;
        //alternate merge
        while(left!=null && right!=null){
            nextL=left.next;
            left.next=right;
            nextR=right.next;
            right.next=nextL;

            left=nextL;
            right=nextR;
        }
        
    }
    public static void main(String[] args) {
        zigzaginll ll= new zigzaginll();
        ll.addlast(0);
        ll.addlast(1);
        ll.addlast(2);
        ll.addlast(3);
        ll.addlast(4);
        ll.addlast(5);
        ll.addlast(6);
        ll.print();
        ll.zigzag();
        ll.print();
    }

}
