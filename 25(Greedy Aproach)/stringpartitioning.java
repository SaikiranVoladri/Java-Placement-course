import java.util.*;
public class stringpartitioning {

    public static int getPartitioned(int n,String str){
        if(n==0){
            return 0;
        }
        int r=0,L=0;
        
        int ans=0;
        for(int i=0;i<n;i++){
            if(str.charAt(i)=='L'){
                L++;
                
            }else{
                r++;
            }
            
            if(L==r){
                ans++;
            }

        }
        

        return ans;
    }

    public static void main(String[] args) {
        String str="LRRRRLLRLLRL";
        int n= str.length();
        System.out.println(getPartitioned(n, str));

    }
    
}
