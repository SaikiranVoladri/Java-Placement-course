public class sumofTreee {
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

    public static int Height(Node root){
        if(root==null){
            return 0;
        }
        int lh= Height(root.left);
        int rh=Height(root.right);
        int height =Math.max(lh,rh)+1;

        return height;

    }
    public static int sum(Node root){
        if(root==null){
            return 0;
        }
     int lsum=sum(root.left);
     int rsum=sum(root.right);
     int sum= lsum+rsum+root.data;
     return sum;

    }


    public static void main(String[] args) {
        Node root= new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right= new Node(5);
        root.right.right=new Node(6);
         int h=Height(root);
         System.out.println(h);
        System.out.println(sum(root));

    }
    
}
