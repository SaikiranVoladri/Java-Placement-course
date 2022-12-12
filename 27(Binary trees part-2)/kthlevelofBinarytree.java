import java.util.*;
public class kthlevelofBinarytree {
    static class Node{
        int data;
        Node left;
        Node right;
   
   public Node( int data){
    this.data=data;
    this.left=null;
    this.right=null;
    }
  }


    public static  void kthlevel(Node root, int k,int level){
      if(root==null){
        return;  
        }
   
    if(level==k){
        System.out.println(root.data);
        return;
    }
    kthlevel(root.left, k, level+1);
    kthlevel(root.right, k, level+1);

    }
    public static void main(String[] args) {
        Node root= new Node(1);
        root.left= new Node(2);
        root.right= new Node(3);
        root.left.left= new Node(4);
        root.left.right= new Node(5);
        root.right.left= new Node(6);
        root.right.right= new Node(7);

        int k=3;
       int level;
        kthlevel(root, k, 1);
    }
    
}
