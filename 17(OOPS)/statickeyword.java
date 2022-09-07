public class statickeyword {
    public static void main(String args[]){
        Student s1=new Student();
        s1.schoolname="parul";
        Student s2= new Student();
        System.out.println(s2.schoolname);


    }
    
}
class Student{
    int roll;
    String name;
    static  String schoolname;// static is acceseble(same) for all the objects/functions/blocks/nestedclasses

    void setname(String name){
        this.name=name;
    }

    String getname(){
        return this.name;
    }

}
