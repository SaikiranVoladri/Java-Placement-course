import java.util.*;
import java.util.Stack;
public class dublicateparenthesis {

    //creating an function
    public static boolean isDupliorNot(String str){
        Stack<Character> s = new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            
        
        //closing 
        if(ch==')'){
            int count=0;
            while(s.peek()!='('){
                s.pop();
                count++;
            }if(count<1){
                return true;//duplicate exists
            }else{
                s.pop();
            }
        }else{
            s.push(ch);
        }
        
    }return false;
}
    public static void main(String args[]){
        String str="a-b";
        System.out.println(isDupliorNot(str));
        
    }
    
}
