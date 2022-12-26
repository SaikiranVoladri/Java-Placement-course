import java.util.*;

public class ticketsProblem {
    public static String getStart(HashMap <String,String> ticket){
       HashMap <String,String> revmap = new HashMap<>(); 

       for(String key :ticket.keySet()){
        revmap.put(ticket.get(key),key);
       }
       for(String key: ticket.keySet()){
        if(!revmap.containsKey(key)){
            return key;
        }
       }
       return null;
    }
 public static void main(String args[]){
    HashMap <String,String> ticket = new HashMap<>();
    ticket.put("chennai","Bangalore");
    ticket.put("mumbai", "delhi");
    ticket.put("goa","chennai");
    ticket.put("delhi", "goa");

    String start = getStart(ticket);
    System.out.println(start);
    for(String key:ticket.keySet()){
       
       System.out.println("->"+ ticket.get(start));
       start= ticket.get(start);
    }
 }    
}
