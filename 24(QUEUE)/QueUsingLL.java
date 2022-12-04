import java.util.*;
public class QueUsingLL {
    static class Node{
        int data;
        Node next;
     Node(int data){
        this.data= data;
        this.next=null;
    
    }}
    static Node head=null;
    static Node tail=null;
    static class Queue{
       
        


        public static boolean isempty(){
            return head==null && tail==null;
        }

        public static void add(int data){
            Node newnode =new Node(data);
            if(head==null){
                head=tail=newnode;
                return;
            }
            tail.next=newnode;
            tail=newnode;
        }

        public static int remove(){
            if(isempty()){
                System.out.println("empty");
                return -1;
            }
            int front=head.data;
            if(tail==head){
                tail=head=null;
               
            }else{
           
            head=head.next;}
            return front;
        }

        public static int peek(){
            if(isempty()){
                System.out.println("empty");
                return -1;
            }
            return head.data;
        }

    }
    public static void main(String[] args) {
        Queue q= new Queue();
        q.add(1);
       
        q.add(2);
        q.add(2);
       
        while(!q.isempty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
    
}
