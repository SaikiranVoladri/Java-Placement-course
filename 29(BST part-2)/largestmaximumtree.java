public class largestmaximumtree {
 
  
        static class Node{
//             int data;
//             Node left;
//             Node right;
    
            public Node(int data){
                this.data= data;
                this.left= null;
                this.right=null;
            }
        }
 public static class Info{
     boolean isBst;
     int size;
     int max;
     int min;
     public Info(  boolean isBst,int size, int min,int max){
         this.isBst= isBst;
         this.size=size;
         this.min= min;
         this.max= max;
     }
 }
 public static int maxBst=0;
    public static Info largestBst(Node root){

        if(root==null){
            return new Info(true,0,Integer.MAX_VALUE,Integer.MIN_VALUE);
        }
        Info li=largestBst(root.left);
        Info ri = largestBst(root.right);
        int size=li.size+ri.size+1;

        int min= Math.min(root.data,Math.min(li.min,ri.min));
        int max= Math.max(root.data,Math.max(li.max,ri.max));

        if(root.data<=li.max||root.data>=ri.min)
          {
        return new Info(false,size,min,max);
         }

    if(li.isBst&&ri.isBst){
        maxBst= Math.max(maxBst,size);
        return new Info(true,size,min,max);
    }
    return new Info(false,size,min,max);
    }


    
        public static void main(String[] args) {
            Node root= new Node(50);
            root.left= new Node(30);
            root.left.left= new Node(5);
            root.left.right= new Node(20);

            root.right= new Node(60);
           
            root.right.left= new Node(45);
          
            root.right.right= new Node(70);
            root.right.right.left= new Node(65);
            root.right.right.right= new Node(80);
         
    Info info = largestBst(root);
    System.out.println(maxBst);
        }
     }
    


    

