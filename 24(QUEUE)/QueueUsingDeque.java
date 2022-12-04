import java.util.*;
public class QueueUsingDeque {
    static class Queue{
        Deque <Integer> dq= new LinkedList<>();
        // add method
        public  void add(int data){
            dq.addLast(data);
        }
        // remove method
        public int remove(){
            return dq.removeFirst();
        }
        // peek method
        public int peek(){
            return dq.getFirst();
        }
    }
    public static void main(String[] args) {
        Queue q= new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        System.out.println("peek -" +q.peek());
        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println(q.remove());
        

        
    }
    
}
