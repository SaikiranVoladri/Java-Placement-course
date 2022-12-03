import java.util.*;
public class nextsmallerLeft {
    public static void main(String[] args) {
        int arr[]={6,8,0,1,3};
        Stack<Integer> s= new Stack<>();
        int nextgreat[]= new int[arr.length];
        for(int i=0;i<arr.length-1;i++){
            while(!s.isEmpty()&& arr[s.peek()]>=arr[i]){
                s.pop();
    
            }
            if(s.isEmpty()){
                nextgreat[i]=-1;
            }else{
                nextgreat[i]=arr[s.peek()];
            }
            s.push(i);
    
        }
        for(int i=0;i<nextgreat.length;i++){
            System.out.println(nextgreat[i]+" ");
        }
        System.out.println();
    } 
    
}


