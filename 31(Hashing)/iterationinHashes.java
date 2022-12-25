import java.util.*;


public class iterationinHashes {
    public static void main(String[] args) {
        HashMap<Integer,Integer> hm= new HashMap<>();
        hm.put(1,10);
        hm.put(2,20);
        hm.put(3,30);
        hm.put(4,40);

        Set<Integer> key = hm.keySet();
        System.out.println(key);
        // printing k, v in pairs we use foreach loop
        for(Integer i:key){
            System.out.print(i);
        } 

    }
}
