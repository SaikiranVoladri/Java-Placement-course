import java.util.*;
public class isAnagram {
    public static boolean isAnagram(String s,String t){
        HashMap<Character , Integer > map= new HashMap<>();
       
        for(int i=0;i<s.length();i++){
            char ch= s.charAt(i);
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i), 0)+1);
        
        }
        
        for(int i=0;i<t.length();i++){
            char ch= t.charAt(i);
            if(map.get(ch)!=null){
                if(map.get(ch)!=null){
                    if(map.get(ch)==1){
                        map.remove(ch);

                    }else{
                        map.put(ch,map.get(ch)-1);
                    }
                }
                else{
                    return false;
                }
            }
        } return map.isEmpty();
    }
    public static void main(String[] args) {
        String s= "race";
        String t="care";
        System.out.println(isAnagram(s, t));
    }
    
}
