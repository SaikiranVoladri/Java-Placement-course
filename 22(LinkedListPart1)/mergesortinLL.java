public class mergesortinLL {
    public class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;
    public void addfirst(int data){
        Node newnode=new Node(data);
        if(head==null&&tail==null){
            head=tail=newnode;
            return;
        }
        newnode.next=head;
        head=newnode;
    }
    public void print(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp= temp.next;
        }
        System.out.println("null");
    }
    public Node getmid(Node head){
        Node slow=head;
        Node fast=head.next;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public Node merge(Node head1,Node head2){
        Node mergedll=new Node(-1);
        Node temp= mergedll;
        while(head1!=null && head2!=null){
            if(head1.data<=head2.data){
                temp.next=head1;
                head1=head1.next;
                temp=temp.next;
            }else{
                temp.next=head2;
                head2=head2.next;
                temp=temp.next;
            }}
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
        
        return mergedll.next;

    }
    public Node mergesort(Node head){
        if(head==null ||head.next==null){
            return head;
        }
        //find mid
        Node mid= getmid( head);
        //get left , right
        Node righthead=mid.next;
        mid.next=null;
        //merge
        Node  newleft=mergesort(head);
        Node newright=mergesort(righthead);
        return  merge(newleft,newright);

    }

  public static void main(String[] args) {
    mergesortinLL ll= new mergesortinLL();
    ll.addfirst(1);
    ll.addfirst(2);
    ll.addfirst(3);
    ll.print();
    ll.head=ll.mergesort(head);
    ll.print();
  }

    
}
