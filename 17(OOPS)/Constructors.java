public class Constructors {
    public static void main(String args[]){
        Student s1 = new Student("sai",20);
        System.out.println(s1.name);
        System.out.println(s1.age);     
      }
    
}
class Student {
    String name;
    int age;

    Student(String name,int age){// constructor
       // System.out.println("comstructer is called");
        this.name =name;
        this.age=age;
    }
}
