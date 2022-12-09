public class diameterofatreeAproach2 {
    
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
    public static class info{
        int diam;
        int ht;
        info(int diam, int ht){
            this.diam= diam;
            this.ht= ht;

        }
    }

    public static info diameter( Node root ){
        if(root== null){
            return new info(0, 0);

        }
        info linfo=diameter(root.left);
        info rinfo= diameter(root.right);

        int diam= Math.max(Math.max(linfo.diam, rinfo.diam),linfo.ht+rinfo.ht+1);
        int ht= Math.max(linfo.ht, rinfo.ht)+1;

        return new info(diam, ht);
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right= new Node(5);
        root.right.right=new Node(6);
        System.out.println(diameter(root).diam);
        System.out.println(diameter(root).ht);
    }

}
