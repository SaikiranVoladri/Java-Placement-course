 public class sortedarraytobalancedBST{
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

    public static Node createBST(int arr[], int start , int end){
        if(start>end){
            return null;
        }
        int mid= (start+end)/2;
        Node root= new Node(arr[mid]);

        root.left= createBST(arr, start, mid-1);
        root.right= createBST(arr, mid+1, end);

        return root;
    }
    public static void main(String[] args) {
        int arr[]={3,5,6,8,10,11,12};
        Node  root= createBST(arr, 0, arr.length-1);
        preorder(root);

    }
 }