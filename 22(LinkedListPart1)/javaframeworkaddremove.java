
// import java.util.LinkedList;
import java.util.*;
public class javaframeworkaddremove {
    public static void main(String[] args) {
        LinkedList<Integer> ll= new LinkedList<>();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(3);
        System.out.println(ll);
        ll.addLast(2);
        ll.addLast(4);
        System.out.println(ll);
        ll.removeFirst();
        System.out.println(ll);
        ll.removeLast();
        System.out.println(ll);
        ll.add(1, 17);
        System.out.println(ll);
    }
    
}
