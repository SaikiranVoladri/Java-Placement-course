import java.util.*;
public class iterater {
    public static void main(String args[]){
        HashSet<String > cities= new HashSet<>();
        cities.add("hyderabad");
        cities.add("bengalore");
        cities.add("noida");
        cities.add("vadodara");
        // iterater
        Iterator it = cities.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
System.out.println();
        //enhanced for-each loop

        for(String city: cities){
            System.out.println(city);
        }
    }
    
}
