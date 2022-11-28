public class removefend{
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


public void removenthfromend(int n){
    int size=0;
    Node temp=head;
    while(temp!=null){
        temp=temp.next;
        size++;
    }
    if(n==size){
        head=head.next;
        return;
    }

    int i=1;
    int idxtofind=size-n;
    Node prev=head;
    while(i<idxtofind){
        prev=prev.next;
        i++;

    }
    prev.next=prev.next.next;
    return;
}

    //main
    public static void main(String[] args) {
       

        removefend ll = new removefend();
       
        
        ll.addfirst(2);       
        ll.addfirst(1);
        ll.addlast(2);        
        ll.addlast(1);        
        ll.print();  
        ll.removenthfromend(2);
        ll.print();
    //  
    

    
    }

}
