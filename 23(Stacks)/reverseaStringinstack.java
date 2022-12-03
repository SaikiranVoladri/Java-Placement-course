import java.util.Stack;
public class reverseaStringinstack {
    public static String reversestack(String str){
        Stack<Character> s= new Stack<>();
        int idx=0;
        while(idx<str.length()){
            s.push(str.charAt(idx));
            idx++;

        }
        StringBuilder sb= new StringBuilder();
        while(!s.isEmpty()){
            char curr=s.pop();
            sb.append(curr);
        }

return sb.toString();
    } 
    
    

    public static void main(String[] args) {
        String str= "SAIKIRAN";
        String res=reversestack(str);
        System.out.println(res);
        
     
      

    }

    
}
