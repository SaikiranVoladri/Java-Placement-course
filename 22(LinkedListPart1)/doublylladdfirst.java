 class doublylladdfirst{
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
    public static int size;

    public void addfirst(int data){
        Node newnode= new Node(data);// creation
        size++;
        if(head==null){
            head=tail=newnode;
            return;
        }
        // . 1->2->3
        newnode.next=head;
        // head=newnode;
        // head.prev=null;
        //or
        head.prev=newnode;
        head=newnode;

    }
   public int removefirst(){
    
    if(head==null){
       System.out.println("empty");
        return -1;
    }
    if(size==1){
        int val= head.data;
        head=tail=null;
        size--;
        return val;

    }
   int val=head.data;
   head= head.next;
   head.prev=null;
   size--;
   return val;


   }

    public void addlast(int data){
        Node newnode=new Node(data);
        size++;
        if(head==null){
            head=tail=newnode;
        }
        tail.next=newnode;
        tail=newnode;
        newnode.next=null;
    }


    public int removelast(){
        if(size==0){
        System.out.println("empty");
        return-1;
        }

        if(size==1){
            int val=head.data;
            head=tail=null;
            size=0;
            return val;
        }
        Node prev=head;
        for(int i=0;i<size-2;i++){
            prev=prev.next;
        }
        int val=prev.next.data;// tail.data
        prev.next=null;
        tail=prev;
        size--;
        return val;


    }
    public void print(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        doublylladdfirst dll= new doublylladdfirst();
        dll.addfirst(3);
        dll.addfirst(2);
        dll.addfirst(1);
        dll.print();
        dll.removefirst();
        dll.print();
        dll.addlast(4);
        dll.print();
        dll.removelast();
        dll.print();


    }
 }