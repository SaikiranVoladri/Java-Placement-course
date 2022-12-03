import java.util.*;

public class stackInLL {
    
  static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    static class stack{
         static Node head=null;

       public static boolean isempty(){
        return head==null;
       }
    // push
    public static void push(int data){
        Node newnode = new Node(data);
        // h1->2
        newnode.next=head;
        head=newnode;

    }
    //pop
    public int pop(){
        if(isempty()){
            return -1;
        }
        int top=head.data;
        head=head.next;
        return top;
    }
    //peek
    public int peek(){
        if(isempty()){
            return -1;
        }
        int top=head.data;
        return top;
    }

   }
 
     public static void main(String[] args) {
    stack s= new stack();
    s.push(1);
    s.push(2);
    s.push(3);
    while(!s.isempty()){
        System.out.println(s.peek());
        s.pop();
    }
  
    
  }
}
