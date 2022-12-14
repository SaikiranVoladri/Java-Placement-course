public class printinRange {
   
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
        public static void printinRange(Node root,int k1,int k2){
            if(root==null){
                return;
            }
            if(root.data>=k1 &&root.data<=k2){
                printinRange(root.left, k1, k2);
                System.out.print(root.data+" ");
                printinRange(root.right, k1, k2);
            }else if(root.data<k1){
                printinRange(root.left, k1, k2);
            }else{
                printinRange(root.right, k1, k2);
            }
        }
        public static void inorder(Node root){
            if(root==null){
           return;
        }   
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);    
    
        }
        
        public static void main(String args[]){
            int arr[]={8,5,3,1,4,6,10,11,14};
            Node root=null;
        for(int i=0;i<arr.length;i++){
            root= insert(root, arr[i]);
        }
        // inorder(root);
        printinRange(root, 5, 12);

   
}}
