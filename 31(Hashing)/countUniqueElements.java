import java.util.*;
public class countUniqueElements {
    public static void main(String[] args) {
        HashSet<Integer> hs= new HashSet();

        int arr[]={1,2,3,4,5,6,7,1,2,3};
        for(int i=0;i<arr.length;i++){
            hs.add(arr[i]);
        }
        System.out.println(hs);
        System.out.println(hs.size());
    }
}
