import java.lang.reflect.Array;
import java.util.Stack;

public class MaxAreaInHistogram {
    public static void MAxArea(int arr[]){
        int maxarea=0;
        int nsr[]= new int [arr.length];
        int nsl[]= new int[arr.length];

       Stack<Integer> s= new Stack<>();
       // nsr
       for(int i=arr.length-1;i>=0;i--){
        while(!s.isEmpty()&&arr[s.peek()]>=arr[i]){
            s.pop();
        }
        if(s.isEmpty()){
            nsr[i]=arr.length;
        }else{
            nsr[i]=s.peek();
        }
        s.push(i);
       }

       s=new Stack<>();
       // nsl
       for(int i=0;i<=arr.length-1;i++){
        while(!s.isEmpty()&&arr[s.peek()]>=arr[i]){
            s.pop();
        }
        if(s.isEmpty()){
            nsl[i]=-1;
        }else{
            nsl[i]=s.peek();
        }
        s.push(i);
       }

       for(int i=0;i<arr.length;i++){
        int height= arr[i];
        int width=nsr[i]-nsl[i]-1;
        int currarea=height*width;
         maxarea=Math.max(currarea,maxarea);
       }
       System.out.println("max area= "+ maxarea);

    }

public static void main(String[] args) {
    int arr[]= {2,1,5,6,2,6};
    MAxArea(arr);
}
    
}
