import java.util.*;
public class nonrepeatingLetter {
    public static void nonrepeatingLetters(String str){
        //create a freaquency alphabets array
        int frequency[]= new int[26];
        // queue  creation
        Queue <Character> q= new LinkedList<>();
        // insert characters of a string into queue
        for(int i=0;i<str.length();i++){
            char ch= str.charAt(i);
            q.add(ch);
            frequency[ch-'a']++;
            while(!q.isEmpty() && frequency[q.peek()-'a']>1){
                q.remove();
            }
            if(q.isEmpty()){
                System.out.println(-1+" ");
            }else{
                System.out.println(q.peek());
            }
        }

    }
    public static void main(String[] args) {
        String str= "aabccxb";
        nonrepeatingLetters(str);
    }
}
