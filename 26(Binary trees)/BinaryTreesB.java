import java.util.*;
public class BinaryTreesB {

    // Node class
   static  class Node{
        int data;
        Node left;
        Node right;

       public Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }

    // binart tree class
    static class Binarytree{
        static  int idx = -1;
        public static Node Buildtree(int node[]){
            idx++;
            if(node[idx] == -1){
                return null;
            }
            Node newnode = new Node(node[idx]);
            newnode.left = Buildtree(node);
            newnode.right = Buildtree(node);

            return newnode;
        }
    }
    public static void main(String[] args) {
        int node[]={1 , 2, 4 , -1 , -1 , 5  -1, -1 ,3,-1, 6, -1,-1};
        Binarytree tree= new Binarytree();
        Node root=tree.Buildtree(node);
        System.out.println(root.data);

    }
}
