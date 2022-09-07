import javax.swing.event.ChangeEvent;

public class Accessspecifiers {
    public static void main(String args[]){
        Mybankaccount mba= new Mybankaccount();
        mba.username="saikiran";
       
     String n=mba.changepass("abc");
     System.out.println(n);
        System.out.println(mba.username);
      //  System.out.println(mba.changepass());

    }
    
}
class Mybankaccount{
     public String username;
     private String password;// private specifier cannot be accesed by main function
    public String changepass(String pass){
       return  password=pass;

    }
}
