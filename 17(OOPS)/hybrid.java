import javax.sql.rowset.spi.SyncResolver;

public class hybrid {
    public static void main(String args[]){
        shark s1= new shark();
        s1.biggills();
        s1.eats();
        whale w1= new whale();
        w1.bigbody();
        w1.eats();
        peackok p1= new peackok();
        p1.beautiful();
        p1.eats();
        dog d1= new dog();
        d1.bark();
        d1.eats();
        cat c1= new cat();
        c1.meow();
        c1.eats();
    }
    
}
class animal{
    void eats(){
        System.out.println("eats");
    }
}
class  fish extends animal{
    void swim(){
        System.out.println("swims");
    }
}
class bird extends animal{
    void fly(){
        System.out.println("fly");
    }

}
class mammal extends animal{
    void blood(){
        System.out.println("red blood");
    }
}
class shark extends fish{
    void biggills(){
        System.out.println(" shark big gills");
    }
}
class whale extends fish{
    void bigbody(){
        System.out.println(" whale big body");

    }
}
class peackok extends bird{
    void beautiful(){
        System.out.println("beautifull feathers");
    }
}
class dog extends mammal{
    void bark(){
        System.out.println("dog barks");
    }
}
class cat extends mammal{
    void meow(){
        System.out.println("cat meows");
    }
}