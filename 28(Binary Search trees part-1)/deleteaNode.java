//public class deleteaNode {
     //   static class Node{
           // int data;
          // Node left;
            //Node right;
            Node(int data){
                this.data= data;
                this.left=null;
                this.right=null;
            }
        } 
    
        public static Node insert(Node root, int arr){
            if(root==null){
                root=new Node(arr);
                return root;
            }
            if(root.data > arr){
                root.left=insert(root.left, arr);
            }else{
                root.right= insert(root.right, arr);
    
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

        public static Node delete(Node root, int arr){
            if(root.data<arr){
                root.right = delete(root.right, arr);
            }
            if(root.data>arr){
                root.left = delete(root.left, arr);
            }
            else{
                //case-1
                if(root.left==null && root.right==null){
                    return null;
                }
                //case-2
                if(root.left==null){
                    return root.right;
                }
                else if (root.right==null){
                    return root.left;
                }
                Node IS=findIS(root.right);
                root.data=IS.data;
                root.right= delete(root.right, IS.data);
            }
            return root;
        }
        public static Node findIS(Node root){
            while(root.left!=null){
                root= root.left;

            }
            return root;
        }
        public static void main(String args[]){
            int arr[]={8,5,3,1,4,6,10,11,14};
            Node root=null;
        for(int i=0;i<arr.length;i++){
            root= insert(root, arr[i]);
        }
        inorder(root);  
        System.out.println();
        root=delete(root, 5) ;
        System.out.println();
        inorder(root);
    }
}

    

