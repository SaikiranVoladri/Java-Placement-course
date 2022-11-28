public class intersectionofLL {
   static class Node{
        int data;
        Node next;
         Node(int d){
            data=d;
            next=null;
        }
    }
    // method of intersection
    public Node getintersection(Node head1,Node head2){
        while(head2!=null){
             Node temp=head1;
             while(temp!=null){
                if(temp==head2){
                    return head2;
                }
                temp=temp.next;
             }
             head2=head2.next;
        }
        return null;
    }
    public static void main(String args[]){
        intersectionofLL ll=new intersectionofLL();
        Node head1,head2;
        head1= new Node(10);
        head2=new Node(3);
        Node newnode=new Node(6);
        head2.next=newnode;

        newnode = new Node(9);
        head2.next.next = newnode;
        newnode = new Node(16);
        head1.next = newnode;
        head2.next.next.next = newnode;
        newnode = new Node(30);
        head1.next.next = newnode;

        head1.next.next.next=null;
        Node intersection=ll.getintersection(head1, head2);
        if(intersection== null){
            System.out.println(" no intersection");
        }
        else{
            System.out.println("intersection found at "+intersection.data);
        }
    }
    
}
