public class Singleinheritance {
    public static void main(String args[]){
        //no need to create parent class object they are already derived
        mammals man=new mammals();
        man.eats();
        man.breathe();
        man.redblood();
        man.leglength();
    }
    
}
// base or parent class
class Animal{
    String name;
    void eats(){
        System.out.println("Animal eats");
    }
    void breathe(){
        System.out.println("animal breathes");
    }

}
// child or derived or sub class
class mammals extends Animal{//EXTENDS is the keyword used to derive patrent class properties into subclass
    void redblood(){
        System.out.println("contains redblood");
    }
    void leglength(){
        System.out.println("contains differnt leg lengths");
    }


}