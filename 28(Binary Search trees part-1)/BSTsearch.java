public class BSTsearch {
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
    public static boolean isfound(Node root,int key){
        if(root==null){
            return false;
        }
        if(root.data==key){
            return true;
        }
        if(root.data > key){
            return isfound(root.left, key);
        }else{
           return  isfound(root.right, key);
        }
         
    }
    public static void main(String args[]){
        int arr[]={5,1,3,4,2,7};
        
        Node root=null;
    for(int i=0;i<arr.length;i++){
        root= insert(root, arr[i]);
    }

       if(isfound(root,6)){
        System.out.println("found");
       }
       else{
        System.out.println( "not found");
       }
    }
    
}
