public class linkedlist {

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
    public static int size;

    public void addfirst(int data){
        Node newnode= new Node(data);
        size++;
        if(head==null){
            head= tail= newnode;
            return;
        }
      
        newnode.next=head;
        head= newnode;

        // node creation 
        // newnodes next=head
        // head= newnode
    }


    public void addlast( int data){
        //create
        Node newnode= new Node(data);
        size++;
        if(head==null){
            head= tail= newnode;
            return;
        }
        tail.next=newnode;
        tail= newnode;
    }

    public void print(){
        Node temp= head;
        while(temp!=null){
            System.out.print(temp.data+"-->");
            temp= temp.next;
        }
        System.out.println("null");
    }


    public void addinmiddle(int idx, int data){
        if(idx==0){
            addfirst(data);
            return ;
        }

        Node newnode= new Node(data);

        size++;
        Node temp= head;
        int i=0;
        while(i<idx-1){
            temp=temp.next;
            i++;
        }
        // now we are at prev===temp

        newnode.next= temp.next;
        temp.next=newnode;
    }


    public int removefirst(){
        if(size==0){
            System.out.println("empty");
            return -1;
        }
        else if(size==1){
            head=tail=null;
            size=0;
        }
        int val= head.data;
        size--;
        head=head.next;
        return val;
    }

    public int search(int key ){
        int i=0;
        Node temp=head;
        while(temp!=null){
            if(temp.data==key){
                return i;
            }
            i++;
            temp=temp.next;
        }
        return -1;
    }

        public  int searcch(Node head, int n){
            if(head==null){
                return -1;
            }
            if(head.data==n){
                return 0;
            }
            int idx=searcch(head.next, n);
            if(idx==-1){
                return -1;
            }
            return idx+1;
        }
    public  int recsearch(int n){
        return searcch(head , n);
    }


    public  void reverse(){
        // three variables  four steps
        Node prev=null;
        Node curr=tail=head;
        Node next;
        while(curr!=null){
            next= curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        } 
        head=prev;
    }



    public  void removefromend(int n){
        int siz=0;
        Node temp=head;
        while(temp!=null){
            temp=temp.next;
            siz++;
        }
        if(n==size){
            head=head.next;
            return;
        }
        int i=1;
        int iton=siz-n;
        Node prev=head;
        while(i<iton){
            prev=prev.next;
            i++;
        }
        prev.next=prev.next.next;
       
    }

    public Node mid(Node head){
        Node slow= head;
        Node fast= head;
        while(fast!=null && fast.next!=null){
            slow= slow.next;
            fast=fast.next.next;
        }
        return slow;
    }

    public boolean ispdrome(){
        if(head==null|| head.next==null){
            return true;
        }
        // find mis 
        Node midval=mid(head);
          // reverse 2nd half
        Node prev=null;
        Node curr= midval;
        Node next;
        while(curr!=null){
            next= curr.next;
            curr.next= prev;
            prev=curr;
            curr=next;
        }
        Node right=prev;
        Node left=head;

        
        // left.data== right.data

        while(right!=null){
            if(left.data!=right.data){
                return false;
            }
            left=left.next;
            right = right.next;
        }
        return true;
    }
    public static  void main(String[] args) {
        
        linkedlist ll= new linkedlist();
      
        ll.addfirst(1);
        // ll.addfirst(2); 
        // ll.addfirst(1);  
        // //  ll.addfirst(10);
        // ll.addlast(2);
        // ll.addlast(1); 
       
       

        // ll.addlast(4);
        // ll.print();
        // ll.removefromend(3);
        ll.print(); 
       System.out.println(ll.ispdrome());
        // ll.addinmiddle(0, 10); 
        // ll.addinmiddle(3, 11);
    
     

    
    }
}
