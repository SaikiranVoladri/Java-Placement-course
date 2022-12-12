public class transformtosumtree {
   
   
        static class Node{
            int data;
            Node left;
            Node right;
    
            Node(int data){
                this.data= data;
                this.left= null;
                this.right=null;
            }
        }
        public static void preorder(Node root){
            if(root==null){
                return ;
            }
            System.out.println(root.data);
            preorder(root.left);
            preorder(root.right);
        }
        public static int  transformsum(Node root){
            if(root== null){
                return 0;
            }

            int lc= transformsum(root.left);
            int rc=transformsum(root.right);
            int data= root.data;
            int newL= root.left==null?0:root.left.data;
            int newR= root.right==null?0:root.right.data;
            root.data=newL +lc+rc+newR;
            return data;

        }

        public static void main(String[] args) {
            Node root= new Node(1);
            root.left= new Node(2);
            root.right= new Node(3);
            root.left.left= new Node(4);
            root.left.right= new Node(5);
            root.right.left= new Node(6);
            root.right.right= new Node(7);
           transformsum(root);
           preorder(root);
          
        }
        
    }
    
    
    


    

