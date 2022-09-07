public class copyconstructers {
    public static void main(String args[]){
        Student s1= new Student();
        s1.name="sai";
        s1.age=20;
        s1.marks[0]=0;
        s1.marks[1]=1;
        s1.marks[2]=2;

        Student s2=new Student(s1);
        //System.out.println(s2.name+s2.age);
        s2.marks[2]=3;
        for(int i=0;i<3;i++){
            System.out.println(s2.marks[i]);
        }
  }
    
}
class Student{
    String name;
    int age;
    int marks[];
    Student(){// non parameterised constructer
        marks=new int[3];
           }

    Student(Student s1){// parameterized constructer
        marks=new int [3];
        this.name= s1.name;
        this.age=s1.age;
        this.marks=s1.marks;
    }  
}
