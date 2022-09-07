public class abstractclassconstructorcalling {
    
    public static void main(String args[]){
     breed b1 = new breed();   
    }
}  

abstract class Animal{// parent class
    Animal(){
        System.out.println("Animal constructer is called");
    }    
    
}
 class horse extends Animal{//derrived class
    horse(){
        System.out.println("horse constructer is called");
    }
}
class breed extends horse{//child class
      breed(){
         System.out.println("breed constructer is called");
     } 

}

