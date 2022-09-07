public class Getters {
    public static void main(String args[]){
        Pen p1=new Pen();
        p1.Setcolor("blue");
        System.out.println(p1.Getcolor());
        p1.Settip(5);
        System.out.println(p1.Gettip());


    }  
}

class Pen{
     private String color;
     private int tip;

    String Getcolor(){
        return this.color;
    }
    int Gettip(){
        return this.tip;
    }

   void Setcolor(String newcolor){
        this.color=newcolor;
    }

    void Settip(int newtip){
        this.tip=newtip;
    }

}