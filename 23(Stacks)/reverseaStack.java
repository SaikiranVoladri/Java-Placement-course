import java.util.*;
public class reverseaStack {
    //
   public static void  pushatbottom(Stack<Integer> s, int data){
    //corner case
    if(s.isEmpty()){
        s.push(data);
        return;
    }
    int top=s.pop();
    pushatbottom(s, data);
    s.push(top);
   }
    
   public static void reverse(Stack<Integer> s){
    //corner case
    if(s.isEmpty()){
        return;
    }
    int top=s.pop();
    reverse(s);
    pushatbottom(s, top);
   }
   public static void print(Stack<Integer> s){
    while(!s.isEmpty()){
        System.out.print(s.pop());
    }
   }
   public static void printoriginal(Stack<Integer> s){
    while(!s.isEmpty()){
        System.out.print(s.pop());
    }
   }
   public static void main(String args[]){
    Stack<Integer> s= new Stack<>();
    s.push(2);
    s.push(3);
    s.push(4);
   
    reverse(s);
    print(s);
    

   }
}
