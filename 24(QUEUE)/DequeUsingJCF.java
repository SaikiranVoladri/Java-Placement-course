import java.util.*;
public class DequeUsingJCF {
    public static void main(String args[]){
        Deque<Integer> dq= new LinkedList<>();
        dq.addFirst(3);
        dq.addFirst(2);
        dq.addFirst(1);
        dq.addLast(4);  
        System.out.println(dq);
        dq.removeLast();
        System.out.println(dq);
        dq.removeFirst();
        System.out.println(dq);
        System.out.println("First el =" +dq.getFirst());
        System.out.println("last el =" +dq.getLast());
      }
    
}
