import java.util.*;
public class LinkedHashset {
    public static void main(String[] args) {
        
  
    LinkedHashSet<Integer>lhs= new LinkedHashSet<>();
    lhs.add(1);
    lhs.add(3);
    lhs.add(5);
    lhs.add(9);
    System.out.println(lhs);
    System.out.println(lhs.size());
    lhs.remove(5);
    System.out.println(lhs);

    
}
}