public class validBST {

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

    public static boolean isvalid(Node root, Node max, Node min)  {
        if(root==null){
            return true;
        }

        else if(min!=null&& root.data<=min.data){
            return false;
        }
        else if(max != null&&root.data>=max.data){
            return false;
        }

        return isvalid(root.right,root , max) && isvalid(root.left,min ,root);
    }  
        public static void main(String args[]){
            int arr[]={1,1,1};
            Node root=null;
        for(int i=0;i<arr.length;i++){
            root= insert(root, arr[i]);
        }
       if(isvalid(root, null, null)){
        System.out.println("valid");
       }
       else{
        System.out.println("not valid");
       }
      
        

   
}
}

    


    

