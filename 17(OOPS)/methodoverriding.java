public class methodoverriding {
    public static void main(String args[]){
        cow c1=new cow();// cat eats() over rides the animal eats()
        c1.eats();
        

    }   
}
class animal{
    void eats(){
        System.out.println("eats everything");
    }
}
class cow extends animal{//method overrides
    void eats(){
        System.out.println("eats grass");
    }
}
