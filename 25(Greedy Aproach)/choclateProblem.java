import java.util.*;
public class choclateProblem {
    public static void main(String[] args) {
        int n=4,m=6;
        Integer horizontalcost[]={2,1,3,1,4};
        Integer verticalcost[]={4,1,2};
        
        Arrays.sort(horizontalcost,Collections.reverseOrder());
        Arrays.sort(verticalcost,Collections.reverseOrder());

        int h=0, v=0;// horizontal and vertical pointers
        int hp=1,vp=1; // horizontal and vertical cuts
        int cost=0;
        
        while(h<horizontalcost.length && v<verticalcost.length){
            if(verticalcost[v]<=horizontalcost[h]){//horizontal cut
                cost+=(horizontalcost[h]*vp);
                h++;
                hp++;
            }else{//vertical cut
                cost+=(verticalcost[v]*hp);
                vp++;
                v++;

            }

          
        }
        while(h<horizontalcost.length){
            cost+=(horizontalcost[h]*vp);
           
            h++;
            hp++;

        }
        while(v<verticalcost.length){
            cost+=(verticalcost[v]*hp);
            
            vp++;
            v++;
        }

        System.out.println("total cuts "+ cost);

    }

    
}
