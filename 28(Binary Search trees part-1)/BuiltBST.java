/*BST 
for searching a key  if key >  root it will present on right side else left side 
*/
public class BuiltBST{
    static class node{
            int data;
            node left;
            node right;
            public node(int data){
                this.data=data;
            }
    }
        public static node inserrt(node root, int val){
            if(root==null){
                root= new node(val);
                return root;
            }

            if(root.data>val){
                root.left=inserrt(root.left, val);
            }else{
                root.right=inserrt(root.right, val);
            }
            return root;
        }

        public static void inorder(node root){
            if(root==null){
           return;
        }   
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);    
    
        }
    public static void main(String[] args) {
        int values[]= {5,1,3,4,2,7};
        node root=null;
        for(int i=0;i<values.length;i++){
           root=inserrt(root, values[i]);
        }
        inorder(root);

    }
}
