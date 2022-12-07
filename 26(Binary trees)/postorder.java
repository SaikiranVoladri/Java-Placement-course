public class postorder {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }

    public static class BinartTree{
        static  int idx=-1;

        public static Node BuildTree(int node[]){
            idx++;
            if(node[idx] ==-1){
                return null;
            }
            Node newnode= new Node(node[idx]);
            newnode.left=BuildTree(node);
            newnode.right= BuildTree(node);
            return newnode;
        }

        public static void postorder(Node root){
            if(root==null){
                return;
            }
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data+" ");
        }
    }
    public static void main(String[] args) {
        int nodes[]= {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};

        BinartTree tree = new BinartTree();
        Node root=tree.BuildTree(nodes);
        tree.postorder(root);
    }
}
