import java.util.Comparator;
import java.util.PriorityQueue;
 static class printApriorityQueue{

    public static void main(String[] args) {
        PriorityQueue<Integer>pq= new PriorityQueue<>(Comparator.reverseOrder());// to print reverse order
        // pass the comparator.reverseorder() fxn in constructor
        pq.add(3);
        pq.add(5);
        pq.add(1);
        pq.add(7);

        // to print a priority queue

        while(!pq.isEmpty()){
            System.out.print(pq.peek());
            pq.remove();
        }
    }

}
