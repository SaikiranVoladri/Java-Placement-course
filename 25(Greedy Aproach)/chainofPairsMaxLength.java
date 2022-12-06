import java.util.*;
public class chainofPairsMaxLength {
    public static void main(String[] args) {
        int pairs[][]={{5,24},{39,60},{5,28},{27,40},{50,90}};
        // sorting pairs
        Arrays.sort(pairs,Comparator.comparingDouble(o->o[1]));
        int chainlength=1;
        int lastend=pairs[0][1];
        for(int i=1;i<pairs.length;i++){
            if(pairs[i][0]>lastend){
                chainlength++;
                lastend=pairs[i][1];
            }
        }
        System.out.println("total chains formed "+ chainlength);
    }
}
