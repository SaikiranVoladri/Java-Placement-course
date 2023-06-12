import java.util.*;

public class graphs{


    static class edge{
        int src;
        int dest;
        int wt;
        public edge(int src, int dest , int wt){
            this.src=src;
            this.dest= dest;
            this.wt= wt;
        }   
    }

    public static void createGraph(ArrayList<edge>graph[]){
        for(int i=0;i<graph.length;i++){
            graph[i]= new ArrayList<>();
        }
      

         graph[0].add(new edge(0, 1, 2));
         graph[0].add(new edge(0, 2, 4));
         graph[1].add(new edge(1, 3, 7));
         graph[1].add(new edge(1, 2, 1));
         graph[2].add(new edge(2, 4, 3));
         graph[3].add(new edge(3, 5, 1));
              
         graph[4].add(new edge(4, 3, 2));
         graph[4].add(new edge(4, 5, 5));
    }
    public static void bfs(ArrayList<edge> graph[]){
          boolean isvis[]= new boolean[graph.length];
          for(int i=0;i<graph.length;i++){
            if(!isvis[i]){
                bfsutil(graph,i, isvis);
            }
          }
    }
    public static void bfsutil(ArrayList<edge> graph[],int start, boolean isvis[] ){
        Queue<Integer> q= new LinkedList<>();
      
        q.add(start);
        while(!q.isEmpty()){
            int curr= q.remove();

            if(!isvis[curr]){
                System.out.print(curr+" ");
                isvis[curr]=true;
                for(int i=0;i<graph[curr].size();i++){
                    edge e= graph[curr].get(i);
                    q.add(e.dest);
                }
            }
        }
    }

    public static void dfs(ArrayList<edge> graph[]){
        boolean isvis[]= new boolean[graph.length];
        for(int i=0;i<graph.length;i++){
            if(!isvis[i]){
                dfsutil(graph, i, isvis);
            }
        }
    }
    public static void dfsutil(ArrayList<edge> graph[], int curr, boolean isvis[]){

        System.out.print(curr+" ");
        isvis[curr]=true;
        for(int i=0;i<graph[curr].size();i++){
            edge e= graph[curr].get(i);
            if(!isvis[e.dest]){
                dfsutil(graph, e.dest,isvis);
            }
        }

    }

    public static boolean haspath(ArrayList<edge> graph[], int src, int dest , boolean vis[]){
        if(src== dest){
            return true;
        }
        vis[src]= true;
        for(int i=0;i<graph[src].size();i++){
            edge e = graph[src].get(i);// e.dest = neighbour
            if(!vis[e.dest]&& haspath(graph, e.dest, dest, vis)){
                return true;
            }

        }
        return false;
    }


    public static boolean cycle( ArrayList<edge> graph[]){
         boolean vis[]=new boolean[graph.length];

         for(int i=0;i<graph.length;i++){
            if(!vis[i]){
               if( cycleutil(graph, vis, i, -1)){
                return true;
            }
            }
         }
         return false;
    }

    public static boolean cycleutil(ArrayList<edge> graph[],boolean vis[], int curr, int par ){
        vis[curr]=true;
        for(int i=0;i<graph[curr].size();i++){
            edge e= graph[curr].get(i);

            if(!vis[e.dest]){
                if(cycleutil(graph, vis, e.dest, curr)){
                    return true;
                }
            }
            else if(vis[e.dest] && e.dest != par){
                return true;
            }
        }
        return false;
    }


    public static boolean isbipartite(  ArrayList<edge> graph[]){
        int col[]= new int[graph.length];
        for(int i=0; i<col.length;i++){
            col[i]=-1;
        }
        Queue<Integer> q= new LinkedList<>();
        for(int i=0;i<graph.length;i++){
            if(col[i]== -1){
                // perform coloring
                q.add(i);
                col[i]=0;
                
                while(!q.isEmpty()){
                    int curr= q.remove();
                    for(int j=0;j<graph[curr].size();j++){
                        edge e= graph[curr].get(j);
                        if(col[e.dest]==-1){
                            //assign color
                            int nxtcol= col[curr]==0 ? 1: 0;
                            col[e.dest]=nxtcol;
                            q.add(e.dest);
                        }
                        else if(col[e.dest]==col[curr]){
                            return false;
                        }
                    }
                }
            }
        }
        return true;
        
    }
public boolean cucle2util(ArrayList<edge> graph[], int curr, boolean vis[],boolean stack[]){
    vis[curr]= true;
    stack[curr]= true;
    for(int i=0;i<graph[curr].size();i++){
        edge e= graph[curr].get(i);

        if(vis[e.dest]){
            return true;
        }
        if(!vis[e.dest] && cucle2util(graph, e.dest, vis, stack)){
            return true;
        }
    }
    return false;
}
    public  boolean cycle2(ArrayList<edge> graph[]){
        boolean vis[]= new boolean[graph.length];
        boolean stack[]= new boolean[graph.length];
        for(int i=0;i<graph.length;i++){
            if(!vis[i]){
                if(cucle2util(graph, i, vis, stack)){
                    return true;
                }
            }
        }
        return false;
    }

