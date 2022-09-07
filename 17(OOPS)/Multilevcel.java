public class Multilevcel {
    public static void main(String args[]){
    dog d1= new dog();
    d1.eats();
    d1.blood();
    d1.breed="gold";
    System.out.println(d1.breed);

    }
    
}
class animal{
    String color;
    void eats(){
        System.out.println("eats");
    }
}
class mammal extends animal{
    void blood(){
        System.out.println("contains redblood");
    }
}
class dog extends mammal{
    String breed;
}