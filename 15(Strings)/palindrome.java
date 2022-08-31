import java.util.Scanner;
public class palindrome {
    public static boolean ispolindrome(String pdrome){
        int n=pdrome.length();
    for(int i=0;i<n/2;i++){
        if(pdrome.charAt(i)!=pdrome.charAt(n-1-i)){
            return false;
        }
    }
    return true;}
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        String  pdrome=sc.nextLine();
       System.out.println( ispolindrome(pdrome));

    }

}
