import java.util.Queue;
import java.util.LinkedList;
public class QueusingJCF {
    public static void main(String[] args) {
        Queue q= new LinkedList<>() ;
        q.add(1);
        q.add(2);
        q.add(3);

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
            
        }
    }
}
