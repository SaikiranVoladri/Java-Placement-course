import java.util.*
;
public class treeset {
    public static void main(String[] args) {
        TreeSet<Integer> ts= new TreeSet<>();
        ts.add(2);
        ts.add(9);
        ts.add(112);
        ts.add(6);
        System.out.println(ts);
        System.out.println(ts.size());
        ts.remove(2);
        System.out.println(ts.size());
    }
}
