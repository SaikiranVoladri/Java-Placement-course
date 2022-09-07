public class basicclassesandobjects {
    public static void main(String args[]){
        Pen p1=new Pen();// called pen method/function using constructer
        p1.setcolor("blue");// passed value using .operater
        System.out.println(p1.color);
        //p1.setthickness(5);
        p1.thickness=5;
        System.out.println(p1.thickness);
    }
    
}
class Pen{// class names must and should start with capital letters
    String color;
    int thickness;
    void setcolor(String newcolor){// function name start with small letters
        color=newcolor;
    }
    void setthickness(int newthickness){
        thickness=newthickness;
    }

}
