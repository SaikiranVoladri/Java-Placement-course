import java.util.*;

public class knearest {
    static class pts implements Comparable<pts>{
        int x;
        int y;
        int sqr;
        int idx;
        public pts(int x, int y,int sqr,int idx){
            this.x= x;
            this.y=y;
            this.sqr= sqr;
            this.idx=idx;
        }
    
    @Override
    public int compareTo(pts p2){
        return this.sqr- p2.sqr;
    }
    }

    public static void main(String[] args) {
        int pts[][]= {{3,3},{5,-1},{-2,4}};
        int k=2;
        PriorityQueue<pts> pq= new PriorityQueue<>();
        for(int i=0;i<pts.length;i++){
            int sqr= pts[i][0]*pts[i][0]+ pts[i][1]*pts[i][1]  ;
            pq.add(new pts(pts[i][0], pts[i][1], sqr, i));
        }
        for(int i=0;i<k;i++){
            System.out.println("C" + pq.remove().idx);
        }
    }

}
