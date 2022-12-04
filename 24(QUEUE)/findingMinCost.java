import java.util.*;

import javax.print.attribute.Size2DSyntax;
public class findingMinCost {
    static int getMinCost(int arr[], int n){
        PriorityQueue<Integer> pq= new PriorityQueue<Integer>();
        for(int i=0;i<arr.length;i++){
            pq.add(arr[i]);
        }
        int res=0;
        while(pq.size()>1){
            int first=pq.poll();
            int second=pq.poll();
            res+=first+second;
            pq.add(first+second);
        }
        return res;
    }
    public static void main(String[] args) {
        int arr[]={4,3,2,6};
        int size=arr.length;
        System.out.println("min cost="+getMinCost(arr, size));
    }
    
}
