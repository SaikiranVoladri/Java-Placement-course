public class abstractclass {
    public static void main(String args[]){
        horse h=new horse();
        h.eats();
        h.walks();
            
        hen h1= new hen();
        h1.eats();
        h1.walks();

        
    }
    
}
abstract class Animal{// parent class
    void eats(){
        System.out.println("animals eats");
    }
    abstract void walks();// abstract  method has idea but not implementation
}
 class horse extends Animal{//derrived class
    void walks(){
        System.out.println("walks with 4 legs");// implementation
    }

 }
class hen extends Animal{// derived class
    void walks(){
        System.out.println("walks with 2 legs");// implementation
    }
}