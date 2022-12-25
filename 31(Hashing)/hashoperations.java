import java.util.*;
public class hashoperations {

    public static void main(String[] args) {
        HashMap<String , Integer> hm= new HashMap<>();
        // hm operations like get put containskey size remove isEmpty
        hm.put("A",1);
        hm.put("B",2);
        hm.put("C", 3);
        hm.put("D",4);

        System.out.print(hm);
        System.out.println();

        int val= hm.get("A");
        System.out.println(val);

        System.out.println(hm.containsKey("i"));

        System.out.println(hm.size());

        System.out.println(hm.remove("A"));

        //clear function clears the data in hashmap
        hm.clear();
        System.out.println(hm.isEmpty());
        



    }
    
}
