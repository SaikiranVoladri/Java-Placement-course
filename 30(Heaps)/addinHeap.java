import java.util.*;
import java.util.*;
public class addinHeap {

    static class Heap{
        ArrayList<Integer> arr=new ArrayList<>();

        public void add(int data){
            arr.add(data); // adds data at last index

            int x= arr.size()-1;
            int par= (x-2)/2;

            while(arr.get(x)<arr.get(par)){// swap data
                int temp= arr.get(x);// inserts child in parent
                arr.set(x,par);         // insert par in child
                arr.set(par,temp);          // insert child in parent
            }

        }
        public int peek(){
            return arr.get(0);
        }
    
        private void heapify(int i){
            int left= 2*i+1;
            int right= 2*i+2;
            int minIdx= i;

            if(left <arr.size()-1 && arr.get(minIdx)>arr.get(left)){
                minIdx= left;
            }
            if(right<arr.size()-1 && arr.get(minIdx)>arr.get(left)){
                minIdx=right;
            }

            if(minIdx!=i){
                //swap
                int temp= arr.get(i);
                arr.set(arr.get(i),arr.get(minIdx));
                arr.set(arr.get(minIdx),temp);

                heapify(minIdx);
            }
        }
   

   public int  remove(){
        int data= arr.get(0);
        // step1:
        int temp= arr.get(0);
        arr.set(0,arr.size()-1);
        arr.set(arr.size()-1,temp);

        arr.remove(arr.size()-1);
    heapify(0);
    return data;

    }

    }
    public static void main(String[] args) {
        Heap h= new Heap();
        h.add(2);
        h.add(3);
        h.add(4);
        h.add(5);
        while(!h.isEmpty()){
            System.out.println(h.peek());
            h.remove();
        }


      

    }
}
