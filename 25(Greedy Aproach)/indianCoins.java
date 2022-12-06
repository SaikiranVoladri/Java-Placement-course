import java.util.*;
public class indianCoins {
    public static void main(String[] args) {
        
    int amount=590;
    //  int coins[]={1,2,5,10,20,50,100,500,2000};

    //  solved using ascending order
    // Arrays.sort(coins);
    // int countcoins=0;
    // for(int i=coins.length-1;i>=0;i--){
    //     if(coins[i]<amount){
    //         while(coins[i]<=amount){
    //             countcoins++;
    //             amount-=coins[i];
    //         }
    //     }
    // }
    // System.out.println("total no of coins is "+countcoins);
    

    Integer coins[]={1,2,5,10,20,50,100,500,2000};
    // to sort an array in descending order wwe have to use Integer (not int premitive datatype)
    Arrays.sort(coins,Comparator.reverseOrder());
 
    ArrayList<Integer> ans= new ArrayList<>();
    int coincount=0;
    for(int i=0;i<coins.length;i++){
        if(coins[i]<=amount){
            while(coins[i]<=amount){
                amount-=coins[i];
                ans.add(coins[i]);
                coincount++;
            }

        }
    }
    System.out.println("coin count = "+ coincount);
    for(int i=0;i<ans.size();i++){
        System.out.print(ans.get(i)+" ");
    }


    }
    
}
