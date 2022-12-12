public class mindistance {
   
        static class Node{
            int data;
            Node left;
            Node right;
    
            Node(int data){
                this.data= data;
                this.left= null;
                this.right=null;
            }
        }
    public static Node Lca(Node root, int n1,int n2){
        if(root==null){
            return null;
        }
        if(root.data==n1 || root.data==n2){
            return root;
        }
        Node left= Lca(root.left, n1, n2);
        Node right= Lca(root.right, n1, n2);
    
        if(left==null){
            return right;
        }
        if(right== null){
            return left;
        }
    
        return root;
    }
    
    public static int LcaDist(Node root, int n){
        if(root== null){
            return -1;
        }
        if(root.data==n){
             return 0;
        }

        int ld=LcaDist(root.left, n);
        int rd= LcaDist(root.right, n);

        if(ld==-1 && rd==-1){
            return -1;
        }else if(ld==-1){
            return rd+1;
        }
        else{
            return ld+1;
        }
    }

public static int mindist(Node root, int n1,int n2){
    Node lca= Lca(root, n1, n2);

    int d1= LcaDist(lca,n1);
    int d2= LcaDist(lca,n2);

    return d1+d2;
}

        public static void main(String[] args) {
            Node root= new Node(1);
            root.left= new Node(2);
            root.right= new Node(3);
            root.left.left= new Node(4);
            root.left.right= new Node(5);
            root.right.left= new Node(6);
            root.right.right= new Node(7);
            int n1=4,n2=6;
            System.out.println(mindist(root, n1, n2));
        }
        
    }
    
    
    

