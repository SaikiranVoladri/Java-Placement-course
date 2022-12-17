import java.util.*;
public class printroottoleaf {
   
   
        static class Node{
            int data;
            Node left;
            Node right;
            Node(int data){
                this.data= data;
                this.left=null;
                this.right=null;
            }
        } 
    
        public static Node insert(Node root, int arrval){
            if(root==null){
                root=new Node(arrval);
                return root;
            }
            if(root.data > arrval){
                root.left=insert(root.left, arrval);
            }else{
                root.right= insert(root.right, arrval);
    
            }
    
            return root;
    
        }
        
        public static void inorder(Node root){
            if(root==null){
           return;
        }   
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);    
    
        }

        public static void printpath(ArrayList<Integer>path){
            for(int i=0;i<path.size();i++){
                System.out.print(path.get(i)+" ->");
            }
            System.out.println();
        }
        public static void printR2L(Node root , ArrayList<Integer> path){
            if(root==null){
                return;
            }

            path.add(root.data);
            if(root.left==null&& root.right==null){
                printpath(path);
            }
           
            printR2L(root.left, path);
            printR2L(root.right, path);
            path.remove(path.size()-1);

           

        }
        public static void main(String args[]){
            int arr[]={8,5,3,6,10,11,14};
            Node root=null;
        for(int i=0;i<arr.length;i++){
            root= insert(root, arr[i]);
        }
        inorder(root);
        System.out.println();
        printR2L(root, new ArrayList<>());
        

   
}}

    

