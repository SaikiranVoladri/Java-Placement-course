// multiple inhreritance is possible by using interface
public class interfaces{
    public static void main(String args[]){
        king k1= new king();
        k1.moves();
    }

}
interface chessmoves{
    void moves();
}
class queen implements  chessmoves{
     public void moves(){
        System.out.println(" Queen moves ");
    }

}
class king implements chessmoves{
    public void moves(){
        System.out.println("king moves");
    }
}