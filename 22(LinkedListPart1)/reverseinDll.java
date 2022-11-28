public class reverseinDll {
    public class Node{
        int data;
        Node next;
        Node prev;
        public Node(int data){
            this.data=data;
            this.next=null;
            this.prev=null;
        }
    }
    public static Node head;
    public static Node tail;

    public void addfirst(int data){
        Node newnode= new Node(data);
        if(head==null){
            head=tail=newnode;
            return ;
        }
        //0->1->2
        newnode.next=head;
        head=newnode;
        head.prev=null;
    }
    public void print(){
        Node temp= head;
        while(temp!=null){
            System.out.print(temp.data+"<->");
            temp=temp.next;
        }
        System.out.println("null");
    }

    //method to reverse
    public void reverse(){
        Node curr=head;
        Node prev= null;
        Node next;

        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            curr.prev=next;
            prev=curr;
            curr=next;

        }
        head=prev;
    }
    public static void main(String[] args) {
        reverseinDll dll= new reverseinDll();
        dll.addfirst(4);
        dll.addfirst(3);
        dll.addfirst(2);
        dll.addfirst(1);
        dll.addfirst(0);
        dll.print();
        dll.reverse();
        dll.print();
    }
    
}
