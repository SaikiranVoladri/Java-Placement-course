public class MIrrorOfBST {
    public static class Node{
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data= data;
            this.left= null;
            this.right= null;
        }
    }

    public static Node mirror(Node r){
        if(r== null){
            return null;
        }
       Node leftMirror= mirror(r.left);
       Node rightMirror= mirror(r.right);

       r.left= rightMirror;
       r.right= leftMirror;
       
       return r;
    }

    public static void preorder(Node r){
        if(r==null){
            return;
        }
        System.out.print(r.data+" ");
        preorder(r.left);
        preorder(r.right);

    }
    
    public static void main(String[] args) {
        Node r= new Node(8);
        r.left= new Node(5);
        r.right= new Node(10);
        r.left.left= new Node(3);
        r.right.right= new Node(11);
        r.left.right= new Node(6);

        r= mirror(r);
        preorder(r);

    }
}
