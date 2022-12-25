import java.util.*;
class LinkedHashMaps{
    public static void main(String[] args) {
        LinkedHashMap<String,Integer> lhm= new LinkedHashMap();
        lhm.put("a",100);
        lhm.put("b",34);
        lhm.put("c",300);
        lhm.put("d",50);

       HashMap<String,Integer> hm= new HashMap();
        hm.put("a",100);
        hm.put("b",34);
        hm.put("c",300);
        hm.put("d",5);

        TreeMap<String,Integer> tm= new TreeMap();
        tm.put("aa ",100);
        tm.put("aa`",34);
        tm.put("aaa",300);
        tm.put("a",5);
    System.out.println(lhm);
    System.out.println(hm);
    System.out.println(tm);
    }

}