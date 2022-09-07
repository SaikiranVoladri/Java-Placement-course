public class superkeyword {
    public static void main(String args[]){
        horse h2=new horse();
       System.out.println(h2.color);

    }
    
}
class animal{
    String color;
    animal(){
        System.out.println("animal constructer is called");
    }
}
class horse extends animal{
  
    horse(){
        super.color="brown";
        System.out.println("horse constructer is called");
    }
}
