import java.util.*;

import javax.naming.LinkException;

public class levelorder {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data=data;
            this.left= null;
            this.right=null;
        }

    }

    static class Binarytree{
        static int idx= -1;
        public static Node BuildTree(int nodes[]){
            idx++;
            if(nodes[idx]== -1){
                return null;
            }
            Node newNode= new Node(nodes[idx]);
            newNode.left= BuildTree(nodes);
            newNode.right= BuildTree(nodes);


        return newNode;
        }

    public static void levelorder(Node root){
        if(root==null){
            return;
        }

        Queue<Node> q= new LinkedList<>();
        q.add(root);
        q.add(null);
        while(!q.isEmpty()){
            Node curr=q.remove();
            if(curr==null){
                System.out.println();
                if(q.isEmpty()){
                    break;
                }else{
                    q.add(null);
                }
                
            }else{
                System.out.print(curr.data);

                if(curr.left!=null){
                    q.add(curr.left);

                }
                if(curr.right!=null){
                    q.add(curr.right);
                }
            }
        }

    }
       
      
    }

    public static void main(String[] args) {
        int nodes[]= {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        Binarytree tree = new Binarytree();
        Node root=tree.BuildTree(nodes);
       tree.levelorder(root);
       
        

    }
    
    
}
