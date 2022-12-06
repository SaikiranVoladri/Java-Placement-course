import java.util.*;
public class fractionalKnapsack {
    public static void main(String[] args) {
        
    
    int val[]={60,100,120};
    int weight[]={10,20,30};
    int W=50;

    double ratio[][]= new double[val.length][2];
    for(int i=0;i<val.length;i++){
        ratio[i][0]=i;
        ratio[i][1]=val[i]/(double)weight[i];// used double to get exact fraction
    }
    Arrays.sort(ratio,Comparator.comparingDouble(o->o[1]));

    // sorted in ascending order
    // we need to fill the bag based on descending order
    int capacity=W;
    int finalval=0;

    for(int i=val.length-1;i>=0;i--){
        int idx=(int)ratio[i][0];
        if(capacity>=weight[idx]){
            finalval+=val[idx];
            capacity-=weight[idx];
        }else{// if it is in fractional form
            finalval+=ratio[i][1]*capacity;
            capacity=0;
            break;
        }
    }
    System.out.println("max capacity val="+ finalval);



}
}
