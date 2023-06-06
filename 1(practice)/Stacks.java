import java.util.*;
public class Stacks {

    public static void stockspan(int stock[], int span[]){
        Stack<Integer> s= new Stack<>();
        span[0]=1;
        s.push(0);
        for(int i=1;i<stock.length;i++){

            int curr= stock[i];
            while(!s.isEmpty() && curr>stock[s.peek()]){
                s.pop();
            }
            if(s.isEmpty()){
                span[i]=i+1;
            }
            else{
                int prevhigh= s.peek();
                span[i]=i-prevhigh;
            }

            s.push(i);

        }

    }

    public static void nextgreater(int arr[]){
        Stack<Integer> s= new Stack<>();
        int nxtgtr[]= new int[arr.length];

        for(int i=arr.length-1;i>=0;i--){
            
            while(!s.isEmpty() && arr[s.peek()]>=arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nxtgtr[i]=-1;
            }else{
                nxtgtr[i]= arr[s.peek()];
            }
            s.push(i);

        }
        for(int i=0;i<nxtgtr.length;i++){
            System.out.print(nxtgtr[i]+" ");
        }
    }


    public static boolean duplicate(String str){
        Stack<Character> s= new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch= str.charAt(i);
            if(ch ==')'){
                int count=0;
                while( s.peek()!='('){
                    s.pop();
                    count++;
                }
                if(count<1 || s.isEmpty()){
                    return true;
                }
                else{
                    s.pop();
                }
            }else{
                s.push(ch);
            }
        }
        return false;
    }



    public static int maxarea( int arr[]){
        int n= arr.length;
        int nsr[]= new int[n];
        int nsl[]= new int[n];
        int maxarea=0;
        // next smaller right
        Stack<Integer> s= new Stack<>();
        for(int i=arr.length-1;i>=0;i--){
        while(!s.isEmpty() && arr[s.peek()]>=arr[i]){
            s.pop();
        }
        if(s.isEmpty()){
            nsr[i]=arr.length;
        }else{
            nsr[i]= s.peek();
        }
        s.push(i);
        }   

        //next smaller left

         s= new Stack<>();
        for(int i=0;i<n;i++){
        while(!s.isEmpty() && arr[s.peek()]>=arr[i]){
            s.pop();
        }
        if(s.isEmpty()){
            nsl[i]=-1;
        }else{
            nsl[i]= s.peek();
        }
        s.push(i);
        } 
        // maxarea compare
        for(int i=0;i<n;i++){

        int height= arr[i];
        int width= nsr[i]-nsl[i]-1;
        int currarea = height* width;
        maxarea= Math.max(maxarea, currarea);
        }

        for(int i=0;i<n;i++){
            System.out.print(nsl[i]+" ");
            
           
        }
        System.out.println();
        for(int i=0;i<n;i++){
            System.out.print(nsr[i]+" ");
            
           
        }
        System.out.println();
        return maxarea;
    }
        public static void main(String[] args) {
           int arr[]= {2,1,5,6,2,3};
           System.out.println(maxarea(arr));
          


            

            




        }
}
