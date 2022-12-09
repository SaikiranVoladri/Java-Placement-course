public class diameterofaTree {

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
    // public static int height(Node root){
    //     if(root==null){
    //         return 0;
    //     }
    //     int lh=height(root.left);
    //     int rh=height(root.right);
    //     return Math.max(lh, rh)+1;
    // }
    

    // public static int diameter(Node root){

    //     if(root==null){
    //         return 0;
    //     }
    //     int lh=height(root.left);
    //     int rh=height(root.right);
    //     int leftd=diameter(root.left);
    //     int rightd=diameter(root.right);
    //     int selfd= lh+rh+1;
    // //    int lrh=Math.max(rightd, leftd);

    //    return Math.max(selfd, Math.max(rightd, leftd));
       
    // }

    public static int height(Node root){
        if(root==null){
            return 0;
        }
        int  lh=height(root.left);
        int rh= height(root.right);
        return Math.max(lh, rh)+1;

    }

    public static int diameter(Node root){
        if(root== null){
            return 0;
        }
        int lh= height(root.left);
        int ld= diameter(root.left);
        int rh= height(root.right);
        int rd= diameter(root.right);
        int selfd= lh+rh+1;
        return Math.max(Math.max(ld,rd), selfd);
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right= new Node(5);
        root.right.right=new Node(6);
        System.out.println(diameter(root));
    }
}

