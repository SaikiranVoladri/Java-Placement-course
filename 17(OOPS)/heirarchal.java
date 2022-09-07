public class heirarchal {
    public static void main(String args[]){
    bird b1= new bird();
    b1.eats();
    b1.fly();
    fish f1 = new fish();
    f1.eats();
    f1.swim();   
    }
    
}
class animal{ // parent class
    String color;
    void eats(){
        System.out.println("eats");
    }
}
class mammal extends animal{ // derrived class  from parent
    void blood(){
        System.out.println("contains redblood");
    }
}
class fish extends animal{// derived class from parent
   void swim(){
    System.out.println("swims");
   }
}
class bird extends animal{// derived class from parent
    void fly(){
        System.out.println("fly");
    }
}
