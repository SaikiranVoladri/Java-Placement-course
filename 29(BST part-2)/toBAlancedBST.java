import java.util.ArrayList;

public class toBAlancedBST {
  
        static class Node{
            int data;
            Node left;
            Node right;
    
            public Node(int data){
                this.data= data;
                this.left= null;
                this.right=null;
            }
        }
     public static void  preorder(Node root){
        if(root==null){
            return ;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }


    
        public static Node createBST(ArrayList<Integer> inorder, int start , int end){
            if(start>end){
                return null;
            }
            int mid= (start+end)/2;
            Node root= new Node(inorder.get(mid));
    
            root.left= createBST(inorder, start, mid-1);
            root.right= createBST(inorder, mid+1, end);
    
            return root;
        }
        public static void getinorder(Node root, ArrayList<Integer> inorder){
            if(root== null){
                return;
            }
            getinorder(root.left, inorder);
            inorder.add(root.data);
            getinorder(root.right, inorder);
        }
        public static Node balancedBSt(Node root){
            ArrayList<Integer> inorder= new ArrayList<>();
            getinorder(root, inorder);
            root=createBST(inorder, 0, inorder.size()-1);
            return root;
        }
        public static void main(String[] args) {
            Node root= new Node(8);
            root.left= new Node(6);
            root.right= new Node(10);
            root.left.left= new Node(5);
            root.right.right= new Node(11);
            root.left.left.left= new Node(3);
            root.right.right.right= new Node(12);
           root= balancedBSt(root);
            preorder(root);
    
        }
     }
    

