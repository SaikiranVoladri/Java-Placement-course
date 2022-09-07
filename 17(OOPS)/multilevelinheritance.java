public class multilevelinheritance {
    public static void main(String args[]){
    beer b1 = new beer();
    b1.eatsflesh();
    b1.eatsplant();
    
    }
}
interface carnivore{
    void eatsflesh();
}
interface herbivore{
    void eatsplant();
}
class beer implements carnivore,herbivore{
    public void eatsflesh(){
        System.out.println("carnivore eats");
    }
    public void eatsplant(){
        System.out.println(" herbivore eats");
    }

}


