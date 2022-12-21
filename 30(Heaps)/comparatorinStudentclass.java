import java.util.*;
public class comparatorinStudentclass {
  static class student implements Comparable<student>{
    String name;
    int rank;

    student(String name, int rank){
        this.name= name;
        this.rank= rank;
          }
    @Override
    public int compareTo(student s2){
        return this.rank - s2.rank;
    }
 }

 public static void main(String[] args) {
    PriorityQueue<student> pq= new PriorityQueue<>();
    pq.add(new student("q", 25));
    pq.add(new student("d", 2));
    pq.add(new student("C", 2));
    pq.add(new student("A", 25));

    while(!pq.isEmpty()){
        System.out.println(pq.peek().name+"-->"+pq.peek().rank);
        pq.remove();
    }

 }

}