    public static void indegrree(ArrayList<edge> graph[], int arr[]){
        for(int i=0;i<graph.length;i++){
            for(int j=0;j<graph[i].size();j++){
                edge e= graph[i].get(j);
                arr[e.dest]++;
            }
        }
    }
    public static void topologicalbfs(ArrayList<edge> graph[]){
        int indeg[]= new int[graph.length];
        indegrree(graph, indeg);
        Queue<Integer> q= new LinkedList<>();
        
        for(int i=0;i<indeg.length;i++){
            if(indeg[i]==0){
                q.add(i);
            }
        }

        while(!q.isEmpty()){
            int curr= q.remove();
            System.out.print(curr+" ");
            for(int i=0;i<graph[curr].size();i++){
                edge e = graph[curr].get(i);
                indeg[e.dest]--;
            if(indeg[e.dest]==0){
                        q.add(e.dest);    
                }
           }
           
        }
        System.out.println();
    }

    public static void printpath( ArrayList<edge> graph[] , int src, int dest, String path){
        if(dest== src){
            System.out.println(path+dest);
            return;
        }

        for(int i=0;i<graph[src].size();i++){
            edge e= graph[src].get(i);
            printpath(graph, e.dest, dest, path+src);
        }
    }
static class pair implements Comparable<pair>{
    int n;
    int path;
    public pair(int n, int path){
        this.n= n;
        this.path= path;
    }

    @Override
    public int compareTo(pair p2){
        return this.path-p2.path;
    }
}

public static void dijkistra( ArrayList<edge> graph[] , int src){
    int dis[]= new int[graph.length];
    boolean vis[]= new boolean[graph.length];

    for(int i=0;i<graph.length;i++){
        if(i!=src){
           dis[i]= Integer.MAX_VALUE;
        }
    }

    PriorityQueue<pair> pq= new PriorityQueue<>();
    pq.add(new pair(src,0));
    while(!pq.isEmpty()){
        pair curr= pq.remove();
        if(!vis[curr.n]){
        vis[curr.n]=true;}
        for(int i=0;i<graph[curr.n].size();i++){
            edge e= graph[curr.n].get(i);

            int u= e.src;
            int v= e.dest;
            int wt= e.wt;

            if(dis[u]+wt <dis[v]){
                dis[v]= dis[u]+wt;
                pq.add(new pair(v, dis[v]));
            }
        }

    }
    for(int i=0;i<graph.length;i++){
        System.out.print( dis[i]+" ");
    }
    System.out.println();
}

public static void belman(ArrayList<edge> graph[], int src){
    int dis[]= new int[graph.length];
    for(int i=0;i<graph.length;i++){
        if(i!=src){
            dis[i]= Integer.MAX_VALUE;
        }
    }

    int V= graph.length;
    for(int i=0;i<V-1;i++){
        for(int j=0;j<graph.length;j++){
            // neighbour nodes
            for(int k=0;k<graph[j].size();k++){
                edge e= graph[j].get(k);

                int u= e.src;
                int v= e.dest;
                int wt= e.wt;

                if(dis[u]!=Integer.MAX_VALUE && dis[u]+wt <dis[v]){
                    dis[v]= dis[u]+wt;
                }


            }
        }
    }
    for(int i=0;i<graph.length;i++){
        System.out.print(dis[i]+ " ");
    }
}

 public class Pair implements Comparable<Pair>{
    int v;
    int cost;
    Pair(int v , int cost){
        this.v= v;
        this.cost=cost;
    }
    @Override
    public int compareTo (Pair p2){
        return this.cost- p2.cost;
    }
}

public static void prims(ArrayList<edge> graph[], int src){
    boolean vis[]= new boolean[graph.length];
    PriorityQueue<Pair> pq= new PriorityQueue<>();
    pq.add(new Pair(0, 0));
    int totcost=0;
     while(!pq.isEmpty()){
        Pair curr= pq.remove();
        if(!vis[curr.v]){
            vis[curr.v]=true;
            for(int i=0;i<graph[curr.v].size();i++){
                edge e= graph[curr.v].get(i);
                pq.add(new Pair(e.dest,e.wt));
            }
        }
     }

}
    public static void main(String[] args) {
       

      
        int v=6;
        ArrayList<edge> graph[]= new ArrayList[v];
        createGraph(graph);
        printpath(graph, 5, 1, "");
        // dijkistra(graph, 0);
        // belman(graph, 0);
        prims(graph, 0);
    //   boolean isvis[]=new boolean[v];
    // topologicalbfs(graph);
    //  System.out.println( cycle(graph));
    //     // bfsutil(graph,0,isvis);
    //     bfs(graph);
    //     System.out.println();
    //     System.out.println("====");
        
    //    dfs(graph);

        // System.out.println(haspath(graph, 0, 4, isvis));

    }
}